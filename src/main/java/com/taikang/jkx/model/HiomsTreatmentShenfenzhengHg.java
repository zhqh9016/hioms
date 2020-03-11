package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * hioms_treatment_shenfenzheng_hg
 * @author 
 */
public class HiomsTreatmentShenfenzhengHg implements Serializable {
    /**
     * 身份证号
     */
    private String shenfenzheng;

    private static final long serialVersionUID = 1L;

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
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
        HiomsTreatmentShenfenzhengHg other = (HiomsTreatmentShenfenzhengHg) that;
        return (this.getShenfenzheng() == null ? other.getShenfenzheng() == null : this.getShenfenzheng().equals(other.getShenfenzheng()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShenfenzheng() == null) ? 0 : getShenfenzheng().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shenfenzheng=").append(shenfenzheng);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}