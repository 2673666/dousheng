package com.douSheng.service;

import com.douSheng.pojo.Video;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -10:05
 */
public interface VideoService {
    List<Video> getVideos(long uid);//feed流：查询所有视频

    int publish(String userName,Video video);//视频投稿

    List<Video> getVideosById(int id);//查询用户的视频
}
