package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsAgreement;
import com.taikang.jkx.model.HiomsAgreementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsAgreementMapper {
    long countByExample(HiomsAgreementExample example);

    int deleteByExample(HiomsAgreementExample example);

    int deleteByPrimaryKey(String agreementId);

    int insert(HiomsAgreement record);

    int insertSelective(HiomsAgreement record);

    List<HiomsAgreement> selectByExample(HiomsAgreementExample example);

    HiomsAgreement selectByPrimaryKey(String agreementId);

    int updateByExampleSelective(@Param("record") HiomsAgreement record, @Param("example") HiomsAgreementExample example);

    int updateByExample(@Param("record") HiomsAgreement record, @Param("example") HiomsAgreementExample example);

    int updateByPrimaryKeySelective(HiomsAgreement record);

    int updateByPrimaryKey(HiomsAgreement record);
}