package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HiomsCbrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HiomsCbrExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardIsNull() {
            addCriterion("cbr_id_card is null");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardIsNotNull() {
            addCriterion("cbr_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardEqualTo(String value) {
            addCriterion("cbr_id_card =", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardNotEqualTo(String value) {
            addCriterion("cbr_id_card <>", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardGreaterThan(String value) {
            addCriterion("cbr_id_card >", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("cbr_id_card >=", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardLessThan(String value) {
            addCriterion("cbr_id_card <", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardLessThanOrEqualTo(String value) {
            addCriterion("cbr_id_card <=", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardLike(String value) {
            addCriterion("cbr_id_card like", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardNotLike(String value) {
            addCriterion("cbr_id_card not like", value, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardIn(List<String> values) {
            addCriterion("cbr_id_card in", values, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardNotIn(List<String> values) {
            addCriterion("cbr_id_card not in", values, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardBetween(String value1, String value2) {
            addCriterion("cbr_id_card between", value1, value2, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrIdCardNotBetween(String value1, String value2) {
            addCriterion("cbr_id_card not between", value1, value2, "cbrIdCard");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberIsNull() {
            addCriterion("cbr_socity_number is null");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberIsNotNull() {
            addCriterion("cbr_socity_number is not null");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberEqualTo(String value) {
            addCriterion("cbr_socity_number =", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberNotEqualTo(String value) {
            addCriterion("cbr_socity_number <>", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberGreaterThan(String value) {
            addCriterion("cbr_socity_number >", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cbr_socity_number >=", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberLessThan(String value) {
            addCriterion("cbr_socity_number <", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberLessThanOrEqualTo(String value) {
            addCriterion("cbr_socity_number <=", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberLike(String value) {
            addCriterion("cbr_socity_number like", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberNotLike(String value) {
            addCriterion("cbr_socity_number not like", value, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberIn(List<String> values) {
            addCriterion("cbr_socity_number in", values, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberNotIn(List<String> values) {
            addCriterion("cbr_socity_number not in", values, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberBetween(String value1, String value2) {
            addCriterion("cbr_socity_number between", value1, value2, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrSocityNumberNotBetween(String value1, String value2) {
            addCriterion("cbr_socity_number not between", value1, value2, "cbrSocityNumber");
            return (Criteria) this;
        }

        public Criteria andCbrNameIsNull() {
            addCriterion("cbr_name is null");
            return (Criteria) this;
        }

        public Criteria andCbrNameIsNotNull() {
            addCriterion("cbr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCbrNameEqualTo(String value) {
            addCriterion("cbr_name =", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameNotEqualTo(String value) {
            addCriterion("cbr_name <>", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameGreaterThan(String value) {
            addCriterion("cbr_name >", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("cbr_name >=", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameLessThan(String value) {
            addCriterion("cbr_name <", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameLessThanOrEqualTo(String value) {
            addCriterion("cbr_name <=", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameLike(String value) {
            addCriterion("cbr_name like", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameNotLike(String value) {
            addCriterion("cbr_name not like", value, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameIn(List<String> values) {
            addCriterion("cbr_name in", values, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameNotIn(List<String> values) {
            addCriterion("cbr_name not in", values, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameBetween(String value1, String value2) {
            addCriterion("cbr_name between", value1, value2, "cbrName");
            return (Criteria) this;
        }

        public Criteria andCbrNameNotBetween(String value1, String value2) {
            addCriterion("cbr_name not between", value1, value2, "cbrName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdIsNull() {
            addCriterion("group_county_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdIsNotNull() {
            addCriterion("group_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdEqualTo(String value) {
            addCriterion("group_county_id =", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdNotEqualTo(String value) {
            addCriterion("group_county_id <>", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdGreaterThan(String value) {
            addCriterion("group_county_id >", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_county_id >=", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdLessThan(String value) {
            addCriterion("group_county_id <", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdLessThanOrEqualTo(String value) {
            addCriterion("group_county_id <=", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdLike(String value) {
            addCriterion("group_county_id like", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdNotLike(String value) {
            addCriterion("group_county_id not like", value, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdIn(List<String> values) {
            addCriterion("group_county_id in", values, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdNotIn(List<String> values) {
            addCriterion("group_county_id not in", values, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdBetween(String value1, String value2) {
            addCriterion("group_county_id between", value1, value2, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyIdNotBetween(String value1, String value2) {
            addCriterion("group_county_id not between", value1, value2, "groupCountyId");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameIsNull() {
            addCriterion("group_county_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameIsNotNull() {
            addCriterion("group_county_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameEqualTo(String value) {
            addCriterion("group_county_name =", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameNotEqualTo(String value) {
            addCriterion("group_county_name <>", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameGreaterThan(String value) {
            addCriterion("group_county_name >", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_county_name >=", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameLessThan(String value) {
            addCriterion("group_county_name <", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameLessThanOrEqualTo(String value) {
            addCriterion("group_county_name <=", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameLike(String value) {
            addCriterion("group_county_name like", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameNotLike(String value) {
            addCriterion("group_county_name not like", value, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameIn(List<String> values) {
            addCriterion("group_county_name in", values, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameNotIn(List<String> values) {
            addCriterion("group_county_name not in", values, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameBetween(String value1, String value2) {
            addCriterion("group_county_name between", value1, value2, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCountyNameNotBetween(String value1, String value2) {
            addCriterion("group_county_name not between", value1, value2, "groupCountyName");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdIsNull() {
            addCriterion("group_city_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdIsNotNull() {
            addCriterion("group_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdEqualTo(String value) {
            addCriterion("group_city_id =", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdNotEqualTo(String value) {
            addCriterion("group_city_id <>", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdGreaterThan(String value) {
            addCriterion("group_city_id >", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_city_id >=", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdLessThan(String value) {
            addCriterion("group_city_id <", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdLessThanOrEqualTo(String value) {
            addCriterion("group_city_id <=", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdLike(String value) {
            addCriterion("group_city_id like", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdNotLike(String value) {
            addCriterion("group_city_id not like", value, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdIn(List<String> values) {
            addCriterion("group_city_id in", values, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdNotIn(List<String> values) {
            addCriterion("group_city_id not in", values, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdBetween(String value1, String value2) {
            addCriterion("group_city_id between", value1, value2, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityIdNotBetween(String value1, String value2) {
            addCriterion("group_city_id not between", value1, value2, "groupCityId");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameIsNull() {
            addCriterion("group_city_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameIsNotNull() {
            addCriterion("group_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameEqualTo(String value) {
            addCriterion("group_city_name =", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameNotEqualTo(String value) {
            addCriterion("group_city_name <>", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameGreaterThan(String value) {
            addCriterion("group_city_name >", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_city_name >=", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameLessThan(String value) {
            addCriterion("group_city_name <", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameLessThanOrEqualTo(String value) {
            addCriterion("group_city_name <=", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameLike(String value) {
            addCriterion("group_city_name like", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameNotLike(String value) {
            addCriterion("group_city_name not like", value, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameIn(List<String> values) {
            addCriterion("group_city_name in", values, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameNotIn(List<String> values) {
            addCriterion("group_city_name not in", values, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameBetween(String value1, String value2) {
            addCriterion("group_city_name between", value1, value2, "groupCityName");
            return (Criteria) this;
        }

        public Criteria andGroupCityNameNotBetween(String value1, String value2) {
            addCriterion("group_city_name not between", value1, value2, "groupCityName");
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