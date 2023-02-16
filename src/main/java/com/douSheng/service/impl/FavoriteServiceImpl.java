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
        long id = favouriteMapper.selectByUVId(uid, vid);
        if(id != 0){
            favorite.setId(id);
            return favouriteMapper.updateByPrimaryKey(favorite);
        }
        return favouriteMapper.insertSelective(favorite);
    }

    @Override
    public List<Video> getFavoriteList(long uid) {
        return videoMapper.selectFavoriteListById(uid);
    }
}
