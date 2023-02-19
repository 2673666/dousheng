package com.douSheng.mapper;

import com.douSheng.pojo.Favorite;

public interface FavouriteMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);

    long selectByUVId(long uid,long vid);

}