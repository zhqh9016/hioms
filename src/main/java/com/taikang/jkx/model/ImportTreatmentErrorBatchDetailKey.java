package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ImportTreatmentErrorBatchDetailKey implements Serializable {
    private String batchNumber;

    private String treatmentNumber;

    private static final long serialVersionUID = 1L;

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getTreatmentNumber() {
        return treatmentNumber;
    }

    public void setTreatmentNumber(String treatmentNumber) {
        this.treatmentNumber = treatmentNumber;
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
        ImportTreatmentErrorBatchDetailKey other = (ImportTreatmentErrorBatchDetailKey) that;
        return (this.getBatchNumber() == null ? other.getBatchNumber() == null : this.getBatchNumber().equals(other.getBatchNumber()))
            && (this.getTreatmentNumber() == null ? other.getTreatmentNumber() == null : this.getTreatmentNumber().equals(other.getTreatmentNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBatchNumber() == null) ? 0 : getBatchNumber().hashCode());
        result = prime * result + ((getTreatmentNumber() == null) ? 0 : getTreatmentNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", batchNumber=").append(batchNumber);
        sb.append(", treatmentNumber=").append(treatmentNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}