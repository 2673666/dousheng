package com.douSheng.service;

import com.douSheng.pojo.Video;

import java.util.Date;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -10:05
 */
public interface VideoService {
//    feed流：查询传入日期以前所有发布视频,并按时间倒序排序
    List<Video> getVideos(Date date);
//    视频投稿
    int publish(String userName,Video video);
//    根据用户 id查询用户的视频
    List<Video> getVideosById(int id);
//    更新视频的喜欢数量
    void updateFavorite (long vid,String type);
//    更新视频的评论数量
    void updateComment(long vid);
}
