package com.github.simpleblog.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class linkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public linkExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNull() {
            addCriterion("linkAddress is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNotNull() {
            addCriterion("linkAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressEqualTo(String value) {
            addCriterion("linkAddress =", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotEqualTo(String value) {
            addCriterion("linkAddress <>", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThan(String value) {
            addCriterion("linkAddress >", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("linkAddress >=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThan(String value) {
            addCriterion("linkAddress <", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThanOrEqualTo(String value) {
            addCriterion("linkAddress <=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLike(String value) {
            addCriterion("linkAddress like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotLike(String value) {
            addCriterion("linkAddress not like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIn(List<String> values) {
            addCriterion("linkAddress in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotIn(List<String> values) {
            addCriterion("linkAddress not in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressBetween(String value1, String value2) {
            addCriterion("linkAddress between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotBetween(String value1, String value2) {
            addCriterion("linkAddress not between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionIsNull() {
            addCriterion("linkDescription is null");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionIsNotNull() {
            addCriterion("linkDescription is not null");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionEqualTo(String value) {
            addCriterion("linkDescription =", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionNotEqualTo(String value) {
            addCriterion("linkDescription <>", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionGreaterThan(String value) {
            addCriterion("linkDescription >", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("linkDescription >=", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionLessThan(String value) {
            addCriterion("linkDescription <", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionLessThanOrEqualTo(String value) {
            addCriterion("linkDescription <=", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionLike(String value) {
            addCriterion("linkDescription like", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionNotLike(String value) {
            addCriterion("linkDescription not like", value, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionIn(List<String> values) {
            addCriterion("linkDescription in", values, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionNotIn(List<String> values) {
            addCriterion("linkDescription not in", values, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionBetween(String value1, String value2) {
            addCriterion("linkDescription between", value1, value2, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkdescriptionNotBetween(String value1, String value2) {
            addCriterion("linkDescription not between", value1, value2, "linkdescription");
            return (Criteria) this;
        }

        public Criteria andLinkorderIsNull() {
            addCriterion("linkOrder is null");
            return (Criteria) this;
        }

        public Criteria andLinkorderIsNotNull() {
            addCriterion("linkOrder is not null");
            return (Criteria) this;
        }

        public Criteria andLinkorderEqualTo(Integer value) {
            addCriterion("linkOrder =", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderNotEqualTo(Integer value) {
            addCriterion("linkOrder <>", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderGreaterThan(Integer value) {
            addCriterion("linkOrder >", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkOrder >=", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderLessThan(Integer value) {
            addCriterion("linkOrder <", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderLessThanOrEqualTo(Integer value) {
            addCriterion("linkOrder <=", value, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderIn(List<Integer> values) {
            addCriterion("linkOrder in", values, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderNotIn(List<Integer> values) {
            addCriterion("linkOrder not in", values, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderBetween(Integer value1, Integer value2) {
            addCriterion("linkOrder between", value1, value2, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinkorderNotBetween(Integer value1, Integer value2) {
            addCriterion("linkOrder not between", value1, value2, "linkorder");
            return (Criteria) this;
        }

        public Criteria andLinktitleIsNull() {
            addCriterion("linkTitle is null");
            return (Criteria) this;
        }

        public Criteria andLinktitleIsNotNull() {
            addCriterion("linkTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLinktitleEqualTo(String value) {
            addCriterion("linkTitle =", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotEqualTo(String value) {
            addCriterion("linkTitle <>", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleGreaterThan(String value) {
            addCriterion("linkTitle >", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleGreaterThanOrEqualTo(String value) {
            addCriterion("linkTitle >=", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLessThan(String value) {
            addCriterion("linkTitle <", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLessThanOrEqualTo(String value) {
            addCriterion("linkTitle <=", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLike(String value) {
            addCriterion("linkTitle like", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotLike(String value) {
            addCriterion("linkTitle not like", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleIn(List<String> values) {
            addCriterion("linkTitle in", values, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotIn(List<String> values) {
            addCriterion("linkTitle not in", values, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleBetween(String value1, String value2) {
            addCriterion("linkTitle between", value1, value2, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotBetween(String value1, String value2) {
            addCriterion("linkTitle not between", value1, value2, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinkiconIsNull() {
            addCriterion("linkIcon is null");
            return (Criteria) this;
        }

        public Criteria andLinkiconIsNotNull() {
            addCriterion("linkIcon is not null");
            return (Criteria) this;
        }

        public Criteria andLinkiconEqualTo(String value) {
            addCriterion("linkIcon =", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconNotEqualTo(String value) {
            addCriterion("linkIcon <>", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconGreaterThan(String value) {
            addCriterion("linkIcon >", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconGreaterThanOrEqualTo(String value) {
            addCriterion("linkIcon >=", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconLessThan(String value) {
            addCriterion("linkIcon <", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconLessThanOrEqualTo(String value) {
            addCriterion("linkIcon <=", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconLike(String value) {
            addCriterion("linkIcon like", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconNotLike(String value) {
            addCriterion("linkIcon not like", value, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconIn(List<String> values) {
            addCriterion("linkIcon in", values, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconNotIn(List<String> values) {
            addCriterion("linkIcon not in", values, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconBetween(String value1, String value2) {
            addCriterion("linkIcon between", value1, value2, "linkicon");
            return (Criteria) this;
        }

        public Criteria andLinkiconNotBetween(String value1, String value2) {
            addCriterion("linkIcon not between", value1, value2, "linkicon");
            return (Criteria) this;
        }
    }

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