package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class OrderProInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderProInfoExample() {
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

        public Criteria andOrderProIdIsNull() {
            addCriterion("ORDER_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderProIdIsNotNull() {
            addCriterion("ORDER_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProIdEqualTo(Integer value) {
            addCriterion("ORDER_PRO_ID =", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdNotEqualTo(Integer value) {
            addCriterion("ORDER_PRO_ID <>", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdGreaterThan(Integer value) {
            addCriterion("ORDER_PRO_ID >", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_PRO_ID >=", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdLessThan(Integer value) {
            addCriterion("ORDER_PRO_ID <", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_PRO_ID <=", value, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdIn(List<Integer> values) {
            addCriterion("ORDER_PRO_ID in", values, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdNotIn(List<Integer> values) {
            addCriterion("ORDER_PRO_ID not in", values, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_PRO_ID between", value1, value2, "orderProId");
            return (Criteria) this;
        }

        public Criteria andOrderProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_PRO_ID not between", value1, value2, "orderProId");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1IsNull() {
            addCriterion("ORDER_LEVLE1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1IsNotNull() {
            addCriterion("ORDER_LEVLE1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1EqualTo(String value) {
            addCriterion("ORDER_LEVLE1 =", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1NotEqualTo(String value) {
            addCriterion("ORDER_LEVLE1 <>", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1GreaterThan(String value) {
            addCriterion("ORDER_LEVLE1 >", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_LEVLE1 >=", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1LessThan(String value) {
            addCriterion("ORDER_LEVLE1 <", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_LEVLE1 <=", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1Like(String value) {
            addCriterion("ORDER_LEVLE1 like", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1NotLike(String value) {
            addCriterion("ORDER_LEVLE1 not like", value, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1In(List<String> values) {
            addCriterion("ORDER_LEVLE1 in", values, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1NotIn(List<String> values) {
            addCriterion("ORDER_LEVLE1 not in", values, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1Between(String value1, String value2) {
            addCriterion("ORDER_LEVLE1 between", value1, value2, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle1NotBetween(String value1, String value2) {
            addCriterion("ORDER_LEVLE1 not between", value1, value2, "orderLevle1");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2IsNull() {
            addCriterion("ORDER_LEVLE2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2IsNotNull() {
            addCriterion("ORDER_LEVLE2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2EqualTo(String value) {
            addCriterion("ORDER_LEVLE2 =", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2NotEqualTo(String value) {
            addCriterion("ORDER_LEVLE2 <>", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2GreaterThan(String value) {
            addCriterion("ORDER_LEVLE2 >", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_LEVLE2 >=", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2LessThan(String value) {
            addCriterion("ORDER_LEVLE2 <", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2LessThanOrEqualTo(String value) {
            addCriterion("ORDER_LEVLE2 <=", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2Like(String value) {
            addCriterion("ORDER_LEVLE2 like", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2NotLike(String value) {
            addCriterion("ORDER_LEVLE2 not like", value, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2In(List<String> values) {
            addCriterion("ORDER_LEVLE2 in", values, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2NotIn(List<String> values) {
            addCriterion("ORDER_LEVLE2 not in", values, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2Between(String value1, String value2) {
            addCriterion("ORDER_LEVLE2 between", value1, value2, "orderLevle2");
            return (Criteria) this;
        }

        public Criteria andOrderLevle2NotBetween(String value1, String value2) {
            addCriterion("ORDER_LEVLE2 not between", value1, value2, "orderLevle2");
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

        public Criteria andAppraisStatusIsNull() {
            addCriterion("APPRAIS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusIsNotNull() {
            addCriterion("APPRAIS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusEqualTo(String value) {
            addCriterion("APPRAIS_STATUS =", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusNotEqualTo(String value) {
            addCriterion("APPRAIS_STATUS <>", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusGreaterThan(String value) {
            addCriterion("APPRAIS_STATUS >", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAIS_STATUS >=", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusLessThan(String value) {
            addCriterion("APPRAIS_STATUS <", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusLessThanOrEqualTo(String value) {
            addCriterion("APPRAIS_STATUS <=", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusLike(String value) {
            addCriterion("APPRAIS_STATUS like", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusNotLike(String value) {
            addCriterion("APPRAIS_STATUS not like", value, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusIn(List<String> values) {
            addCriterion("APPRAIS_STATUS in", values, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusNotIn(List<String> values) {
            addCriterion("APPRAIS_STATUS not in", values, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusBetween(String value1, String value2) {
            addCriterion("APPRAIS_STATUS between", value1, value2, "appraisStatus");
            return (Criteria) this;
        }

        public Criteria andAppraisStatusNotBetween(String value1, String value2) {
            addCriterion("APPRAIS_STATUS not between", value1, value2, "appraisStatus");
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