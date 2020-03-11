package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsTreatmentShenfenzhengHg;
import com.taikang.jkx.model.HiomsTreatmentShenfenzhengHgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsTreatmentShenfenzhengHgDAO {
    long countByExample(HiomsTreatmentShenfenzhengHgExample example);

    int deleteByExample(HiomsTreatmentShenfenzhengHgExample example);

    int insert(HiomsTreatmentShenfenzhengHg record);

    int insertSelective(HiomsTreatmentShenfenzhengHg record);

    List<HiomsTreatmentShenfenzhengHg> selectByExample(HiomsTreatmentShenfenzhengHgExample example);

    int updateByExampleSelective(@Param("record") HiomsTreatmentShenfenzhengHg record, @Param("example") HiomsTreatmentShenfenzhengHgExample example);

    int updateByExample(@Param("record") HiomsTreatmentShenfenzhengHg record, @Param("example") HiomsTreatmentShenfenzhengHgExample example);
}