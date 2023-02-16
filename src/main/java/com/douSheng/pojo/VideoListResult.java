package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhiyuan
 * @date 2023/2/10 -16:54
 */
@NoArgsConstructor
@Data
public class VideoListResult {

    @JsonProperty("status_code")
    private Integer statusCode;
    @JsonProperty("status_msg")
    private String statusMsg;
    @JsonProperty("next_time")
    private Integer nextTime;
    @JsonProperty("video_list")
    private List<Video> videoList;
}
