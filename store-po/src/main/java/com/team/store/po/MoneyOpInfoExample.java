package com.team.store.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyOpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyOpInfoExample() {
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

        public Criteria andMoneyopIdIsNull() {
            addCriterion("MONEYOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdIsNotNull() {
            addCriterion("MONEYOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdEqualTo(Integer value) {
            addCriterion("MONEYOP_ID =", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdNotEqualTo(Integer value) {
            addCriterion("MONEYOP_ID <>", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdGreaterThan(Integer value) {
            addCriterion("MONEYOP_ID >", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONEYOP_ID >=", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdLessThan(Integer value) {
            addCriterion("MONEYOP_ID <", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdLessThanOrEqualTo(Integer value) {
            addCriterion("MONEYOP_ID <=", value, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdIn(List<Integer> values) {
            addCriterion("MONEYOP_ID in", values, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdNotIn(List<Integer> values) {
            addCriterion("MONEYOP_ID not in", values, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdBetween(Integer value1, Integer value2) {
            addCriterion("MONEYOP_ID between", value1, value2, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MONEYOP_ID not between", value1, value2, "moneyopId");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeIsNull() {
            addCriterion("MONEYOP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeIsNotNull() {
            addCriterion("MONEYOP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeEqualTo(Date value) {
            addCriterion("MONEYOP_TIME =", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeNotEqualTo(Date value) {
            addCriterion("MONEYOP_TIME <>", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeGreaterThan(Date value) {
            addCriterion("MONEYOP_TIME >", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MONEYOP_TIME >=", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeLessThan(Date value) {
            addCriterion("MONEYOP_TIME <", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeLessThanOrEqualTo(Date value) {
            addCriterion("MONEYOP_TIME <=", value, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeIn(List<Date> values) {
            addCriterion("MONEYOP_TIME in", values, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeNotIn(List<Date> values) {
            addCriterion("MONEYOP_TIME not in", values, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeBetween(Date value1, Date value2) {
            addCriterion("MONEYOP_TIME between", value1, value2, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopTimeNotBetween(Date value1, Date value2) {
            addCriterion("MONEYOP_TIME not between", value1, value2, "moneyopTime");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyIsNull() {
            addCriterion("MONEYOP_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyIsNotNull() {
            addCriterion("MONEYOP_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyEqualTo(Double value) {
            addCriterion("MONEYOP_MONEY =", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyNotEqualTo(Double value) {
            addCriterion("MONEYOP_MONEY <>", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyGreaterThan(Double value) {
            addCriterion("MONEYOP_MONEY >", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("MONEYOP_MONEY >=", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyLessThan(Double value) {
            addCriterion("MONEYOP_MONEY <", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyLessThanOrEqualTo(Double value) {
            addCriterion("MONEYOP_MONEY <=", value, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyIn(List<Double> values) {
            addCriterion("MONEYOP_MONEY in", values, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyNotIn(List<Double> values) {
            addCriterion("MONEYOP_MONEY not in", values, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyBetween(Double value1, Double value2) {
            addCriterion("MONEYOP_MONEY between", value1, value2, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopMoneyNotBetween(Double value1, Double value2) {
            addCriterion("MONEYOP_MONEY not between", value1, value2, "moneyopMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeIsNull() {
            addCriterion("MONEYOP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeIsNotNull() {
            addCriterion("MONEYOP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeEqualTo(String value) {
            addCriterion("MONEYOP_TYPE =", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeNotEqualTo(String value) {
            addCriterion("MONEYOP_TYPE <>", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeGreaterThan(String value) {
            addCriterion("MONEYOP_TYPE >", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MONEYOP_TYPE >=", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeLessThan(String value) {
            addCriterion("MONEYOP_TYPE <", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeLessThanOrEqualTo(String value) {
            addCriterion("MONEYOP_TYPE <=", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeLike(String value) {
            addCriterion("MONEYOP_TYPE like", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeNotLike(String value) {
            addCriterion("MONEYOP_TYPE not like", value, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeIn(List<String> values) {
            addCriterion("MONEYOP_TYPE in", values, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeNotIn(List<String> values) {
            addCriterion("MONEYOP_TYPE not in", values, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeBetween(String value1, String value2) {
            addCriterion("MONEYOP_TYPE between", value1, value2, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyopTypeNotBetween(String value1, String value2) {
            addCriterion("MONEYOP_TYPE not between", value1, value2, "moneyopType");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIsNull() {
            addCriterion("MONEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIsNotNull() {
            addCriterion("MONEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyIdEqualTo(Integer value) {
            addCriterion("MONEY_ID =", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotEqualTo(Integer value) {
            addCriterion("MONEY_ID <>", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdGreaterThan(Integer value) {
            addCriterion("MONEY_ID >", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONEY_ID >=", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdLessThan(Integer value) {
            addCriterion("MONEY_ID <", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdLessThanOrEqualTo(Integer value) {
            addCriterion("MONEY_ID <=", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIn(List<Integer> values) {
            addCriterion("MONEY_ID in", values, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotIn(List<Integer> values) {
            addCriterion("MONEY_ID not in", values, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdBetween(Integer value1, Integer value2) {
            addCriterion("MONEY_ID between", value1, value2, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MONEY_ID not between", value1, value2, "moneyId");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyIsNull() {
            addCriterion("REMAIN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyIsNotNull() {
            addCriterion("REMAIN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyEqualTo(Double value) {
            addCriterion("REMAIN_MONEY =", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyNotEqualTo(Double value) {
            addCriterion("REMAIN_MONEY <>", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyGreaterThan(Double value) {
            addCriterion("REMAIN_MONEY >", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("REMAIN_MONEY >=", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyLessThan(Double value) {
            addCriterion("REMAIN_MONEY <", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyLessThanOrEqualTo(Double value) {
            addCriterion("REMAIN_MONEY <=", value, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyIn(List<Double> values) {
            addCriterion("REMAIN_MONEY in", values, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyNotIn(List<Double> values) {
            addCriterion("REMAIN_MONEY not in", values, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyBetween(Double value1, Double value2) {
            addCriterion("REMAIN_MONEY between", value1, value2, "remainMoney");
            return (Criteria) this;
        }

        public Criteria andRemainMoneyNotBetween(Double value1, Double value2) {
            addCriterion("REMAIN_MONEY not between", value1, value2, "remainMoney");
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