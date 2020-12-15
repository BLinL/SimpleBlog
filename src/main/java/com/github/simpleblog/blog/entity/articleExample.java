package com.github.simpleblog.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class articleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public articleExample() {
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

        public Criteria andArticletitleIsNull() {
            addCriterion("articleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("articleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("articleTitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("articleTitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("articleTitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("articleTitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("articleTitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("articleTitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("articleTitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("articleTitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("articleTitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("articleTitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("articleTitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("articleTitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridIsNull() {
            addCriterion("articleAuthorId is null");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridIsNotNull() {
            addCriterion("articleAuthorId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridEqualTo(String value) {
            addCriterion("articleAuthorId =", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridNotEqualTo(String value) {
            addCriterion("articleAuthorId <>", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridGreaterThan(String value) {
            addCriterion("articleAuthorId >", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridGreaterThanOrEqualTo(String value) {
            addCriterion("articleAuthorId >=", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridLessThan(String value) {
            addCriterion("articleAuthorId <", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridLessThanOrEqualTo(String value) {
            addCriterion("articleAuthorId <=", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridLike(String value) {
            addCriterion("articleAuthorId like", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridNotLike(String value) {
            addCriterion("articleAuthorId not like", value, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridIn(List<String> values) {
            addCriterion("articleAuthorId in", values, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridNotIn(List<String> values) {
            addCriterion("articleAuthorId not in", values, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridBetween(String value1, String value2) {
            addCriterion("articleAuthorId between", value1, value2, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticleauthoridNotBetween(String value1, String value2) {
            addCriterion("articleAuthorId not between", value1, value2, "articleauthorid");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkIsNull() {
            addCriterion("articlePermalink is null");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkIsNotNull() {
            addCriterion("articlePermalink is not null");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkEqualTo(String value) {
            addCriterion("articlePermalink =", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkNotEqualTo(String value) {
            addCriterion("articlePermalink <>", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkGreaterThan(String value) {
            addCriterion("articlePermalink >", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkGreaterThanOrEqualTo(String value) {
            addCriterion("articlePermalink >=", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkLessThan(String value) {
            addCriterion("articlePermalink <", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkLessThanOrEqualTo(String value) {
            addCriterion("articlePermalink <=", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkLike(String value) {
            addCriterion("articlePermalink like", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkNotLike(String value) {
            addCriterion("articlePermalink not like", value, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkIn(List<String> values) {
            addCriterion("articlePermalink in", values, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkNotIn(List<String> values) {
            addCriterion("articlePermalink not in", values, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkBetween(String value1, String value2) {
            addCriterion("articlePermalink between", value1, value2, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticlepermalinkNotBetween(String value1, String value2) {
            addCriterion("articlePermalink not between", value1, value2, "articlepermalink");
            return (Criteria) this;
        }

        public Criteria andArticleputtopIsNull() {
            addCriterion("articlePutTop is null");
            return (Criteria) this;
        }

        public Criteria andArticleputtopIsNotNull() {
            addCriterion("articlePutTop is not null");
            return (Criteria) this;
        }

        public Criteria andArticleputtopEqualTo(String value) {
            addCriterion("articlePutTop =", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopNotEqualTo(String value) {
            addCriterion("articlePutTop <>", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopGreaterThan(String value) {
            addCriterion("articlePutTop >", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopGreaterThanOrEqualTo(String value) {
            addCriterion("articlePutTop >=", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopLessThan(String value) {
            addCriterion("articlePutTop <", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopLessThanOrEqualTo(String value) {
            addCriterion("articlePutTop <=", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopLike(String value) {
            addCriterion("articlePutTop like", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopNotLike(String value) {
            addCriterion("articlePutTop not like", value, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopIn(List<String> values) {
            addCriterion("articlePutTop in", values, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopNotIn(List<String> values) {
            addCriterion("articlePutTop not in", values, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopBetween(String value1, String value2) {
            addCriterion("articlePutTop between", value1, value2, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticleputtopNotBetween(String value1, String value2) {
            addCriterion("articlePutTop not between", value1, value2, "articleputtop");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedIsNull() {
            addCriterion("articleCreated is null");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedIsNotNull() {
            addCriterion("articleCreated is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedEqualTo(Long value) {
            addCriterion("articleCreated =", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedNotEqualTo(Long value) {
            addCriterion("articleCreated <>", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedGreaterThan(Long value) {
            addCriterion("articleCreated >", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedGreaterThanOrEqualTo(Long value) {
            addCriterion("articleCreated >=", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedLessThan(Long value) {
            addCriterion("articleCreated <", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedLessThanOrEqualTo(Long value) {
            addCriterion("articleCreated <=", value, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedIn(List<Long> values) {
            addCriterion("articleCreated in", values, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedNotIn(List<Long> values) {
            addCriterion("articleCreated not in", values, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedBetween(Long value1, Long value2) {
            addCriterion("articleCreated between", value1, value2, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticlecreatedNotBetween(Long value1, Long value2) {
            addCriterion("articleCreated not between", value1, value2, "articlecreated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedIsNull() {
            addCriterion("articleUpdated is null");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedIsNotNull() {
            addCriterion("articleUpdated is not null");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedEqualTo(Long value) {
            addCriterion("articleUpdated =", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedNotEqualTo(Long value) {
            addCriterion("articleUpdated <>", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedGreaterThan(Long value) {
            addCriterion("articleUpdated >", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("articleUpdated >=", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedLessThan(Long value) {
            addCriterion("articleUpdated <", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedLessThanOrEqualTo(Long value) {
            addCriterion("articleUpdated <=", value, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedIn(List<Long> values) {
            addCriterion("articleUpdated in", values, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedNotIn(List<Long> values) {
            addCriterion("articleUpdated not in", values, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedBetween(Long value1, Long value2) {
            addCriterion("articleUpdated between", value1, value2, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticleupdatedNotBetween(Long value1, Long value2) {
            addCriterion("articleUpdated not between", value1, value2, "articleupdated");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleIsNull() {
            addCriterion("articleRandomDouble is null");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleIsNotNull() {
            addCriterion("articleRandomDouble is not null");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleEqualTo(Double value) {
            addCriterion("articleRandomDouble =", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleNotEqualTo(Double value) {
            addCriterion("articleRandomDouble <>", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleGreaterThan(Double value) {
            addCriterion("articleRandomDouble >", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleGreaterThanOrEqualTo(Double value) {
            addCriterion("articleRandomDouble >=", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleLessThan(Double value) {
            addCriterion("articleRandomDouble <", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleLessThanOrEqualTo(Double value) {
            addCriterion("articleRandomDouble <=", value, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleIn(List<Double> values) {
            addCriterion("articleRandomDouble in", values, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleNotIn(List<Double> values) {
            addCriterion("articleRandomDouble not in", values, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleBetween(Double value1, Double value2) {
            addCriterion("articleRandomDouble between", value1, value2, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlerandomdoubleNotBetween(Double value1, Double value2) {
            addCriterion("articleRandomDouble not between", value1, value2, "articlerandomdouble");
            return (Criteria) this;
        }

        public Criteria andArticlesignidIsNull() {
            addCriterion("articleSignId is null");
            return (Criteria) this;
        }

        public Criteria andArticlesignidIsNotNull() {
            addCriterion("articleSignId is not null");
            return (Criteria) this;
        }

        public Criteria andArticlesignidEqualTo(String value) {
            addCriterion("articleSignId =", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidNotEqualTo(String value) {
            addCriterion("articleSignId <>", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidGreaterThan(String value) {
            addCriterion("articleSignId >", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidGreaterThanOrEqualTo(String value) {
            addCriterion("articleSignId >=", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidLessThan(String value) {
            addCriterion("articleSignId <", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidLessThanOrEqualTo(String value) {
            addCriterion("articleSignId <=", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidLike(String value) {
            addCriterion("articleSignId like", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidNotLike(String value) {
            addCriterion("articleSignId not like", value, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidIn(List<String> values) {
            addCriterion("articleSignId in", values, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidNotIn(List<String> values) {
            addCriterion("articleSignId not in", values, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidBetween(String value1, String value2) {
            addCriterion("articleSignId between", value1, value2, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticlesignidNotBetween(String value1, String value2) {
            addCriterion("articleSignId not between", value1, value2, "articlesignid");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdIsNull() {
            addCriterion("articleViewPwd is null");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdIsNotNull() {
            addCriterion("articleViewPwd is not null");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdEqualTo(String value) {
            addCriterion("articleViewPwd =", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdNotEqualTo(String value) {
            addCriterion("articleViewPwd <>", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdGreaterThan(String value) {
            addCriterion("articleViewPwd >", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdGreaterThanOrEqualTo(String value) {
            addCriterion("articleViewPwd >=", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdLessThan(String value) {
            addCriterion("articleViewPwd <", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdLessThanOrEqualTo(String value) {
            addCriterion("articleViewPwd <=", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdLike(String value) {
            addCriterion("articleViewPwd like", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdNotLike(String value) {
            addCriterion("articleViewPwd not like", value, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdIn(List<String> values) {
            addCriterion("articleViewPwd in", values, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdNotIn(List<String> values) {
            addCriterion("articleViewPwd not in", values, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdBetween(String value1, String value2) {
            addCriterion("articleViewPwd between", value1, value2, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleviewpwdNotBetween(String value1, String value2) {
            addCriterion("articleViewPwd not between", value1, value2, "articleviewpwd");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlIsNull() {
            addCriterion("articleImg1URL is null");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlIsNotNull() {
            addCriterion("articleImg1URL is not null");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlEqualTo(String value) {
            addCriterion("articleImg1URL =", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlNotEqualTo(String value) {
            addCriterion("articleImg1URL <>", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlGreaterThan(String value) {
            addCriterion("articleImg1URL >", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlGreaterThanOrEqualTo(String value) {
            addCriterion("articleImg1URL >=", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlLessThan(String value) {
            addCriterion("articleImg1URL <", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlLessThanOrEqualTo(String value) {
            addCriterion("articleImg1URL <=", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlLike(String value) {
            addCriterion("articleImg1URL like", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlNotLike(String value) {
            addCriterion("articleImg1URL not like", value, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlIn(List<String> values) {
            addCriterion("articleImg1URL in", values, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlNotIn(List<String> values) {
            addCriterion("articleImg1URL not in", values, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlBetween(String value1, String value2) {
            addCriterion("articleImg1URL between", value1, value2, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticleimg1urlNotBetween(String value1, String value2) {
            addCriterion("articleImg1URL not between", value1, value2, "articleimg1url");
            return (Criteria) this;
        }

        public Criteria andArticlestatusIsNull() {
            addCriterion("articleStatus is null");
            return (Criteria) this;
        }

        public Criteria andArticlestatusIsNotNull() {
            addCriterion("articleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andArticlestatusEqualTo(Integer value) {
            addCriterion("articleStatus =", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusNotEqualTo(Integer value) {
            addCriterion("articleStatus <>", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusGreaterThan(Integer value) {
            addCriterion("articleStatus >", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleStatus >=", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusLessThan(Integer value) {
            addCriterion("articleStatus <", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusLessThanOrEqualTo(Integer value) {
            addCriterion("articleStatus <=", value, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusIn(List<Integer> values) {
            addCriterion("articleStatus in", values, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusNotIn(List<Integer> values) {
            addCriterion("articleStatus not in", values, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusBetween(Integer value1, Integer value2) {
            addCriterion("articleStatus between", value1, value2, "articlestatus");
            return (Criteria) this;
        }

        public Criteria andArticlestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("articleStatus not between", value1, value2, "articlestatus");
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