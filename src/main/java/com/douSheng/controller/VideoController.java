package com.douSheng.controller;

import com.douSheng.pojo.Result;
import com.douSheng.pojo.User;
import com.douSheng.pojo.Video;
import com.douSheng.pojo.VideoListResult;
import com.douSheng.service.UserService;
import com.douSheng.service.VideoService;
import com.douSheng.util.GetCoverUtil;
import com.douSheng.util.ParseUrlUtil;
import com.douSheng.util.PathUtil;
import com.douSheng.util.TokenUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * @author zhiyuan
 * @date 2023/2/9 -9:31
 */
@RequestMapping("/douyin")
@RestController
public class VideoController {
    @Autowired
    private VideoService videoService;
    @Autowired(required = false)
    private UserService userService;

//    刷视频
    @GetMapping("/feed")
    public VideoListResult feed(@RequestParam(value = "token",required = false) String token) throws UnknownHostException {
        long uid = -1;
        if(token != null){
            String[] split = token.split(":");
            TokenUtils.createToken(new User(split[0],split[1]));
            //        用户 id
            uid = userService.selectIdByName(token.split(":")[0]);
        }
        List<Video> videos = videoService.getVideos(uid);
        List<Video> videos1 = ParseUrlUtil.parseUrl(videos);
        VideoListResult v = new VideoListResult();
        v.setVideoList(videos1);
        v.setNextTime(0);
        v.setStatusCode(0);
        v.setStatusMsg("更新列表成功");

        return v;
    }

//    视频投稿
    @PostMapping("/publish/action/")
    public Result publish(@Param("data") MultipartFile data, String token, String title) throws Exception {
        Result res = new Result();
        res.setStatusMsg("视频发布失败");
        //        token鉴权
        boolean legal = TokenUtils.verify(token);
        if (legal) {
            //        获取文件名
            String name = data.getOriginalFilename();
//        静态资源目录路径
            String path = new PathUtil().getPath();
//        创建临时文件存储视频
            File tmp = new File(path + name);
            if (!tmp.exists()) {
                try {
                    tmp.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//        视频写入本地文件
            data.transferTo(tmp);
//        对视频文件进行重命名(防止视频名称冲突导致覆盖存入)
            String uuid = UUID.randomUUID().toString();
            String newName = uuid + ".mp4";
            File file = new File(path + newName);
            boolean flag = false;
            if (!file.exists()) {
                flag = tmp.renameTo(file);
            }
//        重命名成功
            if (flag) {
                Video video = new Video();
                video.setPlayUrl(newName);
//                SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
                video.setCreateTime(new Date());
                video.setUpdateTime(new Date());
                video.setTitle(title);
                String coverUrl = uuid+".jpg";
                GetCoverUtil.fetchPic(file,path+coverUrl);
                video.setCoverUrl(coverUrl);
                String[] split = token.split(":");
                String userName = split[0];
                int suc = videoService.publish(userName, video);
                if(suc == 1){
                    res.setStatusCode(200);
                    res.setStatusMsg("发布成功");
                }

            }
        }
        return res;
    }

//    查询特定用户投稿视频列表
    @GetMapping("/publish/list/")
    public VideoListResult list(String token,@RequestParam("user_id") String uid) throws UnknownHostException {
        VideoListResult videoListResult = new VideoListResult();
        videoListResult.setStatusMsg("查询失败，请重试");
        videoListResult.setStatusCode(1);
        if(!TokenUtils.verify(token)){
            return videoListResult;
        }
        List<Video> videos = videoService.getVideosById(Integer.parseInt(uid));
        List<Video> videos1 = ParseUrlUtil.parseUrl(videos);
        if(!videos.isEmpty()){
            videoListResult.setVideoList(videos1);
            videoListResult.setStatusCode(0);
            videoListResult.setStatusMsg("success");
        }
        return videoListResult;
    }


}
