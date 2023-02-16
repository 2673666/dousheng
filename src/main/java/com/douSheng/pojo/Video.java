package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

import java.util.Date;

@Data
public class Video {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("author")
    private User user;
    @JsonProperty("play_url")
    private String playUrl;
    @JsonProperty("cover_url")
    private String coverUrl;
    @JsonProperty("favorite_count")
    private Integer favouriteCount;
    @JsonProperty("comment_count")
    private Integer commentCount;
    @JsonProperty("is_favorite")
    private Boolean isFavourite;
    @JsonProperty("title")
    private String title;

    @Ignore
    private Long uid;
    @Ignore
    private Date createTime;
    @Ignore
    private Date updateTime;
//    @Ignore
//    private User user;//一视频对应一个用户

}