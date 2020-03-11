package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class HiomsCbr implements Serializable {
    private Integer id;

    /**
     * 身份证号
     */
    private String cbrIdCard;

    /**
     * 社保卡
     */
    private String cbrSocityNumber;

    /**
     * 参保人姓名
     */
    private String cbrName;

    /**
     * 性别(1,男 0,女)
     */
    private Integer sex;

    private Date birthday;

    /**
     * 统筹区
     */
    private String groupCountyId;

    /**
     * 统筹区名称
     */
    private String groupCountyName;

    /**
     * 市级机构ID
     */
    private String groupCityId;

    /**
     * 市级机构名称
     */
    private String groupCityName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCbrIdCard() {
        return cbrIdCard;
    }

    public void setCbrIdCard(String cbrIdCard) {
        this.cbrIdCard = cbrIdCard;
    }

    public String getCbrSocityNumber() {
        return cbrSocityNumber;
    }

    public void setCbrSocityNumber(String cbrSocityNumber) {
        this.cbrSocityNumber = cbrSocityNumber;
    }

    public String getCbrName() {
        return cbrName;
    }

    public void setCbrName(String cbrName) {
        this.cbrName = cbrName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGroupCountyId() {
        return groupCountyId;
    }

    public void setGroupCountyId(String groupCountyId) {
        this.groupCountyId = groupCountyId;
    }

    public String getGroupCountyName() {
        return groupCountyName;
    }

    public void setGroupCountyName(String groupCountyName) {
        this.groupCountyName = groupCountyName;
    }

    public String getGroupCityId() {
        return groupCityId;
    }

    public void setGroupCityId(String groupCityId) {
        this.groupCityId = groupCityId;
    }

    public String getGroupCityName() {
        return groupCityName;
    }

    public void setGroupCityName(String groupCityName) {
        this.groupCityName = groupCityName;
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
        HiomsCbr other = (HiomsCbr) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCbrIdCard() == null ? other.getCbrIdCard() == null : this.getCbrIdCard().equals(other.getCbrIdCard()))
            && (this.getCbrSocityNumber() == null ? other.getCbrSocityNumber() == null : this.getCbrSocityNumber().equals(other.getCbrSocityNumber()))
            && (this.getCbrName() == null ? other.getCbrName() == null : this.getCbrName().equals(other.getCbrName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getGroupCountyId() == null ? other.getGroupCountyId() == null : this.getGroupCountyId().equals(other.getGroupCountyId()))
            && (this.getGroupCountyName() == null ? other.getGroupCountyName() == null : this.getGroupCountyName().equals(other.getGroupCountyName()))
            && (this.getGroupCityId() == null ? other.getGroupCityId() == null : this.getGroupCityId().equals(other.getGroupCityId()))
            && (this.getGroupCityName() == null ? other.getGroupCityName() == null : this.getGroupCityName().equals(other.getGroupCityName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCbrIdCard() == null) ? 0 : getCbrIdCard().hashCode());
        result = prime * result + ((getCbrSocityNumber() == null) ? 0 : getCbrSocityNumber().hashCode());
        result = prime * result + ((getCbrName() == null) ? 0 : getCbrName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getGroupCountyId() == null) ? 0 : getGroupCountyId().hashCode());
        result = prime * result + ((getGroupCountyName() == null) ? 0 : getGroupCountyName().hashCode());
        result = prime * result + ((getGroupCityId() == null) ? 0 : getGroupCityId().hashCode());
        result = prime * result + ((getGroupCityName() == null) ? 0 : getGroupCityName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cbrIdCard=").append(cbrIdCard);
        sb.append(", cbrSocityNumber=").append(cbrSocityNumber);
        sb.append(", cbrName=").append(cbrName);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", groupCountyId=").append(groupCountyId);
        sb.append(", groupCountyName=").append(groupCountyName);
        sb.append(", groupCityId=").append(groupCityId);
        sb.append(", groupCityName=").append(groupCityName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}