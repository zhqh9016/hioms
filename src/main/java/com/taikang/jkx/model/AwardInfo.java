package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * award_info
 * @author 
 */
public class AwardInfo implements Serializable {
    private String aid;

    private String keyName;

    private Integer infoOrder;

    private static final long serialVersionUID = 1L;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Integer getInfoOrder() {
        return infoOrder;
    }

    public void setInfoOrder(Integer infoOrder) {
        this.infoOrder = infoOrder;
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
        AwardInfo other = (AwardInfo) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getKeyName() == null ? other.getKeyName() == null : this.getKeyName().equals(other.getKeyName()))
            && (this.getInfoOrder() == null ? other.getInfoOrder() == null : this.getInfoOrder().equals(other.getInfoOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        result = prime * result + ((getInfoOrder() == null) ? 0 : getInfoOrder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", keyName=").append(keyName);
        sb.append(", infoOrder=").append(infoOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}