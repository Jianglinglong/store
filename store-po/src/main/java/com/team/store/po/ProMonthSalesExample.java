package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class ProMonthSalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProMonthSalesExample() {
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

        public Criteria andPmsIdIsNull() {
            addCriterion("PMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmsIdIsNotNull() {
            addCriterion("PMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmsIdEqualTo(Integer value) {
            addCriterion("PMS_ID =", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdNotEqualTo(Integer value) {
            addCriterion("PMS_ID <>", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdGreaterThan(Integer value) {
            addCriterion("PMS_ID >", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PMS_ID >=", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdLessThan(Integer value) {
            addCriterion("PMS_ID <", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PMS_ID <=", value, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdIn(List<Integer> values) {
            addCriterion("PMS_ID in", values, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdNotIn(List<Integer> values) {
            addCriterion("PMS_ID not in", values, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdBetween(Integer value1, Integer value2) {
            addCriterion("PMS_ID between", value1, value2, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PMS_ID not between", value1, value2, "pmsId");
            return (Criteria) this;
        }

        public Criteria andPmsNumIsNull() {
            addCriterion("PMS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPmsNumIsNotNull() {
            addCriterion("PMS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPmsNumEqualTo(Integer value) {
            addCriterion("PMS_NUM =", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumNotEqualTo(Integer value) {
            addCriterion("PMS_NUM <>", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumGreaterThan(Integer value) {
            addCriterion("PMS_NUM >", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PMS_NUM >=", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumLessThan(Integer value) {
            addCriterion("PMS_NUM <", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumLessThanOrEqualTo(Integer value) {
            addCriterion("PMS_NUM <=", value, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumIn(List<Integer> values) {
            addCriterion("PMS_NUM in", values, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumNotIn(List<Integer> values) {
            addCriterion("PMS_NUM not in", values, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumBetween(Integer value1, Integer value2) {
            addCriterion("PMS_NUM between", value1, value2, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andPmsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PMS_NUM not between", value1, value2, "pmsNum");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
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