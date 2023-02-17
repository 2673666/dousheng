package com.douSheng.controller;

import com.douSheng.pojo.Comment;
import com.douSheng.service.CommentService;
import com.douSheng.service.UserService;
import com.douSheng.util.TokenUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/9 -9:31
 */
@RestController
@RequestMapping("/douyin/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired(required = false)
    private UserService userService;

//     查询视频的评论列表
    @RequestMapping("/list")
    public CommentListResult list(
            String token,
            @RequestParam("video_id") String vid
    ){
        CommentListResult result = new CommentListResult();
        List<Comment> comments = commentService.selectCommentsByVid(Long.parseLong(vid));
        result.setCommentList(comments);
        result.setStatusCode(0);
        result.setStatusMsg("success");

        return result;
    }

//    评论列表结果集
    @Data
    public class CommentListResult {
        /**
         * 评论列表
         */
        @JsonProperty("comment_list")
        private List<Comment> commentList;
        /**
         * 状态码，0-成功，其他值-失败
         */
        @JsonProperty("status_code")
        private long statusCode;
        /**
         * 返回状态描述
         */
        @JsonProperty("status_msg")
        private String statusMsg;
    }



    //    评论
    @RequestMapping("/action")
    public CommentResult comment(
            String token,
            @RequestParam("video_id") String vid,
            @RequestParam("action_type") String type,
            @RequestParam(value = "comment_text",required = false) String text,
            @RequestParam(value = "comment_id",required = false) String comId) {

        CommentResult result = new CommentResult();
        if (!TokenUtils.verify(token)) {
            return result;
        }

        String[] trim = token.split(":");
        String uname = trim[0];
        if(type.equals("1")){//发表评论
            Comment comment = new Comment();
            comment.setCreateTime(new Date());
            comment.setVid(Long.parseLong(vid));
            comment.setUid(userService.selectIdByName(uname));
            comment.setContent(text);
            long id = commentService.comment(comment);
            if ((id != 0)){
                result.setStatusMsg("success");
                result.setStatusCode(0);
                comment.setId(id);
                result.setComment(comment);
            }
        }else if(type.equals("2")){//删除评论
            commentService.deleteById(Long.parseLong(comId));
        }
        return result;
    }

}

//评论操作结果集
@Data
class CommentResult {
    /**
     * 评论成功返回评论内容，不需要重新拉取整个列表
     */
    @JsonProperty("comment")
    private Comment comment;
    /**
     * 状态码，0-成功，其他值-失败
     */
    @JsonProperty("status_code")
    private long statusCode;
    /**
     * 返回状态描述
     */
    @JsonProperty("status_msg")
    private String statusMsg = "false";
}

