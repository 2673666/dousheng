package com.douSheng.service;

import com.douSheng.pojo.Comment;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/16 -21:02
 */
public interface CommentService {
    int comment(Comment comment);

    int deleteById(long cId);

    List<Comment> selectCommentsByVid(long vid);
}
