package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsTreatmentHg;
import com.taikang.jkx.model.HiomsTreatmentHgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsTreatmentHgDAO {
    long countByExample(HiomsTreatmentHgExample example);

    int deleteByExample(HiomsTreatmentHgExample example);

    int deleteByPrimaryKey(String jiuzhenbianhao);

    int insert(HiomsTreatmentHg record);

    int insertSelective(HiomsTreatmentHg record);

    List<HiomsTreatmentHg> selectByExample(HiomsTreatmentHgExample example);

    HiomsTreatmentHg selectByPrimaryKey(String jiuzhenbianhao);

    int updateByExampleSelective(@Param("record") HiomsTreatmentHg record, @Param("example") HiomsTreatmentHgExample example);

    int updateByExample(@Param("record") HiomsTreatmentHg record, @Param("example") HiomsTreatmentHgExample example);

    int updateByPrimaryKeySelective(HiomsTreatmentHg record);

    int updateByPrimaryKey(HiomsTreatmentHg record);
}