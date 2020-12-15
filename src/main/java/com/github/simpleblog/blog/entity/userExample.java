package com.github.simpleblog.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserurlIsNull() {
            addCriterion("userURL is null");
            return (Criteria) this;
        }

        public Criteria andUserurlIsNotNull() {
            addCriterion("userURL is not null");
            return (Criteria) this;
        }

        public Criteria andUserurlEqualTo(String value) {
            addCriterion("userURL =", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlNotEqualTo(String value) {
            addCriterion("userURL <>", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlGreaterThan(String value) {
            addCriterion("userURL >", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlGreaterThanOrEqualTo(String value) {
            addCriterion("userURL >=", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlLessThan(String value) {
            addCriterion("userURL <", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlLessThanOrEqualTo(String value) {
            addCriterion("userURL <=", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlLike(String value) {
            addCriterion("userURL like", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlNotLike(String value) {
            addCriterion("userURL not like", value, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlIn(List<String> values) {
            addCriterion("userURL in", values, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlNotIn(List<String> values) {
            addCriterion("userURL not in", values, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlBetween(String value1, String value2) {
            addCriterion("userURL between", value1, value2, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserurlNotBetween(String value1, String value2) {
            addCriterion("userURL not between", value1, value2, "userurl");
            return (Criteria) this;
        }

        public Criteria andUserroleIsNull() {
            addCriterion("userRole is null");
            return (Criteria) this;
        }

        public Criteria andUserroleIsNotNull() {
            addCriterion("userRole is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleEqualTo(String value) {
            addCriterion("userRole =", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotEqualTo(String value) {
            addCriterion("userRole <>", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleGreaterThan(String value) {
            addCriterion("userRole >", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleGreaterThanOrEqualTo(String value) {
            addCriterion("userRole >=", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLessThan(String value) {
            addCriterion("userRole <", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLessThanOrEqualTo(String value) {
            addCriterion("userRole <=", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLike(String value) {
            addCriterion("userRole like", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotLike(String value) {
            addCriterion("userRole not like", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleIn(List<String> values) {
            addCriterion("userRole in", values, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotIn(List<String> values) {
            addCriterion("userRole not in", values, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleBetween(String value1, String value2) {
            addCriterion("userRole between", value1, value2, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotBetween(String value1, String value2) {
            addCriterion("userRole not between", value1, value2, "userrole");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNull() {
            addCriterion("userAvatar is null");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNotNull() {
            addCriterion("userAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andUseravatarEqualTo(String value) {
            addCriterion("userAvatar =", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotEqualTo(String value) {
            addCriterion("userAvatar <>", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThan(String value) {
            addCriterion("userAvatar >", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThanOrEqualTo(String value) {
            addCriterion("userAvatar >=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThan(String value) {
            addCriterion("userAvatar <", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThanOrEqualTo(String value) {
            addCriterion("userAvatar <=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLike(String value) {
            addCriterion("userAvatar like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotLike(String value) {
            addCriterion("userAvatar not like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarIn(List<String> values) {
            addCriterion("userAvatar in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotIn(List<String> values) {
            addCriterion("userAvatar not in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarBetween(String value1, String value2) {
            addCriterion("userAvatar between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotBetween(String value1, String value2) {
            addCriterion("userAvatar not between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUserb3keyIsNull() {
            addCriterion("userB3Key is null");
            return (Criteria) this;
        }

        public Criteria andUserb3keyIsNotNull() {
            addCriterion("userB3Key is not null");
            return (Criteria) this;
        }

        public Criteria andUserb3keyEqualTo(String value) {
            addCriterion("userB3Key =", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyNotEqualTo(String value) {
            addCriterion("userB3Key <>", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyGreaterThan(String value) {
            addCriterion("userB3Key >", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyGreaterThanOrEqualTo(String value) {
            addCriterion("userB3Key >=", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyLessThan(String value) {
            addCriterion("userB3Key <", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyLessThanOrEqualTo(String value) {
            addCriterion("userB3Key <=", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyLike(String value) {
            addCriterion("userB3Key like", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyNotLike(String value) {
            addCriterion("userB3Key not like", value, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyIn(List<String> values) {
            addCriterion("userB3Key in", values, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyNotIn(List<String> values) {
            addCriterion("userB3Key not in", values, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyBetween(String value1, String value2) {
            addCriterion("userB3Key between", value1, value2, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUserb3keyNotBetween(String value1, String value2) {
            addCriterion("userB3Key not between", value1, value2, "userb3key");
            return (Criteria) this;
        }

        public Criteria andUsergithubidIsNull() {
            addCriterion("userGitHubId is null");
            return (Criteria) this;
        }

        public Criteria andUsergithubidIsNotNull() {
            addCriterion("userGitHubId is not null");
            return (Criteria) this;
        }

        public Criteria andUsergithubidEqualTo(String value) {
            addCriterion("userGitHubId =", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidNotEqualTo(String value) {
            addCriterion("userGitHubId <>", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidGreaterThan(String value) {
            addCriterion("userGitHubId >", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidGreaterThanOrEqualTo(String value) {
            addCriterion("userGitHubId >=", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidLessThan(String value) {
            addCriterion("userGitHubId <", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidLessThanOrEqualTo(String value) {
            addCriterion("userGitHubId <=", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidLike(String value) {
            addCriterion("userGitHubId like", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidNotLike(String value) {
            addCriterion("userGitHubId not like", value, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidIn(List<String> values) {
            addCriterion("userGitHubId in", values, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidNotIn(List<String> values) {
            addCriterion("userGitHubId not in", values, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidBetween(String value1, String value2) {
            addCriterion("userGitHubId between", value1, value2, "usergithubid");
            return (Criteria) this;
        }

        public Criteria andUsergithubidNotBetween(String value1, String value2) {
            addCriterion("userGitHubId not between", value1, value2, "usergithubid");
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