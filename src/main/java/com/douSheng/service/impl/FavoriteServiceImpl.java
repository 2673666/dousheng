package com.douSheng.service.impl;

import com.douSheng.mapper.FavouriteMapper;
import com.douSheng.mapper.VideoMapper;
import com.douSheng.pojo.Favorite;
import com.douSheng.pojo.Video;
import com.douSheng.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/15 -21:36
 */
@Service
public class FavoriteServiceImpl implements FavoriteService
{
    @Autowired(required = false)
    private FavouriteMapper favouriteMapper;
    @Autowired(required = false)
    private VideoMapper videoMapper;

//    点赞
    @Override
    public int action(long uid, int vid, String type) {
        byte isFavorite = 2;//取消点赞
        if(type.equals("1")){
            isFavorite = 1;//点赞
        }
        Favorite favorite = new Favorite();
        favorite.setUid(uid);
        Date date = new Date();
        favorite.setCreateTime(date);
        favorite.setUpdateTime(date);
        favorite.setVid((long) vid);
        favorite.setIsFavourite(isFavorite);
        //点赞表中无数据则返回 0
        long id = favouriteMapper.selectByUVId(uid, vid);
        if(id != 0){
            favorite.setId(id);
            return favouriteMapper.updateByPrimaryKey(favorite);
        }
//
        return favouriteMapper.insertSelective(favorite);
    }

    @Override
    public List<Video> getFavoriteList(long uid) {
        return videoMapper.selectFavoriteListById(uid);
    }


    @Override
    public long isFavorite(long uid, long vid) {
//        返回 0 就是 不存在数据，也就是 没有点赞
        return favouriteMapper.selectByUVId(uid,vid);
    }
}
