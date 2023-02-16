package com.douSheng.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @JsonIgnore
    private String password;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("follow_count")
    private Integer followCount;
    @JsonProperty("follower_count")
    private Integer followerCount;
    @JsonProperty("is_follow")
    private Boolean isFollow;

    public User() {
    }

    public User(String password, String name) {
        this.password = password;
        this.name = name;

    }
}