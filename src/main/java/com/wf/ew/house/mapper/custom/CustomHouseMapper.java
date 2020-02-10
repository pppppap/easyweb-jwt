package com.wf.ew.house.mapper.custom;

import com.wf.ew.house.entity.HouseExample;
import com.wf.ew.house.entity.vo.HouseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomHouseMapper {
    int isExists(@Param("houseName") String houseName,
                 @Param("housePlace") String housePlace,
                 @Param("houseUnit") String houseUnit,
                 @Param("houseNumber") String houseNumber);

    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseVo record);

    int insertSelective(HouseVo record);

    List<HouseVo> selectByExample(HouseExample example);

    HouseVo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseVo record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") HouseVo record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(HouseVo record);

    int updateByPrimaryKey(HouseVo record);
}
