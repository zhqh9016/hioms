package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ImportTreatmentBatch implements Serializable {
    /**
     * 批次号
     */
    private String batchNumber;

    /**
     * 创建者
     */
    private String creatorLoginName;

    /**
     * 创建者真实姓名
     */
    private String creatorTrueName;

    /**
     * 上传时间
     */
    private Date createTime;

    /**
     * 上传者所属组织ID
     */
    private String creatorGroupId;

    /**
     * 上传者所属组织名称
     */
    private String creatorGroupName;

    private Integer successNum;

    private Integer errorNum;

    private String manageGroupId;

    private String manageGroupName;

    private static final long serialVersionUID = 1L;

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCreatorLoginName() {
        return creatorLoginName;
    }

    public void setCreatorLoginName(String creatorLoginName) {
        this.creatorLoginName = creatorLoginName;
    }

    public String getCreatorTrueName() {
        return creatorTrueName;
    }

    public void setCreatorTrueName(String creatorTrueName) {
        this.creatorTrueName = creatorTrueName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorGroupId() {
        return creatorGroupId;
    }

    public void setCreatorGroupId(String creatorGroupId) {
        this.creatorGroupId = creatorGroupId;
    }

    public String getCreatorGroupName() {
        return creatorGroupName;
    }

    public void setCreatorGroupName(String creatorGroupName) {
        this.creatorGroupName = creatorGroupName;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public String getManageGroupId() {
        return manageGroupId;
    }

    public void setManageGroupId(String manageGroupId) {
        this.manageGroupId = manageGroupId;
    }

    public String getManageGroupName() {
        return manageGroupName;
    }

    public void setManageGroupName(String manageGroupName) {
        this.manageGroupName = manageGroupName;
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
        ImportTreatmentBatch other = (ImportTreatmentBatch) that;
        return (this.getBatchNumber() == null ? other.getBatchNumber() == null : this.getBatchNumber().equals(other.getBatchNumber()))
            && (this.getCreatorLoginName() == null ? other.getCreatorLoginName() == null : this.getCreatorLoginName().equals(other.getCreatorLoginName()))
            && (this.getCreatorTrueName() == null ? other.getCreatorTrueName() == null : this.getCreatorTrueName().equals(other.getCreatorTrueName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreatorGroupId() == null ? other.getCreatorGroupId() == null : this.getCreatorGroupId().equals(other.getCreatorGroupId()))
            && (this.getCreatorGroupName() == null ? other.getCreatorGroupName() == null : this.getCreatorGroupName().equals(other.getCreatorGroupName()))
            && (this.getSuccessNum() == null ? other.getSuccessNum() == null : this.getSuccessNum().equals(other.getSuccessNum()))
            && (this.getErrorNum() == null ? other.getErrorNum() == null : this.getErrorNum().equals(other.getErrorNum()))
            && (this.getManageGroupId() == null ? other.getManageGroupId() == null : this.getManageGroupId().equals(other.getManageGroupId()))
            && (this.getManageGroupName() == null ? other.getManageGroupName() == null : this.getManageGroupName().equals(other.getManageGroupName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBatchNumber() == null) ? 0 : getBatchNumber().hashCode());
        result = prime * result + ((getCreatorLoginName() == null) ? 0 : getCreatorLoginName().hashCode());
        result = prime * result + ((getCreatorTrueName() == null) ? 0 : getCreatorTrueName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreatorGroupId() == null) ? 0 : getCreatorGroupId().hashCode());
        result = prime * result + ((getCreatorGroupName() == null) ? 0 : getCreatorGroupName().hashCode());
        result = prime * result + ((getSuccessNum() == null) ? 0 : getSuccessNum().hashCode());
        result = prime * result + ((getErrorNum() == null) ? 0 : getErrorNum().hashCode());
        result = prime * result + ((getManageGroupId() == null) ? 0 : getManageGroupId().hashCode());
        result = prime * result + ((getManageGroupName() == null) ? 0 : getManageGroupName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", batchNumber=").append(batchNumber);
        sb.append(", creatorLoginName=").append(creatorLoginName);
        sb.append(", creatorTrueName=").append(creatorTrueName);
        sb.append(", createTime=").append(createTime);
        sb.append(", creatorGroupId=").append(creatorGroupId);
        sb.append(", creatorGroupName=").append(creatorGroupName);
        sb.append(", successNum=").append(successNum);
        sb.append(", errorNum=").append(errorNum);
        sb.append(", manageGroupId=").append(manageGroupId);
        sb.append(", manageGroupName=").append(manageGroupName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}