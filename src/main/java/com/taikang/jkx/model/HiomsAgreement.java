package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hioms_agreement
 * @author 
 */
public class HiomsAgreement implements Serializable {
    /**
     * 协议id
     */
    private String agreementId;

    /**
     * 协议名称
     */
    private String agreementName;

    /**
     * 协议签订时间
     */
    private Date agreementSigntime;

    /**
     * 协议甲方
     */
    private String agreementFirstPart;

    /**
     * 乙方
     */
    private String agreementPartb;

    /**
     * 协议生效开始日期
     */
    private Date agreementStarttime;

    /**
     * 协议生效结束时间
     */
    private Date agreementEndtime;

    /**
     * 经办人
     */
    private String agreementResponsible;

    /**
     * 原件存放地
     */
    private String agreementPlace;

    /**
     * 附件ID
     */
    private String agreementEnclosureId;

    /**
     * 生效前是否提醒,1,提醒;0,不提醒
     */
    private Integer isRemind;

    /**
     * 提前提醒天数
     */
    private Integer remindDay;

    /**
     * 协议所属机构ID
     */
    private String groupId;

    /**
     * 协议所属机构名称
     */
    private String groupName;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否有效,1,有效；0，无效
     */
    private Integer valid;

    private static final long serialVersionUID = 1L;

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public Date getAgreementSigntime() {
        return agreementSigntime;
    }

    public void setAgreementSigntime(Date agreementSigntime) {
        this.agreementSigntime = agreementSigntime;
    }

    public String getAgreementFirstPart() {
        return agreementFirstPart;
    }

    public void setAgreementFirstPart(String agreementFirstPart) {
        this.agreementFirstPart = agreementFirstPart;
    }

    public String getAgreementPartb() {
        return agreementPartb;
    }

    public void setAgreementPartb(String agreementPartb) {
        this.agreementPartb = agreementPartb;
    }

    public Date getAgreementStarttime() {
        return agreementStarttime;
    }

    public void setAgreementStarttime(Date agreementStarttime) {
        this.agreementStarttime = agreementStarttime;
    }

    public Date getAgreementEndtime() {
        return agreementEndtime;
    }

    public void setAgreementEndtime(Date agreementEndtime) {
        this.agreementEndtime = agreementEndtime;
    }

    public String getAgreementResponsible() {
        return agreementResponsible;
    }

    public void setAgreementResponsible(String agreementResponsible) {
        this.agreementResponsible = agreementResponsible;
    }

    public String getAgreementPlace() {
        return agreementPlace;
    }

    public void setAgreementPlace(String agreementPlace) {
        this.agreementPlace = agreementPlace;
    }

    public String getAgreementEnclosureId() {
        return agreementEnclosureId;
    }

    public void setAgreementEnclosureId(String agreementEnclosureId) {
        this.agreementEnclosureId = agreementEnclosureId;
    }

    public Integer getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(Integer isRemind) {
        this.isRemind = isRemind;
    }

    public Integer getRemindDay() {
        return remindDay;
    }

    public void setRemindDay(Integer remindDay) {
        this.remindDay = remindDay;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        HiomsAgreement other = (HiomsAgreement) that;
        return (this.getAgreementId() == null ? other.getAgreementId() == null : this.getAgreementId().equals(other.getAgreementId()))
            && (this.getAgreementName() == null ? other.getAgreementName() == null : this.getAgreementName().equals(other.getAgreementName()))
            && (this.getAgreementSigntime() == null ? other.getAgreementSigntime() == null : this.getAgreementSigntime().equals(other.getAgreementSigntime()))
            && (this.getAgreementFirstPart() == null ? other.getAgreementFirstPart() == null : this.getAgreementFirstPart().equals(other.getAgreementFirstPart()))
            && (this.getAgreementPartb() == null ? other.getAgreementPartb() == null : this.getAgreementPartb().equals(other.getAgreementPartb()))
            && (this.getAgreementStarttime() == null ? other.getAgreementStarttime() == null : this.getAgreementStarttime().equals(other.getAgreementStarttime()))
            && (this.getAgreementEndtime() == null ? other.getAgreementEndtime() == null : this.getAgreementEndtime().equals(other.getAgreementEndtime()))
            && (this.getAgreementResponsible() == null ? other.getAgreementResponsible() == null : this.getAgreementResponsible().equals(other.getAgreementResponsible()))
            && (this.getAgreementPlace() == null ? other.getAgreementPlace() == null : this.getAgreementPlace().equals(other.getAgreementPlace()))
            && (this.getAgreementEnclosureId() == null ? other.getAgreementEnclosureId() == null : this.getAgreementEnclosureId().equals(other.getAgreementEnclosureId()))
            && (this.getIsRemind() == null ? other.getIsRemind() == null : this.getIsRemind().equals(other.getIsRemind()))
            && (this.getRemindDay() == null ? other.getRemindDay() == null : this.getRemindDay().equals(other.getRemindDay()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        result = prime * result + ((getAgreementName() == null) ? 0 : getAgreementName().hashCode());
        result = prime * result + ((getAgreementSigntime() == null) ? 0 : getAgreementSigntime().hashCode());
        result = prime * result + ((getAgreementFirstPart() == null) ? 0 : getAgreementFirstPart().hashCode());
        result = prime * result + ((getAgreementPartb() == null) ? 0 : getAgreementPartb().hashCode());
        result = prime * result + ((getAgreementStarttime() == null) ? 0 : getAgreementStarttime().hashCode());
        result = prime * result + ((getAgreementEndtime() == null) ? 0 : getAgreementEndtime().hashCode());
        result = prime * result + ((getAgreementResponsible() == null) ? 0 : getAgreementResponsible().hashCode());
        result = prime * result + ((getAgreementPlace() == null) ? 0 : getAgreementPlace().hashCode());
        result = prime * result + ((getAgreementEnclosureId() == null) ? 0 : getAgreementEnclosureId().hashCode());
        result = prime * result + ((getIsRemind() == null) ? 0 : getIsRemind().hashCode());
        result = prime * result + ((getRemindDay() == null) ? 0 : getRemindDay().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agreementId=").append(agreementId);
        sb.append(", agreementName=").append(agreementName);
        sb.append(", agreementSigntime=").append(agreementSigntime);
        sb.append(", agreementFirstPart=").append(agreementFirstPart);
        sb.append(", agreementPartb=").append(agreementPartb);
        sb.append(", agreementStarttime=").append(agreementStarttime);
        sb.append(", agreementEndtime=").append(agreementEndtime);
        sb.append(", agreementResponsible=").append(agreementResponsible);
        sb.append(", agreementPlace=").append(agreementPlace);
        sb.append(", agreementEnclosureId=").append(agreementEnclosureId);
        sb.append(", isRemind=").append(isRemind);
        sb.append(", remindDay=").append(remindDay);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", valid=").append(valid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}