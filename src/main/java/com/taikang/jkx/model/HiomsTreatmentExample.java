package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiomsTreatmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HiomsTreatmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTreatmentNumberIsNull() {
            addCriterion("treatment_number is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberIsNotNull() {
            addCriterion("treatment_number is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberEqualTo(String value) {
            addCriterion("treatment_number =", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberNotEqualTo(String value) {
            addCriterion("treatment_number <>", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberGreaterThan(String value) {
            addCriterion("treatment_number >", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("treatment_number >=", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberLessThan(String value) {
            addCriterion("treatment_number <", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberLessThanOrEqualTo(String value) {
            addCriterion("treatment_number <=", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberLike(String value) {
            addCriterion("treatment_number like", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberNotLike(String value) {
            addCriterion("treatment_number not like", value, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberIn(List<String> values) {
            addCriterion("treatment_number in", values, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberNotIn(List<String> values) {
            addCriterion("treatment_number not in", values, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberBetween(String value1, String value2) {
            addCriterion("treatment_number between", value1, value2, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andTreatmentNumberNotBetween(String value1, String value2) {
            addCriterion("treatment_number not between", value1, value2, "treatmentNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(Integer value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(Integer value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(Integer value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(Integer value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(Integer value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<Integer> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<Integer> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(Integer value1, Integer value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(String value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(String value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(String value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(String value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(String value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(String value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLike(String value) {
            addCriterion("is_pay like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotLike(String value) {
            addCriterion("is_pay not like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<String> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<String> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(String value1, String value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(String value1, String value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSocialCardIsNull() {
            addCriterion("social_card is null");
            return (Criteria) this;
        }

        public Criteria andSocialCardIsNotNull() {
            addCriterion("social_card is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCardEqualTo(String value) {
            addCriterion("social_card =", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardNotEqualTo(String value) {
            addCriterion("social_card <>", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardGreaterThan(String value) {
            addCriterion("social_card >", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardGreaterThanOrEqualTo(String value) {
            addCriterion("social_card >=", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardLessThan(String value) {
            addCriterion("social_card <", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardLessThanOrEqualTo(String value) {
            addCriterion("social_card <=", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardLike(String value) {
            addCriterion("social_card like", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardNotLike(String value) {
            addCriterion("social_card not like", value, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardIn(List<String> values) {
            addCriterion("social_card in", values, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardNotIn(List<String> values) {
            addCriterion("social_card not in", values, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardBetween(String value1, String value2) {
            addCriterion("social_card between", value1, value2, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSocialCardNotBetween(String value1, String value2) {
            addCriterion("social_card not between", value1, value2, "socialCard");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Date value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Date value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Date value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Date value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Date> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Date> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Date value1, Date value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonIsNull() {
            addCriterion("insured_person is null");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonIsNotNull() {
            addCriterion("insured_person is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonEqualTo(String value) {
            addCriterion("insured_person =", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonNotEqualTo(String value) {
            addCriterion("insured_person <>", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonGreaterThan(String value) {
            addCriterion("insured_person >", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonGreaterThanOrEqualTo(String value) {
            addCriterion("insured_person >=", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonLessThan(String value) {
            addCriterion("insured_person <", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonLessThanOrEqualTo(String value) {
            addCriterion("insured_person <=", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonLike(String value) {
            addCriterion("insured_person like", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonNotLike(String value) {
            addCriterion("insured_person not like", value, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonIn(List<String> values) {
            addCriterion("insured_person in", values, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonNotIn(List<String> values) {
            addCriterion("insured_person not in", values, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonBetween(String value1, String value2) {
            addCriterion("insured_person between", value1, value2, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andInsuredPersonNotBetween(String value1, String value2) {
            addCriterion("insured_person not between", value1, value2, "insuredPerson");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPayTargetIsNull() {
            addCriterion("pay_target is null");
            return (Criteria) this;
        }

        public Criteria andPayTargetIsNotNull() {
            addCriterion("pay_target is not null");
            return (Criteria) this;
        }

        public Criteria andPayTargetEqualTo(Integer value) {
            addCriterion("pay_target =", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotEqualTo(Integer value) {
            addCriterion("pay_target <>", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetGreaterThan(Integer value) {
            addCriterion("pay_target >", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_target >=", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetLessThan(Integer value) {
            addCriterion("pay_target <", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetLessThanOrEqualTo(Integer value) {
            addCriterion("pay_target <=", value, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetIn(List<Integer> values) {
            addCriterion("pay_target in", values, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotIn(List<Integer> values) {
            addCriterion("pay_target not in", values, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetBetween(Integer value1, Integer value2) {
            addCriterion("pay_target between", value1, value2, "payTarget");
            return (Criteria) this;
        }

        public Criteria andPayTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_target not between", value1, value2, "payTarget");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Float value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Float value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Float value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Float value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Float value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Float> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Float> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Float value1, Float value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Float value1, Float value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeIsNull() {
            addCriterion("plan_fee is null");
            return (Criteria) this;
        }

        public Criteria andPlanFeeIsNotNull() {
            addCriterion("plan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPlanFeeEqualTo(Float value) {
            addCriterion("plan_fee =", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeNotEqualTo(Float value) {
            addCriterion("plan_fee <>", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeGreaterThan(Float value) {
            addCriterion("plan_fee >", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("plan_fee >=", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeLessThan(Float value) {
            addCriterion("plan_fee <", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeLessThanOrEqualTo(Float value) {
            addCriterion("plan_fee <=", value, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeIn(List<Float> values) {
            addCriterion("plan_fee in", values, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeNotIn(List<Float> values) {
            addCriterion("plan_fee not in", values, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeBetween(Float value1, Float value2) {
            addCriterion("plan_fee between", value1, value2, "planFee");
            return (Criteria) this;
        }

        public Criteria andPlanFeeNotBetween(Float value1, Float value2) {
            addCriterion("plan_fee not between", value1, value2, "planFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeIsNull() {
            addCriterion("out_plan_fee is null");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeIsNotNull() {
            addCriterion("out_plan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeEqualTo(Float value) {
            addCriterion("out_plan_fee =", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeNotEqualTo(Float value) {
            addCriterion("out_plan_fee <>", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeGreaterThan(Float value) {
            addCriterion("out_plan_fee >", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("out_plan_fee >=", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeLessThan(Float value) {
            addCriterion("out_plan_fee <", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeLessThanOrEqualTo(Float value) {
            addCriterion("out_plan_fee <=", value, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeIn(List<Float> values) {
            addCriterion("out_plan_fee in", values, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeNotIn(List<Float> values) {
            addCriterion("out_plan_fee not in", values, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeBetween(Float value1, Float value2) {
            addCriterion("out_plan_fee between", value1, value2, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andOutPlanFeeNotBetween(Float value1, Float value2) {
            addCriterion("out_plan_fee not between", value1, value2, "outPlanFee");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineIsNull() {
            addCriterion("start_fee_line is null");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineIsNotNull() {
            addCriterion("start_fee_line is not null");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineEqualTo(Float value) {
            addCriterion("start_fee_line =", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineNotEqualTo(Float value) {
            addCriterion("start_fee_line <>", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineGreaterThan(Float value) {
            addCriterion("start_fee_line >", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineGreaterThanOrEqualTo(Float value) {
            addCriterion("start_fee_line >=", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineLessThan(Float value) {
            addCriterion("start_fee_line <", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineLessThanOrEqualTo(Float value) {
            addCriterion("start_fee_line <=", value, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineIn(List<Float> values) {
            addCriterion("start_fee_line in", values, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineNotIn(List<Float> values) {
            addCriterion("start_fee_line not in", values, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineBetween(Float value1, Float value2) {
            addCriterion("start_fee_line between", value1, value2, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andStartFeeLineNotBetween(Float value1, Float value2) {
            addCriterion("start_fee_line not between", value1, value2, "startFeeLine");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfIsNull() {
            addCriterion("special_pay_self is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfIsNotNull() {
            addCriterion("special_pay_self is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfEqualTo(Float value) {
            addCriterion("special_pay_self =", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfNotEqualTo(Float value) {
            addCriterion("special_pay_self <>", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfGreaterThan(Float value) {
            addCriterion("special_pay_self >", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfGreaterThanOrEqualTo(Float value) {
            addCriterion("special_pay_self >=", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfLessThan(Float value) {
            addCriterion("special_pay_self <", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfLessThanOrEqualTo(Float value) {
            addCriterion("special_pay_self <=", value, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfIn(List<Float> values) {
            addCriterion("special_pay_self in", values, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfNotIn(List<Float> values) {
            addCriterion("special_pay_self not in", values, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfBetween(Float value1, Float value2) {
            addCriterion("special_pay_self between", value1, value2, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andSpecialPaySelfNotBetween(Float value1, Float value2) {
            addCriterion("special_pay_self not between", value1, value2, "specialPaySelf");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeIsNull() {
            addCriterion("inside_large_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeIsNotNull() {
            addCriterion("inside_large_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeEqualTo(Float value) {
            addCriterion("inside_large_fee =", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeNotEqualTo(Float value) {
            addCriterion("inside_large_fee <>", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeGreaterThan(Float value) {
            addCriterion("inside_large_fee >", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("inside_large_fee >=", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeLessThan(Float value) {
            addCriterion("inside_large_fee <", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeLessThanOrEqualTo(Float value) {
            addCriterion("inside_large_fee <=", value, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeIn(List<Float> values) {
            addCriterion("inside_large_fee in", values, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeNotIn(List<Float> values) {
            addCriterion("inside_large_fee not in", values, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeBetween(Float value1, Float value2) {
            addCriterion("inside_large_fee between", value1, value2, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andInsideLargeFeeNotBetween(Float value1, Float value2) {
            addCriterion("inside_large_fee not between", value1, value2, "insideLargeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeIsNull() {
            addCriterion("large_fee is null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeIsNotNull() {
            addCriterion("large_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeEqualTo(Float value) {
            addCriterion("large_fee =", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNotEqualTo(Float value) {
            addCriterion("large_fee <>", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeGreaterThan(Float value) {
            addCriterion("large_fee >", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("large_fee >=", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeLessThan(Float value) {
            addCriterion("large_fee <", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeLessThanOrEqualTo(Float value) {
            addCriterion("large_fee <=", value, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeIn(List<Float> values) {
            addCriterion("large_fee in", values, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNotIn(List<Float> values) {
            addCriterion("large_fee not in", values, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeBetween(Float value1, Float value2) {
            addCriterion("large_fee between", value1, value2, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNotBetween(Float value1, Float value2) {
            addCriterion("large_fee not between", value1, value2, "largeFee");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmIsNull() {
            addCriterion("large_fee_confirm is null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmIsNotNull() {
            addCriterion("large_fee_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmEqualTo(Float value) {
            addCriterion("large_fee_confirm =", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmNotEqualTo(Float value) {
            addCriterion("large_fee_confirm <>", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmGreaterThan(Float value) {
            addCriterion("large_fee_confirm >", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmGreaterThanOrEqualTo(Float value) {
            addCriterion("large_fee_confirm >=", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmLessThan(Float value) {
            addCriterion("large_fee_confirm <", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmLessThanOrEqualTo(Float value) {
            addCriterion("large_fee_confirm <=", value, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmIn(List<Float> values) {
            addCriterion("large_fee_confirm in", values, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmNotIn(List<Float> values) {
            addCriterion("large_fee_confirm not in", values, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmBetween(Float value1, Float value2) {
            addCriterion("large_fee_confirm between", value1, value2, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andLargeFeeConfirmNotBetween(Float value1, Float value2) {
            addCriterion("large_fee_confirm not between", value1, value2, "largeFeeConfirm");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIsNull() {
            addCriterion("patrol_id is null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIsNotNull() {
            addCriterion("patrol_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolIdEqualTo(String value) {
            addCriterion("patrol_id =", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotEqualTo(String value) {
            addCriterion("patrol_id <>", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThan(String value) {
            addCriterion("patrol_id >", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_id >=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThan(String value) {
            addCriterion("patrol_id <", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLessThanOrEqualTo(String value) {
            addCriterion("patrol_id <=", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdLike(String value) {
            addCriterion("patrol_id like", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotLike(String value) {
            addCriterion("patrol_id not like", value, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdIn(List<String> values) {
            addCriterion("patrol_id in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotIn(List<String> values) {
            addCriterion("patrol_id not in", values, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdBetween(String value1, String value2) {
            addCriterion("patrol_id between", value1, value2, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolIdNotBetween(String value1, String value2) {
            addCriterion("patrol_id not between", value1, value2, "patrolId");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusIsNull() {
            addCriterion("patrol_status is null");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusIsNotNull() {
            addCriterion("patrol_status is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusEqualTo(Integer value) {
            addCriterion("patrol_status =", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusNotEqualTo(Integer value) {
            addCriterion("patrol_status <>", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusGreaterThan(Integer value) {
            addCriterion("patrol_status >", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patrol_status >=", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusLessThan(Integer value) {
            addCriterion("patrol_status <", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusLessThanOrEqualTo(Integer value) {
            addCriterion("patrol_status <=", value, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusIn(List<Integer> values) {
            addCriterion("patrol_status in", values, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusNotIn(List<Integer> values) {
            addCriterion("patrol_status not in", values, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusBetween(Integer value1, Integer value2) {
            addCriterion("patrol_status between", value1, value2, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("patrol_status not between", value1, value2, "patrolStatus");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIsNull() {
            addCriterion("patrol_result is null");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIsNotNull() {
            addCriterion("patrol_result is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolResultEqualTo(Integer value) {
            addCriterion("patrol_result =", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotEqualTo(Integer value) {
            addCriterion("patrol_result <>", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultGreaterThan(Integer value) {
            addCriterion("patrol_result >", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("patrol_result >=", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultLessThan(Integer value) {
            addCriterion("patrol_result <", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultLessThanOrEqualTo(Integer value) {
            addCriterion("patrol_result <=", value, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultIn(List<Integer> values) {
            addCriterion("patrol_result in", values, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotIn(List<Integer> values) {
            addCriterion("patrol_result not in", values, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultBetween(Integer value1, Integer value2) {
            addCriterion("patrol_result between", value1, value2, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andPatrolResultNotBetween(Integer value1, Integer value2) {
            addCriterion("patrol_result not between", value1, value2, "patrolResult");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdIsNull() {
            addCriterion("return_visit_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdIsNotNull() {
            addCriterion("return_visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdEqualTo(String value) {
            addCriterion("return_visit_id =", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdNotEqualTo(String value) {
            addCriterion("return_visit_id <>", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdGreaterThan(String value) {
            addCriterion("return_visit_id >", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdGreaterThanOrEqualTo(String value) {
            addCriterion("return_visit_id >=", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdLessThan(String value) {
            addCriterion("return_visit_id <", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdLessThanOrEqualTo(String value) {
            addCriterion("return_visit_id <=", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdLike(String value) {
            addCriterion("return_visit_id like", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdNotLike(String value) {
            addCriterion("return_visit_id not like", value, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdIn(List<String> values) {
            addCriterion("return_visit_id in", values, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdNotIn(List<String> values) {
            addCriterion("return_visit_id not in", values, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdBetween(String value1, String value2) {
            addCriterion("return_visit_id between", value1, value2, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitIdNotBetween(String value1, String value2) {
            addCriterion("return_visit_id not between", value1, value2, "returnVisitId");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusIsNull() {
            addCriterion("return_visit_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusIsNotNull() {
            addCriterion("return_visit_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusEqualTo(String value) {
            addCriterion("return_visit_status =", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusNotEqualTo(String value) {
            addCriterion("return_visit_status <>", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusGreaterThan(String value) {
            addCriterion("return_visit_status >", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusGreaterThanOrEqualTo(String value) {
            addCriterion("return_visit_status >=", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusLessThan(String value) {
            addCriterion("return_visit_status <", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusLessThanOrEqualTo(String value) {
            addCriterion("return_visit_status <=", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusLike(String value) {
            addCriterion("return_visit_status like", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusNotLike(String value) {
            addCriterion("return_visit_status not like", value, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusIn(List<String> values) {
            addCriterion("return_visit_status in", values, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusNotIn(List<String> values) {
            addCriterion("return_visit_status not in", values, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusBetween(String value1, String value2) {
            addCriterion("return_visit_status between", value1, value2, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andReturnVisitStatusNotBetween(String value1, String value2) {
            addCriterion("return_visit_status not between", value1, value2, "returnVisitStatus");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumIsNull() {
            addCriterion("repeat_name_num is null");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumIsNotNull() {
            addCriterion("repeat_name_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumEqualTo(Integer value) {
            addCriterion("repeat_name_num =", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumNotEqualTo(Integer value) {
            addCriterion("repeat_name_num <>", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumGreaterThan(Integer value) {
            addCriterion("repeat_name_num >", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_name_num >=", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumLessThan(Integer value) {
            addCriterion("repeat_name_num <", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_name_num <=", value, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumIn(List<Integer> values) {
            addCriterion("repeat_name_num in", values, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumNotIn(List<Integer> values) {
            addCriterion("repeat_name_num not in", values, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumBetween(Integer value1, Integer value2) {
            addCriterion("repeat_name_num between", value1, value2, "repeatNameNum");
            return (Criteria) this;
        }

        public Criteria andRepeatNameNumNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_name_num not between", value1, value2, "repeatNameNum");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}