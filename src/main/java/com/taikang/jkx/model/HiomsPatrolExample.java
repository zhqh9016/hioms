package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiomsPatrolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HiomsPatrolExample() {
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("updator like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("updator not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("updator not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdIsNull() {
            addCriterion("trustee_position_id is null");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdIsNotNull() {
            addCriterion("trustee_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdEqualTo(String value) {
            addCriterion("trustee_position_id =", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdNotEqualTo(String value) {
            addCriterion("trustee_position_id <>", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdGreaterThan(String value) {
            addCriterion("trustee_position_id >", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("trustee_position_id >=", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdLessThan(String value) {
            addCriterion("trustee_position_id <", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdLessThanOrEqualTo(String value) {
            addCriterion("trustee_position_id <=", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdLike(String value) {
            addCriterion("trustee_position_id like", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdNotLike(String value) {
            addCriterion("trustee_position_id not like", value, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdIn(List<String> values) {
            addCriterion("trustee_position_id in", values, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdNotIn(List<String> values) {
            addCriterion("trustee_position_id not in", values, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdBetween(String value1, String value2) {
            addCriterion("trustee_position_id between", value1, value2, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andTrusteePositionIdNotBetween(String value1, String value2) {
            addCriterion("trustee_position_id not between", value1, value2, "trusteePositionId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionIsNull() {
            addCriterion("execute_description is null");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionIsNotNull() {
            addCriterion("execute_description is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionEqualTo(String value) {
            addCriterion("execute_description =", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionNotEqualTo(String value) {
            addCriterion("execute_description <>", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionGreaterThan(String value) {
            addCriterion("execute_description >", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("execute_description >=", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionLessThan(String value) {
            addCriterion("execute_description <", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionLessThanOrEqualTo(String value) {
            addCriterion("execute_description <=", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionLike(String value) {
            addCriterion("execute_description like", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionNotLike(String value) {
            addCriterion("execute_description not like", value, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionIn(List<String> values) {
            addCriterion("execute_description in", values, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionNotIn(List<String> values) {
            addCriterion("execute_description not in", values, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionBetween(String value1, String value2) {
            addCriterion("execute_description between", value1, value2, "executeDescription");
            return (Criteria) this;
        }

        public Criteria andExecuteDescriptionNotBetween(String value1, String value2) {
            addCriterion("execute_description not between", value1, value2, "executeDescription");
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