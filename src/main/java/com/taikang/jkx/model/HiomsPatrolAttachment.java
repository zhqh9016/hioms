package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class HiomsPatrolAttachment implements Serializable {
    /**
     * 附件ID
     */
    private String attachmentId;

    /**
     * 巡查ID
     */
    private String patrolId;

    /**
     * 就诊编号
     */
    private String treatmentNumber;

    /**
     * 附件来源(0、发起人上传；1、执行人上传)
     */
    private Integer source;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件类型(例如txt/jpg/jpeg等)
     */
    private String fileType;

    /**
     * 是否有效 1、有效；0、无效；
     */
    private Integer valid;

    private static final long serialVersionUID = 1L;

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
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
        HiomsPatrolAttachment other = (HiomsPatrolAttachment) that;
        return (this.getAttachmentId() == null ? other.getAttachmentId() == null : this.getAttachmentId().equals(other.getAttachmentId()))
            && (this.getPatrolId() == null ? other.getPatrolId() == null : this.getPatrolId().equals(other.getPatrolId()))
            && (this.getTreatmentNumber() == null ? other.getTreatmentNumber() == null : this.getTreatmentNumber().equals(other.getTreatmentNumber()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        result = prime * result + ((getPatrolId() == null) ? 0 : getPatrolId().hashCode());
        result = prime * result + ((getTreatmentNumber() == null) ? 0 : getTreatmentNumber().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attachmentId=").append(attachmentId);
        sb.append(", patrolId=").append(patrolId);
        sb.append(", treatmentNumber=").append(treatmentNumber);
        sb.append(", source=").append(source);
        sb.append(", filePath=").append(filePath);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileType=").append(fileType);
        sb.append(", valid=").append(valid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}