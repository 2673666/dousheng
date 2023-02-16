package com.douSheng.pojo;

import java.util.Date;

public class Favorite {
    private Long id;

    private Long uid;

    private Long vid;

    private Byte isFavourite;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public Byte getIsFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(Byte isFavourite) {
        this.isFavourite = isFavourite;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}