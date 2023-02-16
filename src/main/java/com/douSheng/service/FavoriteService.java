package com.douSheng.service;

import com.douSheng.pojo.Video;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/15 -21:35
 */
public interface FavoriteService {
    int action(long uid,int vid,String type);

    List<Video> getFavoriteList(long uid);
}
