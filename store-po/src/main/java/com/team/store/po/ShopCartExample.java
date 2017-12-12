package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class ShopCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCartExample() {
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

        public Criteria andShopcartIdIsNull() {
            addCriterion("SHOPCART_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopcartIdIsNotNull() {
            addCriterion("SHOPCART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartIdEqualTo(Integer value) {
            addCriterion("SHOPCART_ID =", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotEqualTo(Integer value) {
            addCriterion("SHOPCART_ID <>", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdGreaterThan(Integer value) {
            addCriterion("SHOPCART_ID >", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOPCART_ID >=", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdLessThan(Integer value) {
            addCriterion("SHOPCART_ID <", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHOPCART_ID <=", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdIn(List<Integer> values) {
            addCriterion("SHOPCART_ID in", values, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotIn(List<Integer> values) {
            addCriterion("SHOPCART_ID not in", values, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdBetween(Integer value1, Integer value2) {
            addCriterion("SHOPCART_ID between", value1, value2, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOPCART_ID not between", value1, value2, "shopcartId");
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

        public Criteria andProPriceIsNull() {
            addCriterion("PRO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("PRO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Double value) {
            addCriterion("PRO_PRICE =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Double value) {
            addCriterion("PRO_PRICE <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Double value) {
            addCriterion("PRO_PRICE >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("PRO_PRICE >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Double value) {
            addCriterion("PRO_PRICE <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Double value) {
            addCriterion("PRO_PRICE <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Double> values) {
            addCriterion("PRO_PRICE in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Double> values) {
            addCriterion("PRO_PRICE not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Double value1, Double value2) {
            addCriterion("PRO_PRICE between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Double value1, Double value2) {
            addCriterion("PRO_PRICE not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNull() {
            addCriterion("PRO_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNotNull() {
            addCriterion("PRO_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andProMoneyEqualTo(Double value) {
            addCriterion("PRO_MONEY =", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotEqualTo(Double value) {
            addCriterion("PRO_MONEY <>", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThan(Double value) {
            addCriterion("PRO_MONEY >", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("PRO_MONEY >=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThan(Double value) {
            addCriterion("PRO_MONEY <", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThanOrEqualTo(Double value) {
            addCriterion("PRO_MONEY <=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyIn(List<Double> values) {
            addCriterion("PRO_MONEY in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotIn(List<Double> values) {
            addCriterion("PRO_MONEY not in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyBetween(Double value1, Double value2) {
            addCriterion("PRO_MONEY between", value1, value2, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotBetween(Double value1, Double value2) {
            addCriterion("PRO_MONEY not between", value1, value2, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProNumIsNull() {
            addCriterion("PRO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProNumIsNotNull() {
            addCriterion("PRO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProNumEqualTo(Integer value) {
            addCriterion("PRO_NUM =", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotEqualTo(Integer value) {
            addCriterion("PRO_NUM <>", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThan(Integer value) {
            addCriterion("PRO_NUM >", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_NUM >=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThan(Integer value) {
            addCriterion("PRO_NUM <", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_NUM <=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumIn(List<Integer> values) {
            addCriterion("PRO_NUM in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotIn(List<Integer> values) {
            addCriterion("PRO_NUM not in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumBetween(Integer value1, Integer value2) {
            addCriterion("PRO_NUM between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_NUM not between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProType1IsNull() {
            addCriterion("PRO_TYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andProType1IsNotNull() {
            addCriterion("PRO_TYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andProType1EqualTo(String value) {
            addCriterion("PRO_TYPE1 =", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1NotEqualTo(String value) {
            addCriterion("PRO_TYPE1 <>", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1GreaterThan(String value) {
            addCriterion("PRO_TYPE1 >", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1GreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE1 >=", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1LessThan(String value) {
            addCriterion("PRO_TYPE1 <", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1LessThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE1 <=", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1Like(String value) {
            addCriterion("PRO_TYPE1 like", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1NotLike(String value) {
            addCriterion("PRO_TYPE1 not like", value, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1In(List<String> values) {
            addCriterion("PRO_TYPE1 in", values, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1NotIn(List<String> values) {
            addCriterion("PRO_TYPE1 not in", values, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1Between(String value1, String value2) {
            addCriterion("PRO_TYPE1 between", value1, value2, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType1NotBetween(String value1, String value2) {
            addCriterion("PRO_TYPE1 not between", value1, value2, "proType1");
            return (Criteria) this;
        }

        public Criteria andProType2IsNull() {
            addCriterion("PRO_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andProType2IsNotNull() {
            addCriterion("PRO_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andProType2EqualTo(String value) {
            addCriterion("PRO_TYPE2 =", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2NotEqualTo(String value) {
            addCriterion("PRO_TYPE2 <>", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2GreaterThan(String value) {
            addCriterion("PRO_TYPE2 >", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2GreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE2 >=", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2LessThan(String value) {
            addCriterion("PRO_TYPE2 <", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2LessThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE2 <=", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2Like(String value) {
            addCriterion("PRO_TYPE2 like", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2NotLike(String value) {
            addCriterion("PRO_TYPE2 not like", value, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2In(List<String> values) {
            addCriterion("PRO_TYPE2 in", values, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2NotIn(List<String> values) {
            addCriterion("PRO_TYPE2 not in", values, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2Between(String value1, String value2) {
            addCriterion("PRO_TYPE2 between", value1, value2, "proType2");
            return (Criteria) this;
        }

        public Criteria andProType2NotBetween(String value1, String value2) {
            addCriterion("PRO_TYPE2 not between", value1, value2, "proType2");
            return (Criteria) this;
        }

        public Criteria andProLevel1IsNull() {
            addCriterion("PRO_LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andProLevel1IsNotNull() {
            addCriterion("PRO_LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andProLevel1EqualTo(String value) {
            addCriterion("PRO_LEVEL1 =", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1NotEqualTo(String value) {
            addCriterion("PRO_LEVEL1 <>", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1GreaterThan(String value) {
            addCriterion("PRO_LEVEL1 >", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("PRO_LEVEL1 >=", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1LessThan(String value) {
            addCriterion("PRO_LEVEL1 <", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1LessThanOrEqualTo(String value) {
            addCriterion("PRO_LEVEL1 <=", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1Like(String value) {
            addCriterion("PRO_LEVEL1 like", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1NotLike(String value) {
            addCriterion("PRO_LEVEL1 not like", value, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1In(List<String> values) {
            addCriterion("PRO_LEVEL1 in", values, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1NotIn(List<String> values) {
            addCriterion("PRO_LEVEL1 not in", values, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1Between(String value1, String value2) {
            addCriterion("PRO_LEVEL1 between", value1, value2, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel1NotBetween(String value1, String value2) {
            addCriterion("PRO_LEVEL1 not between", value1, value2, "proLevel1");
            return (Criteria) this;
        }

        public Criteria andProLevel2IsNull() {
            addCriterion("PRO_LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andProLevel2IsNotNull() {
            addCriterion("PRO_LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andProLevel2EqualTo(String value) {
            addCriterion("PRO_LEVEL2 =", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2NotEqualTo(String value) {
            addCriterion("PRO_LEVEL2 <>", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2GreaterThan(String value) {
            addCriterion("PRO_LEVEL2 >", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("PRO_LEVEL2 >=", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2LessThan(String value) {
            addCriterion("PRO_LEVEL2 <", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2LessThanOrEqualTo(String value) {
            addCriterion("PRO_LEVEL2 <=", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2Like(String value) {
            addCriterion("PRO_LEVEL2 like", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2NotLike(String value) {
            addCriterion("PRO_LEVEL2 not like", value, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2In(List<String> values) {
            addCriterion("PRO_LEVEL2 in", values, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2NotIn(List<String> values) {
            addCriterion("PRO_LEVEL2 not in", values, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2Between(String value1, String value2) {
            addCriterion("PRO_LEVEL2 between", value1, value2, "proLevel2");
            return (Criteria) this;
        }

        public Criteria andProLevel2NotBetween(String value1, String value2) {
            addCriterion("PRO_LEVEL2 not between", value1, value2, "proLevel2");
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