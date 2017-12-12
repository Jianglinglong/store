package com.team.store.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CouponInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("COUPON_ID =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("COUPON_ID <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("COUPON_ID >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_ID >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("COUPON_ID <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_ID <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("COUPON_ID in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("COUPON_ID not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_ID between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_ID not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("COUPON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("COUPON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Double value) {
            addCriterion("COUPON_PRICE =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Double value) {
            addCriterion("COUPON_PRICE <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Double value) {
            addCriterion("COUPON_PRICE >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("COUPON_PRICE >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Double value) {
            addCriterion("COUPON_PRICE <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Double value) {
            addCriterion("COUPON_PRICE <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Double> values) {
            addCriterion("COUPON_PRICE in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Double> values) {
            addCriterion("COUPON_PRICE not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Double value1, Double value2) {
            addCriterion("COUPON_PRICE between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Double value1, Double value2) {
            addCriterion("COUPON_PRICE not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponConditionIsNull() {
            addCriterion("COUPON_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andCouponConditionIsNotNull() {
            addCriterion("COUPON_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andCouponConditionEqualTo(Integer value) {
            addCriterion("COUPON_CONDITION =", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionNotEqualTo(Integer value) {
            addCriterion("COUPON_CONDITION <>", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionGreaterThan(Integer value) {
            addCriterion("COUPON_CONDITION >", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_CONDITION >=", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionLessThan(Integer value) {
            addCriterion("COUPON_CONDITION <", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_CONDITION <=", value, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionIn(List<Integer> values) {
            addCriterion("COUPON_CONDITION in", values, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionNotIn(List<Integer> values) {
            addCriterion("COUPON_CONDITION not in", values, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_CONDITION between", value1, value2, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_CONDITION not between", value1, value2, "couponCondition");
            return (Criteria) this;
        }

        public Criteria andCouponStateIsNull() {
            addCriterion("COUPON_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCouponStateIsNotNull() {
            addCriterion("COUPON_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStateEqualTo(String value) {
            addCriterion("COUPON_STATE =", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotEqualTo(String value) {
            addCriterion("COUPON_STATE <>", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateGreaterThan(String value) {
            addCriterion("COUPON_STATE >", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_STATE >=", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateLessThan(String value) {
            addCriterion("COUPON_STATE <", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateLessThanOrEqualTo(String value) {
            addCriterion("COUPON_STATE <=", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateLike(String value) {
            addCriterion("COUPON_STATE like", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotLike(String value) {
            addCriterion("COUPON_STATE not like", value, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateIn(List<String> values) {
            addCriterion("COUPON_STATE in", values, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotIn(List<String> values) {
            addCriterion("COUPON_STATE not in", values, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateBetween(String value1, String value2) {
            addCriterion("COUPON_STATE between", value1, value2, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStateNotBetween(String value1, String value2) {
            addCriterion("COUPON_STATE not between", value1, value2, "couponState");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeIsNull() {
            addCriterion("COUPON_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeIsNotNull() {
            addCriterion("COUPON_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME =", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME <>", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME >", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME >=", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME <", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_STARTTIME <=", value, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("COUPON_STARTTIME in", values, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COUPON_STARTTIME not in", values, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COUPON_STARTTIME between", value1, value2, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COUPON_STARTTIME not between", value1, value2, "couponStarttime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeIsNull() {
            addCriterion("COUPON_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeIsNotNull() {
            addCriterion("COUPON_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME =", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME <>", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME >", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME >=", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME <", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COUPON_ENDTIME <=", value, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("COUPON_ENDTIME in", values, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COUPON_ENDTIME not in", values, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COUPON_ENDTIME between", value1, value2, "couponEndtime");
            return (Criteria) this;
        }

        public Criteria andCouponEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COUPON_ENDTIME not between", value1, value2, "couponEndtime");
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