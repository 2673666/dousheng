package com.douSheng.mapper;

import com.douSheng.pojo.Video;
import com.douSheng.pojo.VideoExample;
import com.douSheng.pojo.VideoWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VideoWithBLOBs record);

    int insertSelective(Video record);

    List<VideoWithBLOBs> selectByExampleWithBLOBs(VideoExample example);

    List<Video> selectByExample(VideoExample example);

    VideoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExampleWithBLOBs(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(VideoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VideoWithBLOBs record);

    int updateByPrimaryKey(Video record);
//  查询所有视频
    List<Video> selectAllVideos();
//  查询特定用户的所有视频
    List<Video> getVideosById(int uid);
//  查询特定用户的所有喜欢列表
    List<Video> selectFavoriteListById(long uid);
}