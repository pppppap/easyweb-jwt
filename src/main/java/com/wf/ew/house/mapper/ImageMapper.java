package com.wf.ew.house.mapper;

import com.wf.ew.house.entity.Image;
import com.wf.ew.house.entity.ImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {
    int countByExample(ImageExample example);

    int deleteByExample(ImageExample example);

    int insert(Image record);

    int insertSelective(Image record);

    List<Image> selectByExample(ImageExample example);

    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageExample example);

    int updateByExample(@Param("record") Image record, @Param("example") ImageExample example);
}