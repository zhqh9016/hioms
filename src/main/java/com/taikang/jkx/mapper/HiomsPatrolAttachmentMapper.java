package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsPatrolAttachment;
import com.taikang.jkx.model.HiomsPatrolAttachmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsPatrolAttachmentMapper {
    long countByExample(HiomsPatrolAttachmentExample example);

    int deleteByExample(HiomsPatrolAttachmentExample example);

    int deleteByPrimaryKey(String attachmentId);

    int insert(HiomsPatrolAttachment record);

    int insertSelective(HiomsPatrolAttachment record);

    List<HiomsPatrolAttachment> selectByExample(HiomsPatrolAttachmentExample example);

    HiomsPatrolAttachment selectByPrimaryKey(String attachmentId);

    int updateByExampleSelective(@Param("record") HiomsPatrolAttachment record, @Param("example") HiomsPatrolAttachmentExample example);

    int updateByExample(@Param("record") HiomsPatrolAttachment record, @Param("example") HiomsPatrolAttachmentExample example);

    int updateByPrimaryKeySelective(HiomsPatrolAttachment record);

    int updateByPrimaryKey(HiomsPatrolAttachment record);
}