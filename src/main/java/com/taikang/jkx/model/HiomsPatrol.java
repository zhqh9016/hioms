package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class HiomsPatrol implements Serializable {
    /**
     * 巡查任务唯一标识
     */
    private String patrolId;

    /**
     * 就诊编号
     */
    private String treatmentNumber;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 委派人
     */
    private String creator;

    /**
     * 委托人所属组织
     */
    private String creatorGroupId;

    /**
     * 执行时间
     */
    private Date updateTime;

    /**
     * 执行人登录名
     */
    private String updator;

    /**
     * 被委派岗位
     */
    private String trusteePositionId;

    /**
     * 当前状态(0、未发起调查；1、待执行；2、已执行；3、已结案)
     */
    private Integer status;

    /**
     * 结案定性(0、阴性；1、阳性)
     */
    private Integer nature;

    /**
     * 巡查结果描述
     */
    private String executeDescription;

    /**
     * 发起调查的原因
     */
    private String description;

    /**
     * 是否有效(0、无效；1、有效)
     */
    private Integer valid;

    private static final long serialVersionUID = 1L;

    public String getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(String patrolId) {
        this.patrolId = patrolId;
    }

    public String getTreatmentNumber() {
        return treatmentNumber;
    }

    public void setTreatmentNumber(String treatmentNumber) {
        this.treatmentNumber = treatmentNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorGroupId() {
        return creatorGroupId;
    }

    public void setCreatorGroupId(String creatorGroupId) {
        this.creatorGroupId = creatorGroupId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getTrusteePositionId() {
        return trusteePositionId;
    }

    public void setTrusteePositionId(String trusteePositionId) {
        this.trusteePositionId = trusteePositionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public String getExecuteDescription() {
        return executeDescription;
    }

    public void setExecuteDescription(String executeDescription) {
        this.executeDescription = executeDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HiomsPatrol other = (HiomsPatrol) that;
        return (this.getPatrolId() == null ? other.getPatrolId() == null : this.getPatrolId().equals(other.getPatrolId()))
            && (this.getTreatmentNumber() == null ? other.getTreatmentNumber() == null : this.getTreatmentNumber().equals(other.getTreatmentNumber()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreatorGroupId() == null ? other.getCreatorGroupId() == null : this.getCreatorGroupId().equals(other.getCreatorGroupId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdator() == null ? other.getUpdator() == null : this.getUpdator().equals(other.getUpdator()))
            && (this.getTrusteePositionId() == null ? other.getTrusteePositionId() == null : this.getTrusteePositionId().equals(other.getTrusteePositionId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getNature() == null ? other.getNature() == null : this.getNature().equals(other.getNature()))
            && (this.getExecuteDescription() == null ? other.getExecuteDescription() == null : this.getExecuteDescription().equals(other.getExecuteDescription()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatrolId() == null) ? 0 : getPatrolId().hashCode());
        result = prime * result + ((getTreatmentNumber() == null) ? 0 : getTreatmentNumber().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreatorGroupId() == null) ? 0 : getCreatorGroupId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdator() == null) ? 0 : getUpdator().hashCode());
        result = prime * result + ((getTrusteePositionId() == null) ? 0 : getTrusteePositionId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNature() == null) ? 0 : getNature().hashCode());
        result = prime * result + ((getExecuteDescription() == null) ? 0 : getExecuteDescription().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patrolId=").append(patrolId);
        sb.append(", treatmentNumber=").append(treatmentNumber);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", creatorGroupId=").append(creatorGroupId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updator=").append(updator);
        sb.append(", trusteePositionId=").append(trusteePositionId);
        sb.append(", status=").append(status);
        sb.append(", nature=").append(nature);
        sb.append(", executeDescription=").append(executeDescription);
        sb.append(", description=").append(description);
        sb.append(", valid=").append(valid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}