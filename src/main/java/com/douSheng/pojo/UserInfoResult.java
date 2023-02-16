package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author zhiyuan
 * @date 2023/2/11 -17:12
 */
// UserResult.java


@Data
public class UserInfoResult {
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
    /**
     * 用户信息
     */
    private User user;
}


