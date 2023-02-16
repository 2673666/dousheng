package com.douSheng.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FavoriteListResult {
    /**
     * 状态码，0-成功，其他值-失败
     */
    @JsonProperty("status_code")
    private String statusCode;
    /**
     * 返回状态描述
     */
    @JsonProperty("status_msg")
    private String statusMsg = "fail";
    /**
     * 用户点赞视频列表
     */
    @JsonProperty("video_list")
    private List<Video> videoList;
}

