package com.wf.ew.house.entity;

import java.util.Date;

public class Follow {
    private String content;

    private String registrationMan;

    private Date followTime;

    private Integer houseId;

    private Integer delete;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRegistrationMan() {
        return registrationMan;
    }

    public void setRegistrationMan(String registrationMan) {
        this.registrationMan = registrationMan == null ? null : registrationMan.trim();
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}