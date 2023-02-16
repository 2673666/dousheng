package com.douSheng.controller;

import com.douSheng.pojo.FavoriteListResult;
import com.douSheng.pojo.Result;
import com.douSheng.pojo.Video;
import com.douSheng.service.FavoriteService;
import com.douSheng.service.UserService;
import com.douSheng.util.ParseUrlUtil;
import com.douSheng.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/15 -21:18
 */
@RestController
@RequestMapping("/douyin/favorite")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;
    @Autowired(required = false)
    private UserService userService;

//    用户个人喜欢列表
    @RequestMapping("/list")
    public FavoriteListResult getFavoriteList(@RequestParam("user_id")String uid,String token) throws UnknownHostException {
        boolean verify = TokenUtils.verify(token);
        FavoriteListResult res = new FavoriteListResult();
        if(!verify)
            return res;
        List<Video> favoriteList = favoriteService.getFavoriteList(Integer.parseInt(uid));
        List<Video> videos = ParseUrlUtil.parseUrl(favoriteList);
        res.setVideoList(videos);
        res.setStatusMsg("0");
        res.setStatusMsg("success");

        return res;
    }



//    点赞
    @PostMapping("/action")
    public Result action(String token,
                       @RequestParam("video_id")String vid,
                       @RequestParam("action_type")String type){

        Result res = new Result();
        if(!TokenUtils.verify(token))
        {
                return res;
        }
        String[] split = token.split(":");
        String uname = split[0];
//        通过 token 中的用户名来查询用户 id
        long uid = userService.selectIdByName(uname);
        int suc = favoriteService.action(uid, Integer.parseInt(vid), type);
        if(suc!=0){
            res.setStatusCode(0);
            res.setStatusMsg("success");
        }

        return res;
    }

}
