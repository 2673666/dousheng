package com.douSheng.service.impl;

import com.douSheng.mapper.UserMapper;
import com.douSheng.mapper.VideoMapper;
import com.douSheng.pojo.Video;
import com.douSheng.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -10:06
 */

@Service //业务层注解
public class VideoServiceImpl implements VideoService {
    @Autowired(required = false)
    private VideoMapper videoMapper;

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<Video> getVideos(Date date) {
        return videoMapper.selectAllVideos(date);
    }

    @Override
    public int publish(String userName, Video video) {
        long uid = userMapper.selectIdByName(userName);
        video.setUid(uid);
        return videoMapper.insertSelective(video);

    }

    @Override
    public List<Video> getVideosById(int uid) {
        return videoMapper.getVideosById(uid);
    }

    @Override
    public void updateFavorite(long vid, String type) {
        int update = 0;
        if (type.equals("1")) {//点赞
            update = 1;
        }
        else if (type.equals("2"))
            update = -1;
        videoMapper.updateFavorite(vid,update);
    }

    @Override
    public void updateComment(long vid) {
        videoMapper.updateComment(vid);
    }
}
