package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class SecurityQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecurityQuestionExample() {
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

        public Criteria andSecurityIdIsNull() {
            addCriterion("SECURITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecurityIdIsNotNull() {
            addCriterion("SECURITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityIdEqualTo(Integer value) {
            addCriterion("SECURITY_ID =", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotEqualTo(Integer value) {
            addCriterion("SECURITY_ID <>", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdGreaterThan(Integer value) {
            addCriterion("SECURITY_ID >", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_ID >=", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdLessThan(Integer value) {
            addCriterion("SECURITY_ID <", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdLessThanOrEqualTo(Integer value) {
            addCriterion("SECURITY_ID <=", value, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdIn(List<Integer> values) {
            addCriterion("SECURITY_ID in", values, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotIn(List<Integer> values) {
            addCriterion("SECURITY_ID not in", values, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_ID between", value1, value2, "securityId");
            return (Criteria) this;
        }

        public Criteria andSecurityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SECURITY_ID not between", value1, value2, "securityId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andQuesIdIsNull() {
            addCriterion("QUES_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuesIdIsNotNull() {
            addCriterion("QUES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuesIdEqualTo(Integer value) {
            addCriterion("QUES_ID =", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotEqualTo(Integer value) {
            addCriterion("QUES_ID <>", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThan(Integer value) {
            addCriterion("QUES_ID >", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUES_ID >=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThan(Integer value) {
            addCriterion("QUES_ID <", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUES_ID <=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdIn(List<Integer> values) {
            addCriterion("QUES_ID in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotIn(List<Integer> values) {
            addCriterion("QUES_ID not in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdBetween(Integer value1, Integer value2) {
            addCriterion("QUES_ID between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUES_ID not between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerIsNull() {
            addCriterion("SECURIRY_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerIsNotNull() {
            addCriterion("SECURIRY_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerEqualTo(String value) {
            addCriterion("SECURIRY_ANSWER =", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerNotEqualTo(String value) {
            addCriterion("SECURIRY_ANSWER <>", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerGreaterThan(String value) {
            addCriterion("SECURIRY_ANSWER >", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("SECURIRY_ANSWER >=", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerLessThan(String value) {
            addCriterion("SECURIRY_ANSWER <", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerLessThanOrEqualTo(String value) {
            addCriterion("SECURIRY_ANSWER <=", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerLike(String value) {
            addCriterion("SECURIRY_ANSWER like", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerNotLike(String value) {
            addCriterion("SECURIRY_ANSWER not like", value, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerIn(List<String> values) {
            addCriterion("SECURIRY_ANSWER in", values, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerNotIn(List<String> values) {
            addCriterion("SECURIRY_ANSWER not in", values, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerBetween(String value1, String value2) {
            addCriterion("SECURIRY_ANSWER between", value1, value2, "securiryAnswer");
            return (Criteria) this;
        }

        public Criteria andSecuriryAnswerNotBetween(String value1, String value2) {
            addCriterion("SECURIRY_ANSWER not between", value1, value2, "securiryAnswer");
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