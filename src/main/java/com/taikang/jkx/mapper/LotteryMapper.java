package com.taikang.jkx.mapper;

import com.taikang.jkx.model.Lottery;
import com.taikang.jkx.model.LotteryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LotteryMapper {
    long countByExample(LotteryExample example);

    int deleteByExample(LotteryExample example);

    int insert(Lottery record);

    int insertSelective(Lottery record);

    List<Lottery> selectByExample(LotteryExample example);

    int updateByExampleSelective(@Param("record") Lottery record, @Param("example") LotteryExample example);

    int updateByExample(@Param("record") Lottery record, @Param("example") LotteryExample example);
}