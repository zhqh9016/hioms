package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * award_temp
 * @author 
 */
public class AwardTemp implements Serializable {
    private String awardInfoName;

    private static final long serialVersionUID = 1L;

    public String getAwardInfoName() {
        return awardInfoName;
    }

    public void setAwardInfoName(String awardInfoName) {
        this.awardInfoName = awardInfoName;
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
        AwardTemp other = (AwardTemp) that;
        return (this.getAwardInfoName() == null ? other.getAwardInfoName() == null : this.getAwardInfoName().equals(other.getAwardInfoName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAwardInfoName() == null) ? 0 : getAwardInfoName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", awardInfoName=").append(awardInfoName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}