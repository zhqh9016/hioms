package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiomsTreatmentTmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HiomsTreatmentTmExample() {
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

        public Criteria andJiuzhenbianhaoIsNull() {
            addCriterion("jiuzhenbianhao is null");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoIsNotNull() {
            addCriterion("jiuzhenbianhao is not null");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoEqualTo(String value) {
            addCriterion("jiuzhenbianhao =", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoNotEqualTo(String value) {
            addCriterion("jiuzhenbianhao <>", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoGreaterThan(String value) {
            addCriterion("jiuzhenbianhao >", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("jiuzhenbianhao >=", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoLessThan(String value) {
            addCriterion("jiuzhenbianhao <", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoLessThanOrEqualTo(String value) {
            addCriterion("jiuzhenbianhao <=", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoLike(String value) {
            addCriterion("jiuzhenbianhao like", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoNotLike(String value) {
            addCriterion("jiuzhenbianhao not like", value, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoIn(List<String> values) {
            addCriterion("jiuzhenbianhao in", values, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoNotIn(List<String> values) {
            addCriterion("jiuzhenbianhao not in", values, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoBetween(String value1, String value2) {
            addCriterion("jiuzhenbianhao between", value1, value2, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andJiuzhenbianhaoNotBetween(String value1, String value2) {
            addCriterion("jiuzhenbianhao not between", value1, value2, "jiuzhenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoIsNull() {
            addCriterion("gerenbianhao is null");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoIsNotNull() {
            addCriterion("gerenbianhao is not null");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoEqualTo(String value) {
            addCriterion("gerenbianhao =", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoNotEqualTo(String value) {
            addCriterion("gerenbianhao <>", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoGreaterThan(String value) {
            addCriterion("gerenbianhao >", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("gerenbianhao >=", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoLessThan(String value) {
            addCriterion("gerenbianhao <", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoLessThanOrEqualTo(String value) {
            addCriterion("gerenbianhao <=", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoLike(String value) {
            addCriterion("gerenbianhao like", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoNotLike(String value) {
            addCriterion("gerenbianhao not like", value, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoIn(List<String> values) {
            addCriterion("gerenbianhao in", values, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoNotIn(List<String> values) {
            addCriterion("gerenbianhao not in", values, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoBetween(String value1, String value2) {
            addCriterion("gerenbianhao between", value1, value2, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGerenbianhaoNotBetween(String value1, String value2) {
            addCriterion("gerenbianhao not between", value1, value2, "gerenbianhao");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIsNull() {
            addCriterion("shenfenzheng is null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIsNotNull() {
            addCriterion("shenfenzheng is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengEqualTo(String value) {
            addCriterion("shenfenzheng =", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotEqualTo(String value) {
            addCriterion("shenfenzheng <>", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThan(String value) {
            addCriterion("shenfenzheng >", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThanOrEqualTo(String value) {
            addCriterion("shenfenzheng >=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThan(String value) {
            addCriterion("shenfenzheng <", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThanOrEqualTo(String value) {
            addCriterion("shenfenzheng <=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLike(String value) {
            addCriterion("shenfenzheng like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotLike(String value) {
            addCriterion("shenfenzheng not like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIn(List<String> values) {
            addCriterion("shenfenzheng in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotIn(List<String> values) {
            addCriterion("shenfenzheng not in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengBetween(String value1, String value2) {
            addCriterion("shenfenzheng between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotBetween(String value1, String value2) {
            addCriterion("shenfenzheng not between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNull() {
            addCriterion("xingming is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("xingming is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("xingming =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("xingming <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("xingming >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("xingming >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("xingming <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("xingming <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("xingming like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("xingming not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("xingming in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("xingming not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("xingming between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("xingming not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNull() {
            addCriterion("xingbie is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("xingbie is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(String value) {
            addCriterion("xingbie =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(String value) {
            addCriterion("xingbie <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(String value) {
            addCriterion("xingbie >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(String value) {
            addCriterion("xingbie >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(String value) {
            addCriterion("xingbie <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(String value) {
            addCriterion("xingbie <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLike(String value) {
            addCriterion("xingbie like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotLike(String value) {
            addCriterion("xingbie not like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<String> values) {
            addCriterion("xingbie in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<String> values) {
            addCriterion("xingbie not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(String value1, String value2) {
            addCriterion("xingbie between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(String value1, String value2) {
            addCriterion("xingbie not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andNianlingIsNull() {
            addCriterion("nianling is null");
            return (Criteria) this;
        }

        public Criteria andNianlingIsNotNull() {
            addCriterion("nianling is not null");
            return (Criteria) this;
        }

        public Criteria andNianlingEqualTo(String value) {
            addCriterion("nianling =", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotEqualTo(String value) {
            addCriterion("nianling <>", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingGreaterThan(String value) {
            addCriterion("nianling >", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingGreaterThanOrEqualTo(String value) {
            addCriterion("nianling >=", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLessThan(String value) {
            addCriterion("nianling <", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLessThanOrEqualTo(String value) {
            addCriterion("nianling <=", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingLike(String value) {
            addCriterion("nianling like", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotLike(String value) {
            addCriterion("nianling not like", value, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingIn(List<String> values) {
            addCriterion("nianling in", values, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotIn(List<String> values) {
            addCriterion("nianling not in", values, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingBetween(String value1, String value2) {
            addCriterion("nianling between", value1, value2, "nianling");
            return (Criteria) this;
        }

        public Criteria andNianlingNotBetween(String value1, String value2) {
            addCriterion("nianling not between", value1, value2, "nianling");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieIsNull() {
            addCriterion("jiaofeirenyuanleibie is null");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieIsNotNull() {
            addCriterion("jiaofeirenyuanleibie is not null");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieEqualTo(String value) {
            addCriterion("jiaofeirenyuanleibie =", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieNotEqualTo(String value) {
            addCriterion("jiaofeirenyuanleibie <>", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieGreaterThan(String value) {
            addCriterion("jiaofeirenyuanleibie >", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieGreaterThanOrEqualTo(String value) {
            addCriterion("jiaofeirenyuanleibie >=", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieLessThan(String value) {
            addCriterion("jiaofeirenyuanleibie <", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieLessThanOrEqualTo(String value) {
            addCriterion("jiaofeirenyuanleibie <=", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieLike(String value) {
            addCriterion("jiaofeirenyuanleibie like", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieNotLike(String value) {
            addCriterion("jiaofeirenyuanleibie not like", value, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieIn(List<String> values) {
            addCriterion("jiaofeirenyuanleibie in", values, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieNotIn(List<String> values) {
            addCriterion("jiaofeirenyuanleibie not in", values, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieBetween(String value1, String value2) {
            addCriterion("jiaofeirenyuanleibie between", value1, value2, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJiaofeirenyuanleibieNotBetween(String value1, String value2) {
            addCriterion("jiaofeirenyuanleibie not between", value1, value2, "jiaofeirenyuanleibie");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengIsNull() {
            addCriterion("jigoumingcheng is null");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengIsNotNull() {
            addCriterion("jigoumingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengEqualTo(String value) {
            addCriterion("jigoumingcheng =", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengNotEqualTo(String value) {
            addCriterion("jigoumingcheng <>", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengGreaterThan(String value) {
            addCriterion("jigoumingcheng >", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("jigoumingcheng >=", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengLessThan(String value) {
            addCriterion("jigoumingcheng <", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengLessThanOrEqualTo(String value) {
            addCriterion("jigoumingcheng <=", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengLike(String value) {
            addCriterion("jigoumingcheng like", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengNotLike(String value) {
            addCriterion("jigoumingcheng not like", value, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengIn(List<String> values) {
            addCriterion("jigoumingcheng in", values, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengNotIn(List<String> values) {
            addCriterion("jigoumingcheng not in", values, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengBetween(String value1, String value2) {
            addCriterion("jigoumingcheng between", value1, value2, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andJigoumingchengNotBetween(String value1, String value2) {
            addCriterion("jigoumingcheng not between", value1, value2, "jigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andZhifudidianIsNull() {
            addCriterion("zhifudidian is null");
            return (Criteria) this;
        }

        public Criteria andZhifudidianIsNotNull() {
            addCriterion("zhifudidian is not null");
            return (Criteria) this;
        }

        public Criteria andZhifudidianEqualTo(String value) {
            addCriterion("zhifudidian =", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianNotEqualTo(String value) {
            addCriterion("zhifudidian <>", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianGreaterThan(String value) {
            addCriterion("zhifudidian >", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianGreaterThanOrEqualTo(String value) {
            addCriterion("zhifudidian >=", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianLessThan(String value) {
            addCriterion("zhifudidian <", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianLessThanOrEqualTo(String value) {
            addCriterion("zhifudidian <=", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianLike(String value) {
            addCriterion("zhifudidian like", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianNotLike(String value) {
            addCriterion("zhifudidian not like", value, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianIn(List<String> values) {
            addCriterion("zhifudidian in", values, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianNotIn(List<String> values) {
            addCriterion("zhifudidian not in", values, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianBetween(String value1, String value2) {
            addCriterion("zhifudidian between", value1, value2, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifudidianNotBetween(String value1, String value2) {
            addCriterion("zhifudidian not between", value1, value2, "zhifudidian");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieIsNull() {
            addCriterion("zhifuleibie is null");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieIsNotNull() {
            addCriterion("zhifuleibie is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieEqualTo(String value) {
            addCriterion("zhifuleibie =", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieNotEqualTo(String value) {
            addCriterion("zhifuleibie <>", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieGreaterThan(String value) {
            addCriterion("zhifuleibie >", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieGreaterThanOrEqualTo(String value) {
            addCriterion("zhifuleibie >=", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieLessThan(String value) {
            addCriterion("zhifuleibie <", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieLessThanOrEqualTo(String value) {
            addCriterion("zhifuleibie <=", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieLike(String value) {
            addCriterion("zhifuleibie like", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieNotLike(String value) {
            addCriterion("zhifuleibie not like", value, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieIn(List<String> values) {
            addCriterion("zhifuleibie in", values, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieNotIn(List<String> values) {
            addCriterion("zhifuleibie not in", values, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieBetween(String value1, String value2) {
            addCriterion("zhifuleibie between", value1, value2, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andZhifuleibieNotBetween(String value1, String value2) {
            addCriterion("zhifuleibie not between", value1, value2, "zhifuleibie");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianIsNull() {
            addCriterion("ruyuanshijian is null");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianIsNotNull() {
            addCriterion("ruyuanshijian is not null");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianEqualTo(Date value) {
            addCriterion("ruyuanshijian =", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianNotEqualTo(Date value) {
            addCriterion("ruyuanshijian <>", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianGreaterThan(Date value) {
            addCriterion("ruyuanshijian >", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ruyuanshijian >=", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianLessThan(Date value) {
            addCriterion("ruyuanshijian <", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianLessThanOrEqualTo(Date value) {
            addCriterion("ruyuanshijian <=", value, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianIn(List<Date> values) {
            addCriterion("ruyuanshijian in", values, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianNotIn(List<Date> values) {
            addCriterion("ruyuanshijian not in", values, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianBetween(Date value1, Date value2) {
            addCriterion("ruyuanshijian between", value1, value2, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andRuyuanshijianNotBetween(Date value1, Date value2) {
            addCriterion("ruyuanshijian not between", value1, value2, "ruyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianIsNull() {
            addCriterion("chuyuanshijian is null");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianIsNotNull() {
            addCriterion("chuyuanshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianEqualTo(Date value) {
            addCriterion("chuyuanshijian =", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianNotEqualTo(Date value) {
            addCriterion("chuyuanshijian <>", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianGreaterThan(Date value) {
            addCriterion("chuyuanshijian >", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chuyuanshijian >=", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianLessThan(Date value) {
            addCriterion("chuyuanshijian <", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianLessThanOrEqualTo(Date value) {
            addCriterion("chuyuanshijian <=", value, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianIn(List<Date> values) {
            addCriterion("chuyuanshijian in", values, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianNotIn(List<Date> values) {
            addCriterion("chuyuanshijian not in", values, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianBetween(Date value1, Date value2) {
            addCriterion("chuyuanshijian between", value1, value2, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanshijianNotBetween(Date value1, Date value2) {
            addCriterion("chuyuanshijian not between", value1, value2, "chuyuanshijian");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoIsNull() {
            addCriterion("zhuyuanhao is null");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoIsNotNull() {
            addCriterion("zhuyuanhao is not null");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoEqualTo(String value) {
            addCriterion("zhuyuanhao =", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoNotEqualTo(String value) {
            addCriterion("zhuyuanhao <>", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoGreaterThan(String value) {
            addCriterion("zhuyuanhao >", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhuyuanhao >=", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoLessThan(String value) {
            addCriterion("zhuyuanhao <", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoLessThanOrEqualTo(String value) {
            addCriterion("zhuyuanhao <=", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoLike(String value) {
            addCriterion("zhuyuanhao like", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoNotLike(String value) {
            addCriterion("zhuyuanhao not like", value, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoIn(List<String> values) {
            addCriterion("zhuyuanhao in", values, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoNotIn(List<String> values) {
            addCriterion("zhuyuanhao not in", values, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoBetween(String value1, String value2) {
            addCriterion("zhuyuanhao between", value1, value2, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andZhuyuanhaoNotBetween(String value1, String value2) {
            addCriterion("zhuyuanhao not between", value1, value2, "zhuyuanhao");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianIsNull() {
            addCriterion("jiesuanshijian is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianIsNotNull() {
            addCriterion("jiesuanshijian is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianEqualTo(Date value) {
            addCriterion("jiesuanshijian =", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianNotEqualTo(Date value) {
            addCriterion("jiesuanshijian <>", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianGreaterThan(Date value) {
            addCriterion("jiesuanshijian >", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("jiesuanshijian >=", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianLessThan(Date value) {
            addCriterion("jiesuanshijian <", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianLessThanOrEqualTo(Date value) {
            addCriterion("jiesuanshijian <=", value, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianIn(List<Date> values) {
            addCriterion("jiesuanshijian in", values, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianNotIn(List<Date> values) {
            addCriterion("jiesuanshijian not in", values, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianBetween(Date value1, Date value2) {
            addCriterion("jiesuanshijian between", value1, value2, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andJiesuanshijianNotBetween(Date value1, Date value2) {
            addCriterion("jiesuanshijian not between", value1, value2, "jiesuanshijian");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanIsNull() {
            addCriterion("chuyuanzhenduan is null");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanIsNotNull() {
            addCriterion("chuyuanzhenduan is not null");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanEqualTo(String value) {
            addCriterion("chuyuanzhenduan =", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanNotEqualTo(String value) {
            addCriterion("chuyuanzhenduan <>", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanGreaterThan(String value) {
            addCriterion("chuyuanzhenduan >", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanGreaterThanOrEqualTo(String value) {
            addCriterion("chuyuanzhenduan >=", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanLessThan(String value) {
            addCriterion("chuyuanzhenduan <", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanLessThanOrEqualTo(String value) {
            addCriterion("chuyuanzhenduan <=", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanLike(String value) {
            addCriterion("chuyuanzhenduan like", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanNotLike(String value) {
            addCriterion("chuyuanzhenduan not like", value, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanIn(List<String> values) {
            addCriterion("chuyuanzhenduan in", values, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanNotIn(List<String> values) {
            addCriterion("chuyuanzhenduan not in", values, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanBetween(String value1, String value2) {
            addCriterion("chuyuanzhenduan between", value1, value2, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andChuyuanzhenduanNotBetween(String value1, String value2) {
            addCriterion("chuyuanzhenduan not between", value1, value2, "chuyuanzhenduan");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeIsNull() {
            addCriterion("feiyongzonge is null");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeIsNotNull() {
            addCriterion("feiyongzonge is not null");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeEqualTo(Float value) {
            addCriterion("feiyongzonge =", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeNotEqualTo(Float value) {
            addCriterion("feiyongzonge <>", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeGreaterThan(Float value) {
            addCriterion("feiyongzonge >", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeGreaterThanOrEqualTo(Float value) {
            addCriterion("feiyongzonge >=", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeLessThan(Float value) {
            addCriterion("feiyongzonge <", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeLessThanOrEqualTo(Float value) {
            addCriterion("feiyongzonge <=", value, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeIn(List<Float> values) {
            addCriterion("feiyongzonge in", values, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeNotIn(List<Float> values) {
            addCriterion("feiyongzonge not in", values, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeBetween(Float value1, Float value2) {
            addCriterion("feiyongzonge between", value1, value2, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andFeiyongzongeNotBetween(Float value1, Float value2) {
            addCriterion("feiyongzonge not between", value1, value2, "feiyongzonge");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiIsNull() {
            addCriterion("zhengcewaizifei is null");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiIsNotNull() {
            addCriterion("zhengcewaizifei is not null");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiEqualTo(Float value) {
            addCriterion("zhengcewaizifei =", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiNotEqualTo(Float value) {
            addCriterion("zhengcewaizifei <>", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiGreaterThan(Float value) {
            addCriterion("zhengcewaizifei >", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiGreaterThanOrEqualTo(Float value) {
            addCriterion("zhengcewaizifei >=", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiLessThan(Float value) {
            addCriterion("zhengcewaizifei <", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiLessThanOrEqualTo(Float value) {
            addCriterion("zhengcewaizifei <=", value, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiIn(List<Float> values) {
            addCriterion("zhengcewaizifei in", values, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiNotIn(List<Float> values) {
            addCriterion("zhengcewaizifei not in", values, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiBetween(Float value1, Float value2) {
            addCriterion("zhengcewaizifei between", value1, value2, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengcewaizifeiNotBetween(Float value1, Float value2) {
            addCriterion("zhengcewaizifei not between", value1, value2, "zhengcewaizifei");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineIsNull() {
            addCriterion("zhengceneiquanzifujine is null");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineIsNotNull() {
            addCriterion("zhengceneiquanzifujine is not null");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineEqualTo(Float value) {
            addCriterion("zhengceneiquanzifujine =", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineNotEqualTo(Float value) {
            addCriterion("zhengceneiquanzifujine <>", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineGreaterThan(Float value) {
            addCriterion("zhengceneiquanzifujine >", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineGreaterThanOrEqualTo(Float value) {
            addCriterion("zhengceneiquanzifujine >=", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineLessThan(Float value) {
            addCriterion("zhengceneiquanzifujine <", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineLessThanOrEqualTo(Float value) {
            addCriterion("zhengceneiquanzifujine <=", value, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineIn(List<Float> values) {
            addCriterion("zhengceneiquanzifujine in", values, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineNotIn(List<Float> values) {
            addCriterion("zhengceneiquanzifujine not in", values, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineBetween(Float value1, Float value2) {
            addCriterion("zhengceneiquanzifujine between", value1, value2, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneiquanzifujineNotBetween(Float value1, Float value2) {
            addCriterion("zhengceneiquanzifujine not between", value1, value2, "zhengceneiquanzifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineIsNull() {
            addCriterion("caobiaozifujine is null");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineIsNotNull() {
            addCriterion("caobiaozifujine is not null");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineEqualTo(Float value) {
            addCriterion("caobiaozifujine =", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineNotEqualTo(Float value) {
            addCriterion("caobiaozifujine <>", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineGreaterThan(Float value) {
            addCriterion("caobiaozifujine >", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineGreaterThanOrEqualTo(Float value) {
            addCriterion("caobiaozifujine >=", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineLessThan(Float value) {
            addCriterion("caobiaozifujine <", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineLessThanOrEqualTo(Float value) {
            addCriterion("caobiaozifujine <=", value, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineIn(List<Float> values) {
            addCriterion("caobiaozifujine in", values, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineNotIn(List<Float> values) {
            addCriterion("caobiaozifujine not in", values, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineBetween(Float value1, Float value2) {
            addCriterion("caobiaozifujine between", value1, value2, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andCaobiaozifujineNotBetween(Float value1, Float value2) {
            addCriterion("caobiaozifujine not between", value1, value2, "caobiaozifujine");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongIsNull() {
            addCriterion("zhengceneifeiyong is null");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongIsNotNull() {
            addCriterion("zhengceneifeiyong is not null");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongEqualTo(Float value) {
            addCriterion("zhengceneifeiyong =", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongNotEqualTo(Float value) {
            addCriterion("zhengceneifeiyong <>", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongGreaterThan(Float value) {
            addCriterion("zhengceneifeiyong >", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongGreaterThanOrEqualTo(Float value) {
            addCriterion("zhengceneifeiyong >=", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongLessThan(Float value) {
            addCriterion("zhengceneifeiyong <", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongLessThanOrEqualTo(Float value) {
            addCriterion("zhengceneifeiyong <=", value, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongIn(List<Float> values) {
            addCriterion("zhengceneifeiyong in", values, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongNotIn(List<Float> values) {
            addCriterion("zhengceneifeiyong not in", values, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongBetween(Float value1, Float value2) {
            addCriterion("zhengceneifeiyong between", value1, value2, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andZhengceneifeiyongNotBetween(Float value1, Float value2) {
            addCriterion("zhengceneifeiyong not between", value1, value2, "zhengceneifeiyong");
            return (Criteria) this;
        }

        public Criteria andQifuxianIsNull() {
            addCriterion("qifuxian is null");
            return (Criteria) this;
        }

        public Criteria andQifuxianIsNotNull() {
            addCriterion("qifuxian is not null");
            return (Criteria) this;
        }

        public Criteria andQifuxianEqualTo(Float value) {
            addCriterion("qifuxian =", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianNotEqualTo(Float value) {
            addCriterion("qifuxian <>", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianGreaterThan(Float value) {
            addCriterion("qifuxian >", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianGreaterThanOrEqualTo(Float value) {
            addCriterion("qifuxian >=", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianLessThan(Float value) {
            addCriterion("qifuxian <", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianLessThanOrEqualTo(Float value) {
            addCriterion("qifuxian <=", value, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianIn(List<Float> values) {
            addCriterion("qifuxian in", values, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianNotIn(List<Float> values) {
            addCriterion("qifuxian not in", values, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianBetween(Float value1, Float value2) {
            addCriterion("qifuxian between", value1, value2, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andQifuxianNotBetween(Float value1, Float value2) {
            addCriterion("qifuxian not between", value1, value2, "qifuxian");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuIsNull() {
            addCriterion("tongchouzhifu is null");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuIsNotNull() {
            addCriterion("tongchouzhifu is not null");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuEqualTo(Float value) {
            addCriterion("tongchouzhifu =", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuNotEqualTo(Float value) {
            addCriterion("tongchouzhifu <>", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuGreaterThan(Float value) {
            addCriterion("tongchouzhifu >", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuGreaterThanOrEqualTo(Float value) {
            addCriterion("tongchouzhifu >=", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuLessThan(Float value) {
            addCriterion("tongchouzhifu <", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuLessThanOrEqualTo(Float value) {
            addCriterion("tongchouzhifu <=", value, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuIn(List<Float> values) {
            addCriterion("tongchouzhifu in", values, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuNotIn(List<Float> values) {
            addCriterion("tongchouzhifu not in", values, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuBetween(Float value1, Float value2) {
            addCriterion("tongchouzhifu between", value1, value2, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andTongchouzhifuNotBetween(Float value1, Float value2) {
            addCriterion("tongchouzhifu not between", value1, value2, "tongchouzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuIsNull() {
            addCriterion("dabingzhifu is null");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuIsNotNull() {
            addCriterion("dabingzhifu is not null");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuEqualTo(Float value) {
            addCriterion("dabingzhifu =", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuNotEqualTo(Float value) {
            addCriterion("dabingzhifu <>", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuGreaterThan(Float value) {
            addCriterion("dabingzhifu >", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuGreaterThanOrEqualTo(Float value) {
            addCriterion("dabingzhifu >=", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuLessThan(Float value) {
            addCriterion("dabingzhifu <", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuLessThanOrEqualTo(Float value) {
            addCriterion("dabingzhifu <=", value, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuIn(List<Float> values) {
            addCriterion("dabingzhifu in", values, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuNotIn(List<Float> values) {
            addCriterion("dabingzhifu not in", values, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuBetween(Float value1, Float value2) {
            addCriterion("dabingzhifu between", value1, value2, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingzhifuNotBetween(Float value1, Float value2) {
            addCriterion("dabingzhifu not between", value1, value2, "dabingzhifu");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiIsNull() {
            addCriterion("zhuyuanzhenliaofei is null");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiIsNotNull() {
            addCriterion("zhuyuanzhenliaofei is not null");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiEqualTo(Float value) {
            addCriterion("zhuyuanzhenliaofei =", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiNotEqualTo(Float value) {
            addCriterion("zhuyuanzhenliaofei <>", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiGreaterThan(Float value) {
            addCriterion("zhuyuanzhenliaofei >", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiGreaterThanOrEqualTo(Float value) {
            addCriterion("zhuyuanzhenliaofei >=", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiLessThan(Float value) {
            addCriterion("zhuyuanzhenliaofei <", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiLessThanOrEqualTo(Float value) {
            addCriterion("zhuyuanzhenliaofei <=", value, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiIn(List<Float> values) {
            addCriterion("zhuyuanzhenliaofei in", values, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiNotIn(List<Float> values) {
            addCriterion("zhuyuanzhenliaofei not in", values, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiBetween(Float value1, Float value2) {
            addCriterion("zhuyuanzhenliaofei between", value1, value2, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andZhuyuanzhenliaofeiNotBetween(Float value1, Float value2) {
            addCriterion("zhuyuanzhenliaofei not between", value1, value2, "zhuyuanzhenliaofei");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiIsNull() {
            addCriterion("bencidabingleiji is null");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiIsNotNull() {
            addCriterion("bencidabingleiji is not null");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiEqualTo(Float value) {
            addCriterion("bencidabingleiji =", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiNotEqualTo(Float value) {
            addCriterion("bencidabingleiji <>", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiGreaterThan(Float value) {
            addCriterion("bencidabingleiji >", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiGreaterThanOrEqualTo(Float value) {
            addCriterion("bencidabingleiji >=", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiLessThan(Float value) {
            addCriterion("bencidabingleiji <", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiLessThanOrEqualTo(Float value) {
            addCriterion("bencidabingleiji <=", value, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiIn(List<Float> values) {
            addCriterion("bencidabingleiji in", values, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiNotIn(List<Float> values) {
            addCriterion("bencidabingleiji not in", values, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiBetween(Float value1, Float value2) {
            addCriterion("bencidabingleiji between", value1, value2, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andBencidabingleijiNotBetween(Float value1, Float value2) {
            addCriterion("bencidabingleiji not between", value1, value2, "bencidabingleiji");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongIsNull() {
            addCriterion("weiguifeiyong is null");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongIsNotNull() {
            addCriterion("weiguifeiyong is not null");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongEqualTo(Float value) {
            addCriterion("weiguifeiyong =", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongNotEqualTo(Float value) {
            addCriterion("weiguifeiyong <>", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongGreaterThan(Float value) {
            addCriterion("weiguifeiyong >", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongGreaterThanOrEqualTo(Float value) {
            addCriterion("weiguifeiyong >=", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongLessThan(Float value) {
            addCriterion("weiguifeiyong <", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongLessThanOrEqualTo(Float value) {
            addCriterion("weiguifeiyong <=", value, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongIn(List<Float> values) {
            addCriterion("weiguifeiyong in", values, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongNotIn(List<Float> values) {
            addCriterion("weiguifeiyong not in", values, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongBetween(Float value1, Float value2) {
            addCriterion("weiguifeiyong between", value1, value2, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andWeiguifeiyongNotBetween(Float value1, Float value2) {
            addCriterion("weiguifeiyong not between", value1, value2, "weiguifeiyong");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianIsNull() {
            addCriterion("gerenfuxian is null");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianIsNotNull() {
            addCriterion("gerenfuxian is not null");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianEqualTo(Float value) {
            addCriterion("gerenfuxian =", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianNotEqualTo(Float value) {
            addCriterion("gerenfuxian <>", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianGreaterThan(Float value) {
            addCriterion("gerenfuxian >", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianGreaterThanOrEqualTo(Float value) {
            addCriterion("gerenfuxian >=", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianLessThan(Float value) {
            addCriterion("gerenfuxian <", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianLessThanOrEqualTo(Float value) {
            addCriterion("gerenfuxian <=", value, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianIn(List<Float> values) {
            addCriterion("gerenfuxian in", values, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianNotIn(List<Float> values) {
            addCriterion("gerenfuxian not in", values, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianBetween(Float value1, Float value2) {
            addCriterion("gerenfuxian between", value1, value2, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andGerenfuxianNotBetween(Float value1, Float value2) {
            addCriterion("gerenfuxian not between", value1, value2, "gerenfuxian");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenIsNull() {
            addCriterion("jiesuanren is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenIsNotNull() {
            addCriterion("jiesuanren is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenEqualTo(String value) {
            addCriterion("jiesuanren =", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenNotEqualTo(String value) {
            addCriterion("jiesuanren <>", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenGreaterThan(String value) {
            addCriterion("jiesuanren >", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenGreaterThanOrEqualTo(String value) {
            addCriterion("jiesuanren >=", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenLessThan(String value) {
            addCriterion("jiesuanren <", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenLessThanOrEqualTo(String value) {
            addCriterion("jiesuanren <=", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenLike(String value) {
            addCriterion("jiesuanren like", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenNotLike(String value) {
            addCriterion("jiesuanren not like", value, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenIn(List<String> values) {
            addCriterion("jiesuanren in", values, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenNotIn(List<String> values) {
            addCriterion("jiesuanren not in", values, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenBetween(String value1, String value2) {
            addCriterion("jiesuanren between", value1, value2, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andJiesuanrenNotBetween(String value1, String value2) {
            addCriterion("jiesuanren not between", value1, value2, "jiesuanren");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangIsNull() {
            addCriterion("zhifuduixiang is null");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangIsNotNull() {
            addCriterion("zhifuduixiang is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangEqualTo(String value) {
            addCriterion("zhifuduixiang =", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangNotEqualTo(String value) {
            addCriterion("zhifuduixiang <>", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangGreaterThan(String value) {
            addCriterion("zhifuduixiang >", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangGreaterThanOrEqualTo(String value) {
            addCriterion("zhifuduixiang >=", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangLessThan(String value) {
            addCriterion("zhifuduixiang <", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangLessThanOrEqualTo(String value) {
            addCriterion("zhifuduixiang <=", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangLike(String value) {
            addCriterion("zhifuduixiang like", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangNotLike(String value) {
            addCriterion("zhifuduixiang not like", value, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangIn(List<String> values) {
            addCriterion("zhifuduixiang in", values, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangNotIn(List<String> values) {
            addCriterion("zhifuduixiang not in", values, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangBetween(String value1, String value2) {
            addCriterion("zhifuduixiang between", value1, value2, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andZhifuduixiangNotBetween(String value1, String value2) {
            addCriterion("zhifuduixiang not between", value1, value2, "zhifuduixiang");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanIsNull() {
            addCriterion("shifoujishijiesuan is null");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanIsNotNull() {
            addCriterion("shifoujishijiesuan is not null");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanEqualTo(String value) {
            addCriterion("shifoujishijiesuan =", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanNotEqualTo(String value) {
            addCriterion("shifoujishijiesuan <>", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanGreaterThan(String value) {
            addCriterion("shifoujishijiesuan >", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanGreaterThanOrEqualTo(String value) {
            addCriterion("shifoujishijiesuan >=", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanLessThan(String value) {
            addCriterion("shifoujishijiesuan <", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanLessThanOrEqualTo(String value) {
            addCriterion("shifoujishijiesuan <=", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanLike(String value) {
            addCriterion("shifoujishijiesuan like", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanNotLike(String value) {
            addCriterion("shifoujishijiesuan not like", value, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanIn(List<String> values) {
            addCriterion("shifoujishijiesuan in", values, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanNotIn(List<String> values) {
            addCriterion("shifoujishijiesuan not in", values, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanBetween(String value1, String value2) {
            addCriterion("shifoujishijiesuan between", value1, value2, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andShifoujishijiesuanNotBetween(String value1, String value2) {
            addCriterion("shifoujishijiesuan not between", value1, value2, "shifoujishijiesuan");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianIsNull() {
            addCriterion("dabingbaoxianqifuxian is null");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianIsNotNull() {
            addCriterion("dabingbaoxianqifuxian is not null");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianEqualTo(Float value) {
            addCriterion("dabingbaoxianqifuxian =", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianNotEqualTo(Float value) {
            addCriterion("dabingbaoxianqifuxian <>", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianGreaterThan(Float value) {
            addCriterion("dabingbaoxianqifuxian >", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianGreaterThanOrEqualTo(Float value) {
            addCriterion("dabingbaoxianqifuxian >=", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianLessThan(Float value) {
            addCriterion("dabingbaoxianqifuxian <", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianLessThanOrEqualTo(Float value) {
            addCriterion("dabingbaoxianqifuxian <=", value, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianIn(List<Float> values) {
            addCriterion("dabingbaoxianqifuxian in", values, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianNotIn(List<Float> values) {
            addCriterion("dabingbaoxianqifuxian not in", values, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianBetween(Float value1, Float value2) {
            addCriterion("dabingbaoxianqifuxian between", value1, value2, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianqifuxianNotBetween(Float value1, Float value2) {
            addCriterion("dabingbaoxianqifuxian not between", value1, value2, "dabingbaoxianqifuxian");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuIsNull() {
            addCriterion("dabingbaoxianzhifu is null");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuIsNotNull() {
            addCriterion("dabingbaoxianzhifu is not null");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuEqualTo(Float value) {
            addCriterion("dabingbaoxianzhifu =", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuNotEqualTo(Float value) {
            addCriterion("dabingbaoxianzhifu <>", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuGreaterThan(Float value) {
            addCriterion("dabingbaoxianzhifu >", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuGreaterThanOrEqualTo(Float value) {
            addCriterion("dabingbaoxianzhifu >=", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuLessThan(Float value) {
            addCriterion("dabingbaoxianzhifu <", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuLessThanOrEqualTo(Float value) {
            addCriterion("dabingbaoxianzhifu <=", value, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuIn(List<Float> values) {
            addCriterion("dabingbaoxianzhifu in", values, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuNotIn(List<Float> values) {
            addCriterion("dabingbaoxianzhifu not in", values, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuBetween(Float value1, Float value2) {
            addCriterion("dabingbaoxianzhifu between", value1, value2, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andDabingbaoxianzhifuNotBetween(Float value1, Float value2) {
            addCriterion("dabingbaoxianzhifu not between", value1, value2, "dabingbaoxianzhifu");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongIsNull() {
            addCriterion("weibanzhuanzhenkoujianfeiyong is null");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongIsNotNull() {
            addCriterion("weibanzhuanzhenkoujianfeiyong is not null");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongEqualTo(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong =", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongNotEqualTo(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong <>", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongGreaterThan(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong >", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongGreaterThanOrEqualTo(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong >=", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongLessThan(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong <", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongLessThanOrEqualTo(Float value) {
            addCriterion("weibanzhuanzhenkoujianfeiyong <=", value, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongIn(List<Float> values) {
            addCriterion("weibanzhuanzhenkoujianfeiyong in", values, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongNotIn(List<Float> values) {
            addCriterion("weibanzhuanzhenkoujianfeiyong not in", values, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongBetween(Float value1, Float value2) {
            addCriterion("weibanzhuanzhenkoujianfeiyong between", value1, value2, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andWeibanzhuanzhenkoujianfeiyongNotBetween(Float value1, Float value2) {
            addCriterion("weibanzhuanzhenkoujianfeiyong not between", value1, value2, "weibanzhuanzhenkoujianfeiyong");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuIsNull() {
            addCriterion("dangnianduzhuyuancishu is null");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuIsNotNull() {
            addCriterion("dangnianduzhuyuancishu is not null");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuEqualTo(Integer value) {
            addCriterion("dangnianduzhuyuancishu =", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuNotEqualTo(Integer value) {
            addCriterion("dangnianduzhuyuancishu <>", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuGreaterThan(Integer value) {
            addCriterion("dangnianduzhuyuancishu >", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("dangnianduzhuyuancishu >=", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuLessThan(Integer value) {
            addCriterion("dangnianduzhuyuancishu <", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuLessThanOrEqualTo(Integer value) {
            addCriterion("dangnianduzhuyuancishu <=", value, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuIn(List<Integer> values) {
            addCriterion("dangnianduzhuyuancishu in", values, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuNotIn(List<Integer> values) {
            addCriterion("dangnianduzhuyuancishu not in", values, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuBetween(Integer value1, Integer value2) {
            addCriterion("dangnianduzhuyuancishu between", value1, value2, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDangnianduzhuyuancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("dangnianduzhuyuancishu not between", value1, value2, "dangnianduzhuyuancishu");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNull() {
            addCriterion("dianhua is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNotNull() {
            addCriterion("dianhua is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaEqualTo(String value) {
            addCriterion("dianhua =", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotEqualTo(String value) {
            addCriterion("dianhua <>", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThan(String value) {
            addCriterion("dianhua >", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("dianhua >=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThan(String value) {
            addCriterion("dianhua <", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThanOrEqualTo(String value) {
            addCriterion("dianhua <=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLike(String value) {
            addCriterion("dianhua like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotLike(String value) {
            addCriterion("dianhua not like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaIn(List<String> values) {
            addCriterion("dianhua in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotIn(List<String> values) {
            addCriterion("dianhua not in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaBetween(String value1, String value2) {
            addCriterion("dianhua between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotBetween(String value1, String value2) {
            addCriterion("dianhua not between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andZhifurenIsNull() {
            addCriterion("zhifuren is null");
            return (Criteria) this;
        }

        public Criteria andZhifurenIsNotNull() {
            addCriterion("zhifuren is not null");
            return (Criteria) this;
        }

        public Criteria andZhifurenEqualTo(String value) {
            addCriterion("zhifuren =", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenNotEqualTo(String value) {
            addCriterion("zhifuren <>", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenGreaterThan(String value) {
            addCriterion("zhifuren >", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenGreaterThanOrEqualTo(String value) {
            addCriterion("zhifuren >=", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenLessThan(String value) {
            addCriterion("zhifuren <", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenLessThanOrEqualTo(String value) {
            addCriterion("zhifuren <=", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenLike(String value) {
            addCriterion("zhifuren like", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenNotLike(String value) {
            addCriterion("zhifuren not like", value, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenIn(List<String> values) {
            addCriterion("zhifuren in", values, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenNotIn(List<String> values) {
            addCriterion("zhifuren not in", values, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenBetween(String value1, String value2) {
            addCriterion("zhifuren between", value1, value2, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifurenNotBetween(String value1, String value2) {
            addCriterion("zhifuren not between", value1, value2, "zhifuren");
            return (Criteria) this;
        }

        public Criteria andZhifushijianIsNull() {
            addCriterion("zhifushijian is null");
            return (Criteria) this;
        }

        public Criteria andZhifushijianIsNotNull() {
            addCriterion("zhifushijian is not null");
            return (Criteria) this;
        }

        public Criteria andZhifushijianEqualTo(Date value) {
            addCriterion("zhifushijian =", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianNotEqualTo(Date value) {
            addCriterion("zhifushijian <>", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianGreaterThan(Date value) {
            addCriterion("zhifushijian >", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("zhifushijian >=", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianLessThan(Date value) {
            addCriterion("zhifushijian <", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianLessThanOrEqualTo(Date value) {
            addCriterion("zhifushijian <=", value, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianIn(List<Date> values) {
            addCriterion("zhifushijian in", values, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianNotIn(List<Date> values) {
            addCriterion("zhifushijian not in", values, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianBetween(Date value1, Date value2) {
            addCriterion("zhifushijian between", value1, value2, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andZhifushijianNotBetween(Date value1, Date value2) {
            addCriterion("zhifushijian not between", value1, value2, "zhifushijian");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiIsNull() {
            addCriterion("baoxiangongshi is null");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiIsNotNull() {
            addCriterion("baoxiangongshi is not null");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiEqualTo(String value) {
            addCriterion("baoxiangongshi =", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiNotEqualTo(String value) {
            addCriterion("baoxiangongshi <>", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiGreaterThan(String value) {
            addCriterion("baoxiangongshi >", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiGreaterThanOrEqualTo(String value) {
            addCriterion("baoxiangongshi >=", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiLessThan(String value) {
            addCriterion("baoxiangongshi <", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiLessThanOrEqualTo(String value) {
            addCriterion("baoxiangongshi <=", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiLike(String value) {
            addCriterion("baoxiangongshi like", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiNotLike(String value) {
            addCriterion("baoxiangongshi not like", value, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiIn(List<String> values) {
            addCriterion("baoxiangongshi in", values, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiNotIn(List<String> values) {
            addCriterion("baoxiangongshi not in", values, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiBetween(String value1, String value2) {
            addCriterion("baoxiangongshi between", value1, value2, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBaoxiangongshiNotBetween(String value1, String value2) {
            addCriterion("baoxiangongshi not between", value1, value2, "baoxiangongshi");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiIsNull() {
            addCriterion("benciqiandabingleiji is null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiIsNotNull() {
            addCriterion("benciqiandabingleiji is not null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiEqualTo(Float value) {
            addCriterion("benciqiandabingleiji =", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiNotEqualTo(Float value) {
            addCriterion("benciqiandabingleiji <>", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiGreaterThan(Float value) {
            addCriterion("benciqiandabingleiji >", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiGreaterThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji >=", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiLessThan(Float value) {
            addCriterion("benciqiandabingleiji <", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiLessThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji <=", value, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiIn(List<Float> values) {
            addCriterion("benciqiandabingleiji in", values, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiNotIn(List<Float> values) {
            addCriterion("benciqiandabingleiji not in", values, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiBetween(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji between", value1, value2, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleijiNotBetween(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji not between", value1, value2, "benciqiandabingleiji");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanIsNull() {
            addCriterion("dabingchongsuan is null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanIsNotNull() {
            addCriterion("dabingchongsuan is not null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanEqualTo(Float value) {
            addCriterion("dabingchongsuan =", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanNotEqualTo(Float value) {
            addCriterion("dabingchongsuan <>", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanGreaterThan(Float value) {
            addCriterion("dabingchongsuan >", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanGreaterThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan >=", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanLessThan(Float value) {
            addCriterion("dabingchongsuan <", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanLessThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan <=", value, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanIn(List<Float> values) {
            addCriterion("dabingchongsuan in", values, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanNotIn(List<Float> values) {
            addCriterion("dabingchongsuan not in", values, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanBetween(Float value1, Float value2) {
            addCriterion("dabingchongsuan between", value1, value2, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuanNotBetween(Float value1, Float value2) {
            addCriterion("dabingchongsuan not between", value1, value2, "dabingchongsuan");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2IsNull() {
            addCriterion("bencidabingleiji2 is null");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2IsNotNull() {
            addCriterion("bencidabingleiji2 is not null");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2EqualTo(Float value) {
            addCriterion("bencidabingleiji2 =", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2NotEqualTo(Float value) {
            addCriterion("bencidabingleiji2 <>", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2GreaterThan(Float value) {
            addCriterion("bencidabingleiji2 >", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2GreaterThanOrEqualTo(Float value) {
            addCriterion("bencidabingleiji2 >=", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2LessThan(Float value) {
            addCriterion("bencidabingleiji2 <", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2LessThanOrEqualTo(Float value) {
            addCriterion("bencidabingleiji2 <=", value, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2In(List<Float> values) {
            addCriterion("bencidabingleiji2 in", values, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2NotIn(List<Float> values) {
            addCriterion("bencidabingleiji2 not in", values, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2Between(Float value1, Float value2) {
            addCriterion("bencidabingleiji2 between", value1, value2, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBencidabingleiji2NotBetween(Float value1, Float value2) {
            addCriterion("bencidabingleiji2 not between", value1, value2, "bencidabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2IsNull() {
            addCriterion("benciqiandabingleiji2 is null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2IsNotNull() {
            addCriterion("benciqiandabingleiji2 is not null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2EqualTo(Float value) {
            addCriterion("benciqiandabingleiji2 =", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2NotEqualTo(Float value) {
            addCriterion("benciqiandabingleiji2 <>", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2GreaterThan(Float value) {
            addCriterion("benciqiandabingleiji2 >", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2GreaterThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji2 >=", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2LessThan(Float value) {
            addCriterion("benciqiandabingleiji2 <", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2LessThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji2 <=", value, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2In(List<Float> values) {
            addCriterion("benciqiandabingleiji2 in", values, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2NotIn(List<Float> values) {
            addCriterion("benciqiandabingleiji2 not in", values, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2Between(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji2 between", value1, value2, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji2NotBetween(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji2 not between", value1, value2, "benciqiandabingleiji2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2IsNull() {
            addCriterion("dabingchongsuan2 is null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2IsNotNull() {
            addCriterion("dabingchongsuan2 is not null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2EqualTo(Float value) {
            addCriterion("dabingchongsuan2 =", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2NotEqualTo(Float value) {
            addCriterion("dabingchongsuan2 <>", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2GreaterThan(Float value) {
            addCriterion("dabingchongsuan2 >", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2GreaterThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan2 >=", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2LessThan(Float value) {
            addCriterion("dabingchongsuan2 <", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2LessThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan2 <=", value, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2In(List<Float> values) {
            addCriterion("dabingchongsuan2 in", values, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2NotIn(List<Float> values) {
            addCriterion("dabingchongsuan2 not in", values, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2Between(Float value1, Float value2) {
            addCriterion("dabingchongsuan2 between", value1, value2, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan2NotBetween(Float value1, Float value2) {
            addCriterion("dabingchongsuan2 not between", value1, value2, "dabingchongsuan2");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3IsNull() {
            addCriterion("benciqiandabingleiji3 is null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3IsNotNull() {
            addCriterion("benciqiandabingleiji3 is not null");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3EqualTo(Float value) {
            addCriterion("benciqiandabingleiji3 =", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3NotEqualTo(Float value) {
            addCriterion("benciqiandabingleiji3 <>", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3GreaterThan(Float value) {
            addCriterion("benciqiandabingleiji3 >", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3GreaterThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji3 >=", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3LessThan(Float value) {
            addCriterion("benciqiandabingleiji3 <", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3LessThanOrEqualTo(Float value) {
            addCriterion("benciqiandabingleiji3 <=", value, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3In(List<Float> values) {
            addCriterion("benciqiandabingleiji3 in", values, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3NotIn(List<Float> values) {
            addCriterion("benciqiandabingleiji3 not in", values, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3Between(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji3 between", value1, value2, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andBenciqiandabingleiji3NotBetween(Float value1, Float value2) {
            addCriterion("benciqiandabingleiji3 not between", value1, value2, "benciqiandabingleiji3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3IsNull() {
            addCriterion("dabingchongsuan3 is null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3IsNotNull() {
            addCriterion("dabingchongsuan3 is not null");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3EqualTo(Float value) {
            addCriterion("dabingchongsuan3 =", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3NotEqualTo(Float value) {
            addCriterion("dabingchongsuan3 <>", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3GreaterThan(Float value) {
            addCriterion("dabingchongsuan3 >", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3GreaterThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan3 >=", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3LessThan(Float value) {
            addCriterion("dabingchongsuan3 <", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3LessThanOrEqualTo(Float value) {
            addCriterion("dabingchongsuan3 <=", value, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3In(List<Float> values) {
            addCriterion("dabingchongsuan3 in", values, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3NotIn(List<Float> values) {
            addCriterion("dabingchongsuan3 not in", values, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3Between(Float value1, Float value2) {
            addCriterion("dabingchongsuan3 between", value1, value2, "dabingchongsuan3");
            return (Criteria) this;
        }

        public Criteria andDabingchongsuan3NotBetween(Float value1, Float value2) {
            addCriterion("dabingchongsuan3 not between", value1, value2, "dabingchongsuan3");
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