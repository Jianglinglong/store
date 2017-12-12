package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class ProBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProBrandExample() {
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

        public Criteria andPbIdIsNull() {
            addCriterion("PB_ID is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("PB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(Integer value) {
            addCriterion("PB_ID =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(Integer value) {
            addCriterion("PB_ID <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(Integer value) {
            addCriterion("PB_ID >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PB_ID >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(Integer value) {
            addCriterion("PB_ID <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(Integer value) {
            addCriterion("PB_ID <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<Integer> values) {
            addCriterion("PB_ID in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<Integer> values) {
            addCriterion("PB_ID not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(Integer value1, Integer value2) {
            addCriterion("PB_ID between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PB_ID not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbNameIsNull() {
            addCriterion("PB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPbNameIsNotNull() {
            addCriterion("PB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPbNameEqualTo(String value) {
            addCriterion("PB_NAME =", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotEqualTo(String value) {
            addCriterion("PB_NAME <>", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameGreaterThan(String value) {
            addCriterion("PB_NAME >", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameGreaterThanOrEqualTo(String value) {
            addCriterion("PB_NAME >=", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLessThan(String value) {
            addCriterion("PB_NAME <", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLessThanOrEqualTo(String value) {
            addCriterion("PB_NAME <=", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameLike(String value) {
            addCriterion("PB_NAME like", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotLike(String value) {
            addCriterion("PB_NAME not like", value, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameIn(List<String> values) {
            addCriterion("PB_NAME in", values, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotIn(List<String> values) {
            addCriterion("PB_NAME not in", values, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameBetween(String value1, String value2) {
            addCriterion("PB_NAME between", value1, value2, "pbName");
            return (Criteria) this;
        }

        public Criteria andPbNameNotBetween(String value1, String value2) {
            addCriterion("PB_NAME not between", value1, value2, "pbName");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNull() {
            addCriterion("PC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("PC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(Integer value) {
            addCriterion("PC_ID =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(Integer value) {
            addCriterion("PC_ID <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(Integer value) {
            addCriterion("PC_ID >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PC_ID >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(Integer value) {
            addCriterion("PC_ID <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(Integer value) {
            addCriterion("PC_ID <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<Integer> values) {
            addCriterion("PC_ID in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<Integer> values) {
            addCriterion("PC_ID not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(Integer value1, Integer value2) {
            addCriterion("PC_ID between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PC_ID not between", value1, value2, "pcId");
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