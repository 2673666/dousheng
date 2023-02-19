package com.douSheng.mapper;

import com.douSheng.pojo.Video;

import java.util.Date;
import java.util.List;

public interface VideoMapper {

    int deleteByPrimaryKey(Long id);

    int insertSelective(Video record);

    int updateByPrimaryKey(Video record);
//  查询所有视频
    List<Video> selectAllVideos(Date date);
//  查询特定用户的所有视频
    List<Video> getVideosById(int uid);
//  查询特定用户的所有喜欢列表
    List<Video> selectFavoriteListById(long uid);
//  更新视频喜欢数
    void updateFavorite(long vid,int update);
//  更新视频评论数量
    void updateComment(long id);
}