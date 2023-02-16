package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhiyuan
 * @date 2023/2/11 -10:01
 */
@NoArgsConstructor
@Data
public class RegisterResult {
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
     * 用户id
     */
    @JsonProperty("user_id")
    private long userid;
    /**
     * 用户鉴权token
     */
    @JsonProperty("token")
    private String token;



}
