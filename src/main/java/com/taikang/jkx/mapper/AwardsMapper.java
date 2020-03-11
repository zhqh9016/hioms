package com.taikang.jkx.mapper;

import com.taikang.jkx.model.Awards;
import com.taikang.jkx.model.AwardsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AwardsMapper {
    long countByExample(AwardsExample example);

    int deleteByExample(AwardsExample example);

    int insert(Awards record);

    int insertSelective(Awards record);

    List<Awards> selectByExample(AwardsExample example);

    int updateByExampleSelective(@Param("record") Awards record, @Param("example") AwardsExample example);

    int updateByExample(@Param("record") Awards record, @Param("example") AwardsExample example);
}