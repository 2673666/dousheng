package com.douSheng.pojo;

import java.util.Date;

public class Follow {
    private Long id;

    private Long myUid;

    private Long hisUid;

    private Byte isFollow;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMyUid() {
        return myUid;
    }

    public void setMyUid(Long myUid) {
        this.myUid = myUid;
    }

    public Long getHisUid() {
        return hisUid;
    }

    public void setHisUid(Long hisUid) {
        this.hisUid = hisUid;
    }

    public Byte getIsFollow() {
        return isFollow;
    }

    public void setIsFollow(Byte isFollow) {
        this.isFollow = isFollow;
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