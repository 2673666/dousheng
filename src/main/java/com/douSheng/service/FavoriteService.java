package com.douSheng.service;

import com.douSheng.pojo.Video;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/15 -21:35
 */
public interface FavoriteService {
//    点赞操作
    int action(long uid,int vid,String type);
//    根据用户 id获取对应的喜欢视频列表
    List<Video> getFavoriteList(long uid);
//    判断 uid对应的用户是否点赞了 vid对应的视频
    long isFavorite(long uid,long vid);

}
