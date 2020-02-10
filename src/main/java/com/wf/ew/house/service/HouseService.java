package com.wf.ew.house.service;

import com.wf.ew.house.mapper.custom.CustomHouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    @Autowired
    private CustomHouseMapper customHouseMapper;

    public boolean isExists(String houseName, String housePlace, String houseUnit, String houseNumber) {
        return customHouseMapper.isExists(houseName, housePlace, houseUnit, houseNumber) > 0;
    }
}
