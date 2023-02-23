package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
@Data
public class Comment {
    private Long id;

    private Long vid;

    private Long uid;

    @JsonProperty("create_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

    private String content;

    private User user;


}