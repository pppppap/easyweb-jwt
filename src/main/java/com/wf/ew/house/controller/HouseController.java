package com.wf.ew.house.controller;

import com.wf.ew.common.JsonResult;
import com.wf.ew.common.exception.ParameterException;
import com.wf.ew.house.entity.House;
import com.wf.ew.house.mapper.HouseMapper;
import com.wf.ew.house.service.HouseService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/house")
@Slf4j
public class HouseController {
    @Autowired
    private HouseService houseService;
    @Autowired
    private HouseMapper houseMapper;

    @GetMapping("/exists")
    public JsonResult exists(String houseName
            , String housePlace
            , String houseUnit
            , String houseNumber) {
        if (StringUtils.isEmpty(houseName) ||
                StringUtils.isEmpty(housePlace) ||
                StringUtils.isEmpty(houseNumber) ||
                StringUtils.isEmpty(houseUnit)) {
            throw new ParameterException();
        }
        boolean exists = houseService.isExists(houseName, housePlace, houseUnit, houseNumber);
        return JsonResult.ok0().data(exists);
    }

    @PostMapping("/save")
    @CrossOrigin
    public JsonResult save(@RequestBody House house) {
        houseMapper.insert(house);
        return JsonResult.ok0();
    }
}
