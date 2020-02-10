package com.wf.ew.house.mapper.custom;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomImageMapper {
    List<String> selectByHouseId(int houseId);
}