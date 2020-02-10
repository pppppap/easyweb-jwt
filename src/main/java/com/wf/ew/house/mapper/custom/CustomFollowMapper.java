package com.wf.ew.house.mapper.custom;

import com.wf.ew.house.entity.Follow;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomFollowMapper {
    List<Follow> selectByHouseId(int houseId);
}