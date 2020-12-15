package com.github.simpleblog.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class categoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public categoryExample() {
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

        public Criteria andCategorytitleIsNull() {
            addCriterion("categoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andCategorytitleIsNotNull() {
            addCriterion("categoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCategorytitleEqualTo(String value) {
            addCriterion("categoryTitle =", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleNotEqualTo(String value) {
            addCriterion("categoryTitle <>", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleGreaterThan(String value) {
            addCriterion("categoryTitle >", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleGreaterThanOrEqualTo(String value) {
            addCriterion("categoryTitle >=", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleLessThan(String value) {
            addCriterion("categoryTitle <", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleLessThanOrEqualTo(String value) {
            addCriterion("categoryTitle <=", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleLike(String value) {
            addCriterion("categoryTitle like", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleNotLike(String value) {
            addCriterion("categoryTitle not like", value, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleIn(List<String> values) {
            addCriterion("categoryTitle in", values, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleNotIn(List<String> values) {
            addCriterion("categoryTitle not in", values, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleBetween(String value1, String value2) {
            addCriterion("categoryTitle between", value1, value2, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategorytitleNotBetween(String value1, String value2) {
            addCriterion("categoryTitle not between", value1, value2, "categorytitle");
            return (Criteria) this;
        }

        public Criteria andCategoryuriIsNull() {
            addCriterion("categoryURI is null");
            return (Criteria) this;
        }

        public Criteria andCategoryuriIsNotNull() {
            addCriterion("categoryURI is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryuriEqualTo(String value) {
            addCriterion("categoryURI =", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriNotEqualTo(String value) {
            addCriterion("categoryURI <>", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriGreaterThan(String value) {
            addCriterion("categoryURI >", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriGreaterThanOrEqualTo(String value) {
            addCriterion("categoryURI >=", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriLessThan(String value) {
            addCriterion("categoryURI <", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriLessThanOrEqualTo(String value) {
            addCriterion("categoryURI <=", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriLike(String value) {
            addCriterion("categoryURI like", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriNotLike(String value) {
            addCriterion("categoryURI not like", value, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriIn(List<String> values) {
            addCriterion("categoryURI in", values, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriNotIn(List<String> values) {
            addCriterion("categoryURI not in", values, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriBetween(String value1, String value2) {
            addCriterion("categoryURI between", value1, value2, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryuriNotBetween(String value1, String value2) {
            addCriterion("categoryURI not between", value1, value2, "categoryuri");
            return (Criteria) this;
        }

        public Criteria andCategoryorderIsNull() {
            addCriterion("categoryOrder is null");
            return (Criteria) this;
        }

        public Criteria andCategoryorderIsNotNull() {
            addCriterion("categoryOrder is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryorderEqualTo(Integer value) {
            addCriterion("categoryOrder =", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderNotEqualTo(Integer value) {
            addCriterion("categoryOrder <>", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderGreaterThan(Integer value) {
            addCriterion("categoryOrder >", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryOrder >=", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderLessThan(Integer value) {
            addCriterion("categoryOrder <", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderLessThanOrEqualTo(Integer value) {
            addCriterion("categoryOrder <=", value, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderIn(List<Integer> values) {
            addCriterion("categoryOrder in", values, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderNotIn(List<Integer> values) {
            addCriterion("categoryOrder not in", values, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderBetween(Integer value1, Integer value2) {
            addCriterion("categoryOrder between", value1, value2, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategoryorderNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryOrder not between", value1, value2, "categoryorder");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntIsNull() {
            addCriterion("categoryTagCnt is null");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntIsNotNull() {
            addCriterion("categoryTagCnt is not null");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntEqualTo(Integer value) {
            addCriterion("categoryTagCnt =", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntNotEqualTo(Integer value) {
            addCriterion("categoryTagCnt <>", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntGreaterThan(Integer value) {
            addCriterion("categoryTagCnt >", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryTagCnt >=", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntLessThan(Integer value) {
            addCriterion("categoryTagCnt <", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntLessThanOrEqualTo(Integer value) {
            addCriterion("categoryTagCnt <=", value, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntIn(List<Integer> values) {
            addCriterion("categoryTagCnt in", values, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntNotIn(List<Integer> values) {
            addCriterion("categoryTagCnt not in", values, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntBetween(Integer value1, Integer value2) {
            addCriterion("categoryTagCnt between", value1, value2, "categorytagcnt");
            return (Criteria) this;
        }

        public Criteria andCategorytagcntNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryTagCnt not between", value1, value2, "categorytagcnt");
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