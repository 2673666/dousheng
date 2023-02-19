package com.douSheng.service;

import com.douSheng.pojo.Comment;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/16 -21:02
 */
public interface CommentService {
//    评论
    int comment(Comment comment);
//    根据评论 id删除评论
    int deleteById(long cId);
//    根据视频 id查询对应的评论
    List<Comment> selectCommentsByVid(long vid);
}
