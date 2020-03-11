package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class HiomsTreatment implements Serializable {
    /**
     * 就诊编号
     */
    private String treatmentNumber;

    private Integer serialNo;

    /**
     * 0,否;1,是
     */
    private String isPay;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 社保卡号
     */
    private String socialCard;

    /**
     * 基本医保结算时间
     */
    private Date settleTime;

    /**
     * 参保人姓名
     */
    private String insuredPerson;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 1,个人;2,医疗机构;3,医保机构
     */
    private Integer payTarget;

    /**
     * 总费用
     */
    private Float totalFee;

    /**
     * 统筹支付,基本医保支付
     */
    private Float planFee;

    /**
     * 非医保费用
     */
    private Float outPlanFee;

    /**
     * 起付线
     */
    private Float startFeeLine;

    /**
     * 特殊自付
     */
    private Float specialPaySelf;

    /**
     * 本次进入大病费用
     */
    private Float insideLargeFee;

    /**
     * 大额赔付
     */
    private Float largeFee;

    /**
     * 大病实际支付
     */
    private Float largeFeeConfirm;

    /**
     * 巡查ID
     */
    private String patrolId;

    /**
     * 调查进度(0、未发起调查；1、待执行；2、已执行;3、已结案；)
     */
    private Integer patrolStatus;

    /**
     * 调查结论(0、阴性；1、阳性)
     */
    private Integer patrolResult;

    /**
     * 回访ID
     */
    private String returnVisitId;

    /**
     * 回访状态(0、未回访；1、回访成功；2、未查账；3、不满意)
     */
    private String returnVisitStatus;

    /**
     * 统筹区编码
     */
    private String groupId;

    /**
     * 统筹区名称
     */
    private String groupName;

    /**
     * 是否有效
     */
    private Integer valid;

    /**
     * 同名同姓的人的个数
     */
    private Integer repeatNameNum;

    private static final long serialVersionUID = 1L;

    public String getTreatmentNumber() {
        return treatmentNumber;
    }

    public void setTreatmentNumber(String treatmentNumber) {
        this.treatmentNumber = treatmentNumber;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getSocialCard() {
        return socialCard;
    }

    public void setSocialCard(String socialCard) {
        this.socialCard = socialCard;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public String getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(String insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getPayTarget() {
        return payTarget;
    }

    public void setPayTarget(Integer payTarget) {
        this.payTarget = payTarget;
    }

    public Float getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Float totalFee) {
        this.totalFee = totalFee;
    }

    public Float getPlanFee() {
        return planFee;
    }

    public void setPlanFee(Float planFee) {
        this.planFee = planFee;
    }

    public Float getOutPlanFee() {
        return outPlanFee;
    }

    public void setOutPlanFee(Float outPlanFee) {
        this.outPlanFee = outPlanFee;
    }

    public Float getStartFeeLine() {
        return startFeeLine;
    }

    public void setStartFeeLine(Float startFeeLine) {
        this.startFeeLine = startFeeLine;
    }

    public Float getSpecialPaySelf() {
        return specialPaySelf;
    }

    public void setSpecialPaySelf(Float specialPaySelf) {
        this.specialPaySelf = specialPaySelf;
    }

    public Float getInsideLargeFee() {
        return insideLargeFee;
    }

    public void setInsideLargeFee(Float insideLargeFee) {
        this.insideLargeFee = insideLargeFee;
    }

    public Float getLargeFee() {
        return largeFee;
    }

    public void setLargeFee(Float largeFee) {
        this.largeFee = largeFee;
    }

    public Float getLargeFeeConfirm() {
        return largeFeeConfirm;
    }

    public void setLargeFeeConfirm(Float largeFeeConfirm) {
        this.largeFeeConfirm = largeFeeConfirm;
    }

    public String getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(String patrolId) {
        this.patrolId = patrolId;
    }

    public Integer getPatrolStatus() {
        return patrolStatus;
    }

    public void setPatrolStatus(Integer patrolStatus) {
        this.patrolStatus = patrolStatus;
    }

    public Integer getPatrolResult() {
        return patrolResult;
    }

    public void setPatrolResult(Integer patrolResult) {
        this.patrolResult = patrolResult;
    }

    public String getReturnVisitId() {
        return returnVisitId;
    }

    public void setReturnVisitId(String returnVisitId) {
        this.returnVisitId = returnVisitId;
    }

    public String getReturnVisitStatus() {
        return returnVisitStatus;
    }

    public void setReturnVisitStatus(String returnVisitStatus) {
        this.returnVisitStatus = returnVisitStatus;
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

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getRepeatNameNum() {
        return repeatNameNum;
    }

    public void setRepeatNameNum(Integer repeatNameNum) {
        this.repeatNameNum = repeatNameNum;
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
        HiomsTreatment other = (HiomsTreatment) that;
        return (this.getTreatmentNumber() == null ? other.getTreatmentNumber() == null : this.getTreatmentNumber().equals(other.getTreatmentNumber()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getIsPay() == null ? other.getIsPay() == null : this.getIsPay().equals(other.getIsPay()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getSocialCard() == null ? other.getSocialCard() == null : this.getSocialCard().equals(other.getSocialCard()))
            && (this.getSettleTime() == null ? other.getSettleTime() == null : this.getSettleTime().equals(other.getSettleTime()))
            && (this.getInsuredPerson() == null ? other.getInsuredPerson() == null : this.getInsuredPerson().equals(other.getInsuredPerson()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getPayTarget() == null ? other.getPayTarget() == null : this.getPayTarget().equals(other.getPayTarget()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getPlanFee() == null ? other.getPlanFee() == null : this.getPlanFee().equals(other.getPlanFee()))
            && (this.getOutPlanFee() == null ? other.getOutPlanFee() == null : this.getOutPlanFee().equals(other.getOutPlanFee()))
            && (this.getStartFeeLine() == null ? other.getStartFeeLine() == null : this.getStartFeeLine().equals(other.getStartFeeLine()))
            && (this.getSpecialPaySelf() == null ? other.getSpecialPaySelf() == null : this.getSpecialPaySelf().equals(other.getSpecialPaySelf()))
            && (this.getInsideLargeFee() == null ? other.getInsideLargeFee() == null : this.getInsideLargeFee().equals(other.getInsideLargeFee()))
            && (this.getLargeFee() == null ? other.getLargeFee() == null : this.getLargeFee().equals(other.getLargeFee()))
            && (this.getLargeFeeConfirm() == null ? other.getLargeFeeConfirm() == null : this.getLargeFeeConfirm().equals(other.getLargeFeeConfirm()))
            && (this.getPatrolId() == null ? other.getPatrolId() == null : this.getPatrolId().equals(other.getPatrolId()))
            && (this.getPatrolStatus() == null ? other.getPatrolStatus() == null : this.getPatrolStatus().equals(other.getPatrolStatus()))
            && (this.getPatrolResult() == null ? other.getPatrolResult() == null : this.getPatrolResult().equals(other.getPatrolResult()))
            && (this.getReturnVisitId() == null ? other.getReturnVisitId() == null : this.getReturnVisitId().equals(other.getReturnVisitId()))
            && (this.getReturnVisitStatus() == null ? other.getReturnVisitStatus() == null : this.getReturnVisitStatus().equals(other.getReturnVisitStatus()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getRepeatNameNum() == null ? other.getRepeatNameNum() == null : this.getRepeatNameNum().equals(other.getRepeatNameNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTreatmentNumber() == null) ? 0 : getTreatmentNumber().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getIsPay() == null) ? 0 : getIsPay().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getSocialCard() == null) ? 0 : getSocialCard().hashCode());
        result = prime * result + ((getSettleTime() == null) ? 0 : getSettleTime().hashCode());
        result = prime * result + ((getInsuredPerson() == null) ? 0 : getInsuredPerson().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getPayTarget() == null) ? 0 : getPayTarget().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getPlanFee() == null) ? 0 : getPlanFee().hashCode());
        result = prime * result + ((getOutPlanFee() == null) ? 0 : getOutPlanFee().hashCode());
        result = prime * result + ((getStartFeeLine() == null) ? 0 : getStartFeeLine().hashCode());
        result = prime * result + ((getSpecialPaySelf() == null) ? 0 : getSpecialPaySelf().hashCode());
        result = prime * result + ((getInsideLargeFee() == null) ? 0 : getInsideLargeFee().hashCode());
        result = prime * result + ((getLargeFee() == null) ? 0 : getLargeFee().hashCode());
        result = prime * result + ((getLargeFeeConfirm() == null) ? 0 : getLargeFeeConfirm().hashCode());
        result = prime * result + ((getPatrolId() == null) ? 0 : getPatrolId().hashCode());
        result = prime * result + ((getPatrolStatus() == null) ? 0 : getPatrolStatus().hashCode());
        result = prime * result + ((getPatrolResult() == null) ? 0 : getPatrolResult().hashCode());
        result = prime * result + ((getReturnVisitId() == null) ? 0 : getReturnVisitId().hashCode());
        result = prime * result + ((getReturnVisitStatus() == null) ? 0 : getReturnVisitStatus().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getRepeatNameNum() == null) ? 0 : getRepeatNameNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", treatmentNumber=").append(treatmentNumber);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", isPay=").append(isPay);
        sb.append(", payTime=").append(payTime);
        sb.append(", socialCard=").append(socialCard);
        sb.append(", settleTime=").append(settleTime);
        sb.append(", insuredPerson=").append(insuredPerson);
        sb.append(", idCard=").append(idCard);
        sb.append(", payTarget=").append(payTarget);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", planFee=").append(planFee);
        sb.append(", outPlanFee=").append(outPlanFee);
        sb.append(", startFeeLine=").append(startFeeLine);
        sb.append(", specialPaySelf=").append(specialPaySelf);
        sb.append(", insideLargeFee=").append(insideLargeFee);
        sb.append(", largeFee=").append(largeFee);
        sb.append(", largeFeeConfirm=").append(largeFeeConfirm);
        sb.append(", patrolId=").append(patrolId);
        sb.append(", patrolStatus=").append(patrolStatus);
        sb.append(", patrolResult=").append(patrolResult);
        sb.append(", returnVisitId=").append(returnVisitId);
        sb.append(", returnVisitStatus=").append(returnVisitStatus);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", valid=").append(valid);
        sb.append(", repeatNameNum=").append(repeatNameNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}