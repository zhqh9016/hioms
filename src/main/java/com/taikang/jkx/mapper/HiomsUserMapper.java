package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.HiomsUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsUserMapper {
    long countByExample(HiomsUserExample example);

    int deleteByExample(HiomsUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(HiomsUser record);

    int insertSelective(HiomsUser record);

    List<HiomsUser> selectByExample(HiomsUserExample example);

    HiomsUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") HiomsUser record, @Param("example") HiomsUserExample example);

    int updateByExample(@Param("record") HiomsUser record, @Param("example") HiomsUserExample example);

    int updateByPrimaryKeySelective(HiomsUser record);

    int updateByPrimaryKey(HiomsUser record);
}