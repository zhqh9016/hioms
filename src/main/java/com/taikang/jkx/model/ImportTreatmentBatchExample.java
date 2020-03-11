package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportTreatmentBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ImportTreatmentBatchExample() {
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

        public Criteria andCreatorLoginNameIsNull() {
            addCriterion("creator_login_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameIsNotNull() {
            addCriterion("creator_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameEqualTo(String value) {
            addCriterion("creator_login_name =", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameNotEqualTo(String value) {
            addCriterion("creator_login_name <>", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameGreaterThan(String value) {
            addCriterion("creator_login_name >", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_login_name >=", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameLessThan(String value) {
            addCriterion("creator_login_name <", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameLessThanOrEqualTo(String value) {
            addCriterion("creator_login_name <=", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameLike(String value) {
            addCriterion("creator_login_name like", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameNotLike(String value) {
            addCriterion("creator_login_name not like", value, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameIn(List<String> values) {
            addCriterion("creator_login_name in", values, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameNotIn(List<String> values) {
            addCriterion("creator_login_name not in", values, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameBetween(String value1, String value2) {
            addCriterion("creator_login_name between", value1, value2, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorLoginNameNotBetween(String value1, String value2) {
            addCriterion("creator_login_name not between", value1, value2, "creatorLoginName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameIsNull() {
            addCriterion("creator_true_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameIsNotNull() {
            addCriterion("creator_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameEqualTo(String value) {
            addCriterion("creator_true_name =", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameNotEqualTo(String value) {
            addCriterion("creator_true_name <>", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameGreaterThan(String value) {
            addCriterion("creator_true_name >", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_true_name >=", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameLessThan(String value) {
            addCriterion("creator_true_name <", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameLessThanOrEqualTo(String value) {
            addCriterion("creator_true_name <=", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameLike(String value) {
            addCriterion("creator_true_name like", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameNotLike(String value) {
            addCriterion("creator_true_name not like", value, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameIn(List<String> values) {
            addCriterion("creator_true_name in", values, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameNotIn(List<String> values) {
            addCriterion("creator_true_name not in", values, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameBetween(String value1, String value2) {
            addCriterion("creator_true_name between", value1, value2, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreatorTrueNameNotBetween(String value1, String value2) {
            addCriterion("creator_true_name not between", value1, value2, "creatorTrueName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdIsNull() {
            addCriterion("creator_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdIsNotNull() {
            addCriterion("creator_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdEqualTo(String value) {
            addCriterion("creator_group_id =", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdNotEqualTo(String value) {
            addCriterion("creator_group_id <>", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdGreaterThan(String value) {
            addCriterion("creator_group_id >", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_group_id >=", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdLessThan(String value) {
            addCriterion("creator_group_id <", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdLessThanOrEqualTo(String value) {
            addCriterion("creator_group_id <=", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdLike(String value) {
            addCriterion("creator_group_id like", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdNotLike(String value) {
            addCriterion("creator_group_id not like", value, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdIn(List<String> values) {
            addCriterion("creator_group_id in", values, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdNotIn(List<String> values) {
            addCriterion("creator_group_id not in", values, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdBetween(String value1, String value2) {
            addCriterion("creator_group_id between", value1, value2, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupIdNotBetween(String value1, String value2) {
            addCriterion("creator_group_id not between", value1, value2, "creatorGroupId");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameIsNull() {
            addCriterion("creator_group_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameIsNotNull() {
            addCriterion("creator_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameEqualTo(String value) {
            addCriterion("creator_group_name =", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameNotEqualTo(String value) {
            addCriterion("creator_group_name <>", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameGreaterThan(String value) {
            addCriterion("creator_group_name >", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_group_name >=", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameLessThan(String value) {
            addCriterion("creator_group_name <", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameLessThanOrEqualTo(String value) {
            addCriterion("creator_group_name <=", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameLike(String value) {
            addCriterion("creator_group_name like", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameNotLike(String value) {
            addCriterion("creator_group_name not like", value, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameIn(List<String> values) {
            addCriterion("creator_group_name in", values, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameNotIn(List<String> values) {
            addCriterion("creator_group_name not in", values, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameBetween(String value1, String value2) {
            addCriterion("creator_group_name between", value1, value2, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andCreatorGroupNameNotBetween(String value1, String value2) {
            addCriterion("creator_group_name not between", value1, value2, "creatorGroupName");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNull() {
            addCriterion("success_num is null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNotNull() {
            addCriterion("success_num is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumEqualTo(Integer value) {
            addCriterion("success_num =", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotEqualTo(Integer value) {
            addCriterion("success_num <>", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThan(Integer value) {
            addCriterion("success_num >", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_num >=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThan(Integer value) {
            addCriterion("success_num <", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("success_num <=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIn(List<Integer> values) {
            addCriterion("success_num in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotIn(List<Integer> values) {
            addCriterion("success_num not in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumBetween(Integer value1, Integer value2) {
            addCriterion("success_num between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("success_num not between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNull() {
            addCriterion("error_num is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNotNull() {
            addCriterion("error_num is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumEqualTo(Integer value) {
            addCriterion("error_num =", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotEqualTo(Integer value) {
            addCriterion("error_num <>", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThan(Integer value) {
            addCriterion("error_num >", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_num >=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThan(Integer value) {
            addCriterion("error_num <", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThanOrEqualTo(Integer value) {
            addCriterion("error_num <=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIn(List<Integer> values) {
            addCriterion("error_num in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotIn(List<Integer> values) {
            addCriterion("error_num not in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumBetween(Integer value1, Integer value2) {
            addCriterion("error_num between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("error_num not between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdIsNull() {
            addCriterion("manage_group_id is null");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdIsNotNull() {
            addCriterion("manage_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdEqualTo(String value) {
            addCriterion("manage_group_id =", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdNotEqualTo(String value) {
            addCriterion("manage_group_id <>", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdGreaterThan(String value) {
            addCriterion("manage_group_id >", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("manage_group_id >=", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdLessThan(String value) {
            addCriterion("manage_group_id <", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdLessThanOrEqualTo(String value) {
            addCriterion("manage_group_id <=", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdLike(String value) {
            addCriterion("manage_group_id like", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdNotLike(String value) {
            addCriterion("manage_group_id not like", value, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdIn(List<String> values) {
            addCriterion("manage_group_id in", values, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdNotIn(List<String> values) {
            addCriterion("manage_group_id not in", values, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdBetween(String value1, String value2) {
            addCriterion("manage_group_id between", value1, value2, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupIdNotBetween(String value1, String value2) {
            addCriterion("manage_group_id not between", value1, value2, "manageGroupId");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameIsNull() {
            addCriterion("manage_group_name is null");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameIsNotNull() {
            addCriterion("manage_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameEqualTo(String value) {
            addCriterion("manage_group_name =", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameNotEqualTo(String value) {
            addCriterion("manage_group_name <>", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameGreaterThan(String value) {
            addCriterion("manage_group_name >", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_group_name >=", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameLessThan(String value) {
            addCriterion("manage_group_name <", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameLessThanOrEqualTo(String value) {
            addCriterion("manage_group_name <=", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameLike(String value) {
            addCriterion("manage_group_name like", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameNotLike(String value) {
            addCriterion("manage_group_name not like", value, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameIn(List<String> values) {
            addCriterion("manage_group_name in", values, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameNotIn(List<String> values) {
            addCriterion("manage_group_name not in", values, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameBetween(String value1, String value2) {
            addCriterion("manage_group_name between", value1, value2, "manageGroupName");
            return (Criteria) this;
        }

        public Criteria andManageGroupNameNotBetween(String value1, String value2) {
            addCriterion("manage_group_name not between", value1, value2, "manageGroupName");
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