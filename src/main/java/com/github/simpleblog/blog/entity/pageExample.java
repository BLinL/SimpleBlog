package com.github.simpleblog.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class pageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pageExample() {
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

        public Criteria andPageorderIsNull() {
            addCriterion("pageOrder is null");
            return (Criteria) this;
        }

        public Criteria andPageorderIsNotNull() {
            addCriterion("pageOrder is not null");
            return (Criteria) this;
        }

        public Criteria andPageorderEqualTo(Integer value) {
            addCriterion("pageOrder =", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderNotEqualTo(Integer value) {
            addCriterion("pageOrder <>", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderGreaterThan(Integer value) {
            addCriterion("pageOrder >", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageOrder >=", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderLessThan(Integer value) {
            addCriterion("pageOrder <", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderLessThanOrEqualTo(Integer value) {
            addCriterion("pageOrder <=", value, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderIn(List<Integer> values) {
            addCriterion("pageOrder in", values, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderNotIn(List<Integer> values) {
            addCriterion("pageOrder not in", values, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderBetween(Integer value1, Integer value2) {
            addCriterion("pageOrder between", value1, value2, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPageorderNotBetween(Integer value1, Integer value2) {
            addCriterion("pageOrder not between", value1, value2, "pageorder");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkIsNull() {
            addCriterion("pagePermalink is null");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkIsNotNull() {
            addCriterion("pagePermalink is not null");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkEqualTo(String value) {
            addCriterion("pagePermalink =", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkNotEqualTo(String value) {
            addCriterion("pagePermalink <>", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkGreaterThan(String value) {
            addCriterion("pagePermalink >", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkGreaterThanOrEqualTo(String value) {
            addCriterion("pagePermalink >=", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkLessThan(String value) {
            addCriterion("pagePermalink <", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkLessThanOrEqualTo(String value) {
            addCriterion("pagePermalink <=", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkLike(String value) {
            addCriterion("pagePermalink like", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkNotLike(String value) {
            addCriterion("pagePermalink not like", value, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkIn(List<String> values) {
            addCriterion("pagePermalink in", values, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkNotIn(List<String> values) {
            addCriterion("pagePermalink not in", values, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkBetween(String value1, String value2) {
            addCriterion("pagePermalink between", value1, value2, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagepermalinkNotBetween(String value1, String value2) {
            addCriterion("pagePermalink not between", value1, value2, "pagepermalink");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNull() {
            addCriterion("pageTitle is null");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNotNull() {
            addCriterion("pageTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPagetitleEqualTo(String value) {
            addCriterion("pageTitle =", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotEqualTo(String value) {
            addCriterion("pageTitle <>", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThan(String value) {
            addCriterion("pageTitle >", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("pageTitle >=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThan(String value) {
            addCriterion("pageTitle <", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThanOrEqualTo(String value) {
            addCriterion("pageTitle <=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLike(String value) {
            addCriterion("pageTitle like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotLike(String value) {
            addCriterion("pageTitle not like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleIn(List<String> values) {
            addCriterion("pageTitle in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotIn(List<String> values) {
            addCriterion("pageTitle not in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleBetween(String value1, String value2) {
            addCriterion("pageTitle between", value1, value2, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotBetween(String value1, String value2) {
            addCriterion("pageTitle not between", value1, value2, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPageopentargetIsNull() {
            addCriterion("pageOpenTarget is null");
            return (Criteria) this;
        }

        public Criteria andPageopentargetIsNotNull() {
            addCriterion("pageOpenTarget is not null");
            return (Criteria) this;
        }

        public Criteria andPageopentargetEqualTo(String value) {
            addCriterion("pageOpenTarget =", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetNotEqualTo(String value) {
            addCriterion("pageOpenTarget <>", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetGreaterThan(String value) {
            addCriterion("pageOpenTarget >", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetGreaterThanOrEqualTo(String value) {
            addCriterion("pageOpenTarget >=", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetLessThan(String value) {
            addCriterion("pageOpenTarget <", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetLessThanOrEqualTo(String value) {
            addCriterion("pageOpenTarget <=", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetLike(String value) {
            addCriterion("pageOpenTarget like", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetNotLike(String value) {
            addCriterion("pageOpenTarget not like", value, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetIn(List<String> values) {
            addCriterion("pageOpenTarget in", values, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetNotIn(List<String> values) {
            addCriterion("pageOpenTarget not in", values, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetBetween(String value1, String value2) {
            addCriterion("pageOpenTarget between", value1, value2, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageopentargetNotBetween(String value1, String value2) {
            addCriterion("pageOpenTarget not between", value1, value2, "pageopentarget");
            return (Criteria) this;
        }

        public Criteria andPageiconIsNull() {
            addCriterion("pageIcon is null");
            return (Criteria) this;
        }

        public Criteria andPageiconIsNotNull() {
            addCriterion("pageIcon is not null");
            return (Criteria) this;
        }

        public Criteria andPageiconEqualTo(String value) {
            addCriterion("pageIcon =", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconNotEqualTo(String value) {
            addCriterion("pageIcon <>", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconGreaterThan(String value) {
            addCriterion("pageIcon >", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconGreaterThanOrEqualTo(String value) {
            addCriterion("pageIcon >=", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconLessThan(String value) {
            addCriterion("pageIcon <", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconLessThanOrEqualTo(String value) {
            addCriterion("pageIcon <=", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconLike(String value) {
            addCriterion("pageIcon like", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconNotLike(String value) {
            addCriterion("pageIcon not like", value, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconIn(List<String> values) {
            addCriterion("pageIcon in", values, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconNotIn(List<String> values) {
            addCriterion("pageIcon not in", values, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconBetween(String value1, String value2) {
            addCriterion("pageIcon between", value1, value2, "pageicon");
            return (Criteria) this;
        }

        public Criteria andPageiconNotBetween(String value1, String value2) {
            addCriterion("pageIcon not between", value1, value2, "pageicon");
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