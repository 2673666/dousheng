package com.douSheng.service.impl;

import com.douSheng.mapper.CommentMapper;
import com.douSheng.pojo.Comment;
import com.douSheng.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/16 -21:06
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired(required = false)
    private CommentMapper commentMapper;

    @Override
    public int comment(Comment comment) {
        return commentMapper.insertSelective(comment);
    }

    @Override
    public int deleteById(long cId) {
        return commentMapper.deleteByPrimaryKey(cId);
    }

    @Override
    public List<Comment> selectCommentsByVid(long vid) {
        return commentMapper.selectCommentsByVid(vid);
    }
}
