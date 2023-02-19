package com.douSheng.mapper;

import com.douSheng.pojo.Comment;

import java.util.List;

public interface CommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
//  根据视频 id 查询评论列表
    List<Comment> selectCommentsByVid(long vid);
}