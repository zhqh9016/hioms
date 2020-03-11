package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class AwardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AwardInfoExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("AID like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("AID not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNull() {
            addCriterion("KEY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNotNull() {
            addCriterion("KEY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNameEqualTo(String value) {
            addCriterion("KEY_NAME =", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotEqualTo(String value) {
            addCriterion("KEY_NAME <>", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThan(String value) {
            addCriterion("KEY_NAME >", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_NAME >=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThan(String value) {
            addCriterion("KEY_NAME <", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThanOrEqualTo(String value) {
            addCriterion("KEY_NAME <=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLike(String value) {
            addCriterion("KEY_NAME like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotLike(String value) {
            addCriterion("KEY_NAME not like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameIn(List<String> values) {
            addCriterion("KEY_NAME in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotIn(List<String> values) {
            addCriterion("KEY_NAME not in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameBetween(String value1, String value2) {
            addCriterion("KEY_NAME between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotBetween(String value1, String value2) {
            addCriterion("KEY_NAME not between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andInfoOrderIsNull() {
            addCriterion("info_order is null");
            return (Criteria) this;
        }

        public Criteria andInfoOrderIsNotNull() {
            addCriterion("info_order is not null");
            return (Criteria) this;
        }

        public Criteria andInfoOrderEqualTo(Integer value) {
            addCriterion("info_order =", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderNotEqualTo(Integer value) {
            addCriterion("info_order <>", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderGreaterThan(Integer value) {
            addCriterion("info_order >", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_order >=", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderLessThan(Integer value) {
            addCriterion("info_order <", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderLessThanOrEqualTo(Integer value) {
            addCriterion("info_order <=", value, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderIn(List<Integer> values) {
            addCriterion("info_order in", values, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderNotIn(List<Integer> values) {
            addCriterion("info_order not in", values, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderBetween(Integer value1, Integer value2) {
            addCriterion("info_order between", value1, value2, "infoOrder");
            return (Criteria) this;
        }

        public Criteria andInfoOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("info_order not between", value1, value2, "infoOrder");
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