package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class ImportTreatmentErrorBatchDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ImportTreatmentErrorBatchDetailExample() {
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

        public Criteria andBatchNumberIsNull() {
            addCriterion("batch_number is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIsNotNull() {
            addCriterion("batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumberEqualTo(String value) {
            addCriterion("batch_number =", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotEqualTo(String value) {
            addCriterion("batch_number <>", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThan(String value) {
            addCriterion("batch_number >", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("batch_number >=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThan(String value) {
            addCriterion("batch_number <", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("batch_number <=", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberLike(String value) {
            addCriterion("batch_number like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotLike(String value) {
            addCriterion("batch_number not like", value, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberIn(List<String> values) {
            addCriterion("batch_number in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotIn(List<String> values) {
            addCriterion("batch_number not in", values, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberBetween(String value1, String value2) {
            addCriterion("batch_number between", value1, value2, "batchNumber");
            return (Criteria) this;
        }

        public Criteria andBatchNumberNotBetween(String value1, String value2) {
            addCriterion("batch_number not between", value1, value2, "batchNumber");
            return (Criteria) this;
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldIsNull() {
            addCriterion("large_fee_old is null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldIsNotNull() {
            addCriterion("large_fee_old is not null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldEqualTo(Float value) {
            addCriterion("large_fee_old =", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldNotEqualTo(Float value) {
            addCriterion("large_fee_old <>", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldGreaterThan(Float value) {
            addCriterion("large_fee_old >", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldGreaterThanOrEqualTo(Float value) {
            addCriterion("large_fee_old >=", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldLessThan(Float value) {
            addCriterion("large_fee_old <", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldLessThanOrEqualTo(Float value) {
            addCriterion("large_fee_old <=", value, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldIn(List<Float> values) {
            addCriterion("large_fee_old in", values, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldNotIn(List<Float> values) {
            addCriterion("large_fee_old not in", values, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldBetween(Float value1, Float value2) {
            addCriterion("large_fee_old between", value1, value2, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeOldNotBetween(Float value1, Float value2) {
            addCriterion("large_fee_old not between", value1, value2, "largeFeeOld");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewIsNull() {
            addCriterion("large_fee_new is null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewIsNotNull() {
            addCriterion("large_fee_new is not null");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewEqualTo(Float value) {
            addCriterion("large_fee_new =", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewNotEqualTo(Float value) {
            addCriterion("large_fee_new <>", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewGreaterThan(Float value) {
            addCriterion("large_fee_new >", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewGreaterThanOrEqualTo(Float value) {
            addCriterion("large_fee_new >=", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewLessThan(Float value) {
            addCriterion("large_fee_new <", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewLessThanOrEqualTo(Float value) {
            addCriterion("large_fee_new <=", value, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewIn(List<Float> values) {
            addCriterion("large_fee_new in", values, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewNotIn(List<Float> values) {
            addCriterion("large_fee_new not in", values, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewBetween(Float value1, Float value2) {
            addCriterion("large_fee_new between", value1, value2, "largeFeeNew");
            return (Criteria) this;
        }

        public Criteria andLargeFeeNewNotBetween(Float value1, Float value2) {
            addCriterion("large_fee_new not between", value1, value2, "largeFeeNew");
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