package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class AwardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AwardsExample() {
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

        public Criteria andLotteryidIsNull() {
            addCriterion("LOTTERYID is null");
            return (Criteria) this;
        }

        public Criteria andLotteryidIsNotNull() {
            addCriterion("LOTTERYID is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryidEqualTo(String value) {
            addCriterion("LOTTERYID =", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidNotEqualTo(String value) {
            addCriterion("LOTTERYID <>", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidGreaterThan(String value) {
            addCriterion("LOTTERYID >", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERYID >=", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidLessThan(String value) {
            addCriterion("LOTTERYID <", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidLessThanOrEqualTo(String value) {
            addCriterion("LOTTERYID <=", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidLike(String value) {
            addCriterion("LOTTERYID like", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidNotLike(String value) {
            addCriterion("LOTTERYID not like", value, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidIn(List<String> values) {
            addCriterion("LOTTERYID in", values, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidNotIn(List<String> values) {
            addCriterion("LOTTERYID not in", values, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidBetween(String value1, String value2) {
            addCriterion("LOTTERYID between", value1, value2, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andLotteryidNotBetween(String value1, String value2) {
            addCriterion("LOTTERYID not between", value1, value2, "lotteryid");
            return (Criteria) this;
        }

        public Criteria andAwardOrderIsNull() {
            addCriterion("award_order is null");
            return (Criteria) this;
        }

        public Criteria andAwardOrderIsNotNull() {
            addCriterion("award_order is not null");
            return (Criteria) this;
        }

        public Criteria andAwardOrderEqualTo(Integer value) {
            addCriterion("award_order =", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderNotEqualTo(Integer value) {
            addCriterion("award_order <>", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderGreaterThan(Integer value) {
            addCriterion("award_order >", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_order >=", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderLessThan(Integer value) {
            addCriterion("award_order <", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderLessThanOrEqualTo(Integer value) {
            addCriterion("award_order <=", value, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderIn(List<Integer> values) {
            addCriterion("award_order in", values, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderNotIn(List<Integer> values) {
            addCriterion("award_order not in", values, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderBetween(Integer value1, Integer value2) {
            addCriterion("award_order between", value1, value2, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("award_order not between", value1, value2, "awardOrder");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNull() {
            addCriterion("award_level is null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNotNull() {
            addCriterion("award_level is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelEqualTo(String value) {
            addCriterion("award_level =", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotEqualTo(String value) {
            addCriterion("award_level <>", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThan(String value) {
            addCriterion("award_level >", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("award_level >=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThan(String value) {
            addCriterion("award_level <", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThanOrEqualTo(String value) {
            addCriterion("award_level <=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLike(String value) {
            addCriterion("award_level like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotLike(String value) {
            addCriterion("award_level not like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIn(List<String> values) {
            addCriterion("award_level in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotIn(List<String> values) {
            addCriterion("award_level not in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelBetween(String value1, String value2) {
            addCriterion("award_level between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotBetween(String value1, String value2) {
            addCriterion("award_level not between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardNumIsNull() {
            addCriterion("award_num is null");
            return (Criteria) this;
        }

        public Criteria andAwardNumIsNotNull() {
            addCriterion("award_num is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNumEqualTo(Integer value) {
            addCriterion("award_num =", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumNotEqualTo(Integer value) {
            addCriterion("award_num <>", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumGreaterThan(Integer value) {
            addCriterion("award_num >", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_num >=", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumLessThan(Integer value) {
            addCriterion("award_num <", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumLessThanOrEqualTo(Integer value) {
            addCriterion("award_num <=", value, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumIn(List<Integer> values) {
            addCriterion("award_num in", values, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumNotIn(List<Integer> values) {
            addCriterion("award_num not in", values, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumBetween(Integer value1, Integer value2) {
            addCriterion("award_num between", value1, value2, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("award_num not between", value1, value2, "awardNum");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNameEqualTo(String value) {
            addCriterion("award_name =", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThan(String value) {
            addCriterion("award_name >", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThan(String value) {
            addCriterion("award_name <", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLike(String value) {
            addCriterion("award_name like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotLike(String value) {
            addCriterion("award_name not like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameIn(List<String> values) {
            addCriterion("award_name in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "awardName");
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