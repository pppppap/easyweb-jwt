package com.wf.ew.house.mapper;

import com.wf.ew.house.entity.Follow;
import com.wf.ew.house.entity.FollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowMapper {
    int countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExample(FollowExample example);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);
}