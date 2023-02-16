package com.douSheng.mapper;

import com.douSheng.pojo.Favorite;
import com.douSheng.pojo.FavouriteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavouriteMapper {
    int countByExample(FavouriteExample example);

    int deleteByExample(FavouriteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    List<Favorite> selectByExample(FavouriteExample example);

    Favorite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Favorite record, @Param("example") FavouriteExample example);

    int updateByExample(@Param("record") Favorite record, @Param("example") FavouriteExample example);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);

    long selectByUVId(long uid,long vid);

}