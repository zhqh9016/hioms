package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ImportTreatmentErrorBatchDetail extends ImportTreatmentErrorBatchDetailKey implements Serializable {
    private String idCard;

    /**
     * 问题描述
     */
    private String description;

    private Float largeFeeOld;

    private Float largeFeeNew;

    private static final long serialVersionUID = 1L;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getLargeFeeOld() {
        return largeFeeOld;
    }

    public void setLargeFeeOld(Float largeFeeOld) {
        this.largeFeeOld = largeFeeOld;
    }

    public Float getLargeFeeNew() {
        return largeFeeNew;
    }

    public void setLargeFeeNew(Float largeFeeNew) {
        this.largeFeeNew = largeFeeNew;
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
        ImportTreatmentErrorBatchDetail other = (ImportTreatmentErrorBatchDetail) that;
        return (this.getBatchNumber() == null ? other.getBatchNumber() == null : this.getBatchNumber().equals(other.getBatchNumber()))
            && (this.getTreatmentNumber() == null ? other.getTreatmentNumber() == null : this.getTreatmentNumber().equals(other.getTreatmentNumber()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLargeFeeOld() == null ? other.getLargeFeeOld() == null : this.getLargeFeeOld().equals(other.getLargeFeeOld()))
            && (this.getLargeFeeNew() == null ? other.getLargeFeeNew() == null : this.getLargeFeeNew().equals(other.getLargeFeeNew()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBatchNumber() == null) ? 0 : getBatchNumber().hashCode());
        result = prime * result + ((getTreatmentNumber() == null) ? 0 : getTreatmentNumber().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLargeFeeOld() == null) ? 0 : getLargeFeeOld().hashCode());
        result = prime * result + ((getLargeFeeNew() == null) ? 0 : getLargeFeeNew().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idCard=").append(idCard);
        sb.append(", description=").append(description);
        sb.append(", largeFeeOld=").append(largeFeeOld);
        sb.append(", largeFeeNew=").append(largeFeeNew);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}