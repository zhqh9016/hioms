package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HiomsAgreementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HiomsAgreementExample() {
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

        public Criteria andAgreementIdIsNull() {
            addCriterion("agreement_id is null");
            return (Criteria) this;
        }

        public Criteria andAgreementIdIsNotNull() {
            addCriterion("agreement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementIdEqualTo(String value) {
            addCriterion("agreement_id =", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotEqualTo(String value) {
            addCriterion("agreement_id <>", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdGreaterThan(String value) {
            addCriterion("agreement_id >", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_id >=", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLessThan(String value) {
            addCriterion("agreement_id <", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("agreement_id <=", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLike(String value) {
            addCriterion("agreement_id like", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotLike(String value) {
            addCriterion("agreement_id not like", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdIn(List<String> values) {
            addCriterion("agreement_id in", values, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotIn(List<String> values) {
            addCriterion("agreement_id not in", values, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdBetween(String value1, String value2) {
            addCriterion("agreement_id between", value1, value2, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotBetween(String value1, String value2) {
            addCriterion("agreement_id not between", value1, value2, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementNameIsNull() {
            addCriterion("agreement_name is null");
            return (Criteria) this;
        }

        public Criteria andAgreementNameIsNotNull() {
            addCriterion("agreement_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementNameEqualTo(String value) {
            addCriterion("agreement_name =", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotEqualTo(String value) {
            addCriterion("agreement_name <>", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameGreaterThan(String value) {
            addCriterion("agreement_name >", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_name >=", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLessThan(String value) {
            addCriterion("agreement_name <", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLessThanOrEqualTo(String value) {
            addCriterion("agreement_name <=", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLike(String value) {
            addCriterion("agreement_name like", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotLike(String value) {
            addCriterion("agreement_name not like", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameIn(List<String> values) {
            addCriterion("agreement_name in", values, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotIn(List<String> values) {
            addCriterion("agreement_name not in", values, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameBetween(String value1, String value2) {
            addCriterion("agreement_name between", value1, value2, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotBetween(String value1, String value2) {
            addCriterion("agreement_name not between", value1, value2, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeIsNull() {
            addCriterion("agreement_signtime is null");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeIsNotNull() {
            addCriterion("agreement_signtime is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_signtime =", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_signtime <>", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("agreement_signtime >", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_signtime >=", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeLessThan(Date value) {
            addCriterionForJDBCDate("agreement_signtime <", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_signtime <=", value, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_signtime in", values, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_signtime not in", values, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_signtime between", value1, value2, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementSigntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_signtime not between", value1, value2, "agreementSigntime");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartIsNull() {
            addCriterion("agreement_first_part is null");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartIsNotNull() {
            addCriterion("agreement_first_part is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartEqualTo(String value) {
            addCriterion("agreement_first_part =", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartNotEqualTo(String value) {
            addCriterion("agreement_first_part <>", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartGreaterThan(String value) {
            addCriterion("agreement_first_part >", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_first_part >=", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartLessThan(String value) {
            addCriterion("agreement_first_part <", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartLessThanOrEqualTo(String value) {
            addCriterion("agreement_first_part <=", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartLike(String value) {
            addCriterion("agreement_first_part like", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartNotLike(String value) {
            addCriterion("agreement_first_part not like", value, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartIn(List<String> values) {
            addCriterion("agreement_first_part in", values, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartNotIn(List<String> values) {
            addCriterion("agreement_first_part not in", values, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartBetween(String value1, String value2) {
            addCriterion("agreement_first_part between", value1, value2, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementFirstPartNotBetween(String value1, String value2) {
            addCriterion("agreement_first_part not between", value1, value2, "agreementFirstPart");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbIsNull() {
            addCriterion("agreement_partb is null");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbIsNotNull() {
            addCriterion("agreement_partb is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbEqualTo(String value) {
            addCriterion("agreement_partb =", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbNotEqualTo(String value) {
            addCriterion("agreement_partb <>", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbGreaterThan(String value) {
            addCriterion("agreement_partb >", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_partb >=", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbLessThan(String value) {
            addCriterion("agreement_partb <", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbLessThanOrEqualTo(String value) {
            addCriterion("agreement_partb <=", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbLike(String value) {
            addCriterion("agreement_partb like", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbNotLike(String value) {
            addCriterion("agreement_partb not like", value, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbIn(List<String> values) {
            addCriterion("agreement_partb in", values, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbNotIn(List<String> values) {
            addCriterion("agreement_partb not in", values, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbBetween(String value1, String value2) {
            addCriterion("agreement_partb between", value1, value2, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementPartbNotBetween(String value1, String value2) {
            addCriterion("agreement_partb not between", value1, value2, "agreementPartb");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeIsNull() {
            addCriterion("agreement_starttime is null");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeIsNotNull() {
            addCriterion("agreement_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_starttime =", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_starttime <>", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("agreement_starttime >", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_starttime >=", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("agreement_starttime <", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_starttime <=", value, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_starttime in", values, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_starttime not in", values, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_starttime between", value1, value2, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_starttime not between", value1, value2, "agreementStarttime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeIsNull() {
            addCriterion("agreement_endtime is null");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeIsNotNull() {
            addCriterion("agreement_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_endtime =", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_endtime <>", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("agreement_endtime >", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_endtime >=", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("agreement_endtime <", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("agreement_endtime <=", value, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_endtime in", values, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("agreement_endtime not in", values, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_endtime between", value1, value2, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("agreement_endtime not between", value1, value2, "agreementEndtime");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleIsNull() {
            addCriterion("agreement_responsible is null");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleIsNotNull() {
            addCriterion("agreement_responsible is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleEqualTo(String value) {
            addCriterion("agreement_responsible =", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleNotEqualTo(String value) {
            addCriterion("agreement_responsible <>", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleGreaterThan(String value) {
            addCriterion("agreement_responsible >", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_responsible >=", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleLessThan(String value) {
            addCriterion("agreement_responsible <", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleLessThanOrEqualTo(String value) {
            addCriterion("agreement_responsible <=", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleLike(String value) {
            addCriterion("agreement_responsible like", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleNotLike(String value) {
            addCriterion("agreement_responsible not like", value, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleIn(List<String> values) {
            addCriterion("agreement_responsible in", values, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleNotIn(List<String> values) {
            addCriterion("agreement_responsible not in", values, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleBetween(String value1, String value2) {
            addCriterion("agreement_responsible between", value1, value2, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementResponsibleNotBetween(String value1, String value2) {
            addCriterion("agreement_responsible not between", value1, value2, "agreementResponsible");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceIsNull() {
            addCriterion("agreement_place is null");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceIsNotNull() {
            addCriterion("agreement_place is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceEqualTo(String value) {
            addCriterion("agreement_place =", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceNotEqualTo(String value) {
            addCriterion("agreement_place <>", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceGreaterThan(String value) {
            addCriterion("agreement_place >", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_place >=", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceLessThan(String value) {
            addCriterion("agreement_place <", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceLessThanOrEqualTo(String value) {
            addCriterion("agreement_place <=", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceLike(String value) {
            addCriterion("agreement_place like", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceNotLike(String value) {
            addCriterion("agreement_place not like", value, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceIn(List<String> values) {
            addCriterion("agreement_place in", values, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceNotIn(List<String> values) {
            addCriterion("agreement_place not in", values, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceBetween(String value1, String value2) {
            addCriterion("agreement_place between", value1, value2, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementPlaceNotBetween(String value1, String value2) {
            addCriterion("agreement_place not between", value1, value2, "agreementPlace");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdIsNull() {
            addCriterion("agreement_enclosure_id is null");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdIsNotNull() {
            addCriterion("agreement_enclosure_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdEqualTo(String value) {
            addCriterion("agreement_enclosure_id =", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdNotEqualTo(String value) {
            addCriterion("agreement_enclosure_id <>", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdGreaterThan(String value) {
            addCriterion("agreement_enclosure_id >", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_enclosure_id >=", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdLessThan(String value) {
            addCriterion("agreement_enclosure_id <", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdLessThanOrEqualTo(String value) {
            addCriterion("agreement_enclosure_id <=", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdLike(String value) {
            addCriterion("agreement_enclosure_id like", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdNotLike(String value) {
            addCriterion("agreement_enclosure_id not like", value, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdIn(List<String> values) {
            addCriterion("agreement_enclosure_id in", values, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdNotIn(List<String> values) {
            addCriterion("agreement_enclosure_id not in", values, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdBetween(String value1, String value2) {
            addCriterion("agreement_enclosure_id between", value1, value2, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andAgreementEnclosureIdNotBetween(String value1, String value2) {
            addCriterion("agreement_enclosure_id not between", value1, value2, "agreementEnclosureId");
            return (Criteria) this;
        }

        public Criteria andIsRemindIsNull() {
            addCriterion("is_remind is null");
            return (Criteria) this;
        }

        public Criteria andIsRemindIsNotNull() {
            addCriterion("is_remind is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemindEqualTo(Integer value) {
            addCriterion("is_remind =", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotEqualTo(Integer value) {
            addCriterion("is_remind <>", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindGreaterThan(Integer value) {
            addCriterion("is_remind >", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_remind >=", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindLessThan(Integer value) {
            addCriterion("is_remind <", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindLessThanOrEqualTo(Integer value) {
            addCriterion("is_remind <=", value, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindIn(List<Integer> values) {
            addCriterion("is_remind in", values, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotIn(List<Integer> values) {
            addCriterion("is_remind not in", values, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindBetween(Integer value1, Integer value2) {
            addCriterion("is_remind between", value1, value2, "isRemind");
            return (Criteria) this;
        }

        public Criteria andIsRemindNotBetween(Integer value1, Integer value2) {
            addCriterion("is_remind not between", value1, value2, "isRemind");
            return (Criteria) this;
        }

        public Criteria andRemindDayIsNull() {
            addCriterion("remind_day is null");
            return (Criteria) this;
        }

        public Criteria andRemindDayIsNotNull() {
            addCriterion("remind_day is not null");
            return (Criteria) this;
        }

        public Criteria andRemindDayEqualTo(Integer value) {
            addCriterion("remind_day =", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotEqualTo(Integer value) {
            addCriterion("remind_day <>", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayGreaterThan(Integer value) {
            addCriterion("remind_day >", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_day >=", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayLessThan(Integer value) {
            addCriterion("remind_day <", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayLessThanOrEqualTo(Integer value) {
            addCriterion("remind_day <=", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayIn(List<Integer> values) {
            addCriterion("remind_day in", values, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotIn(List<Integer> values) {
            addCriterion("remind_day not in", values, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayBetween(Integer value1, Integer value2) {
            addCriterion("remind_day between", value1, value2, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_day not between", value1, value2, "remindDay");
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

        public Criteria andValidIsNull() {
            addCriterion("`valid` is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("`valid` is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("`valid` =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("`valid` <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("`valid` >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`valid` >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("`valid` <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("`valid` <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("`valid` in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("`valid` not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("`valid` between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("`valid` not between", value1, value2, "valid");
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