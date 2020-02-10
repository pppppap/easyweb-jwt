package com.wf.ew.house.entity.vo;

import com.wf.ew.house.entity.Follow;
import com.wf.ew.house.entity.House;

import java.util.List;

public class HouseVo extends House {
    private List<Follow> followList;
    private List<String> imageList;
    private List<String> flagList;

    public List<Follow> getFollowList() {
        return followList;
    }

    public void setFollowList(List<Follow> followList) {
        this.followList = followList;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public List<String> getFlagList() {
        return flagList;
    }

    public void setFlagList(List<String> flagList) {
        this.flagList = flagList;
    }
}
