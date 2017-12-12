package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class PacketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacketExample() {
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

        public Criteria andPacketIdIsNull() {
            addCriterion("PACKET_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacketIdIsNotNull() {
            addCriterion("PACKET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacketIdEqualTo(Integer value) {
            addCriterion("PACKET_ID =", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotEqualTo(Integer value) {
            addCriterion("PACKET_ID <>", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdGreaterThan(Integer value) {
            addCriterion("PACKET_ID >", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACKET_ID >=", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdLessThan(Integer value) {
            addCriterion("PACKET_ID <", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdLessThanOrEqualTo(Integer value) {
            addCriterion("PACKET_ID <=", value, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdIn(List<Integer> values) {
            addCriterion("PACKET_ID in", values, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotIn(List<Integer> values) {
            addCriterion("PACKET_ID not in", values, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdBetween(Integer value1, Integer value2) {
            addCriterion("PACKET_ID between", value1, value2, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PACKET_ID not between", value1, value2, "packetId");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyIsNull() {
            addCriterion("PACKET_TOTAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyIsNotNull() {
            addCriterion("PACKET_TOTAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyEqualTo(Double value) {
            addCriterion("PACKET_TOTAL_MONEY =", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyNotEqualTo(Double value) {
            addCriterion("PACKET_TOTAL_MONEY <>", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyGreaterThan(Double value) {
            addCriterion("PACKET_TOTAL_MONEY >", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("PACKET_TOTAL_MONEY >=", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyLessThan(Double value) {
            addCriterion("PACKET_TOTAL_MONEY <", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("PACKET_TOTAL_MONEY <=", value, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyIn(List<Double> values) {
            addCriterion("PACKET_TOTAL_MONEY in", values, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyNotIn(List<Double> values) {
            addCriterion("PACKET_TOTAL_MONEY not in", values, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("PACKET_TOTAL_MONEY between", value1, value2, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("PACKET_TOTAL_MONEY not between", value1, value2, "packetTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyIsNull() {
            addCriterion("PACKET_REMAIN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyIsNotNull() {
            addCriterion("PACKET_REMAIN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyEqualTo(Double value) {
            addCriterion("PACKET_REMAIN_MONEY =", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyNotEqualTo(Double value) {
            addCriterion("PACKET_REMAIN_MONEY <>", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyGreaterThan(Double value) {
            addCriterion("PACKET_REMAIN_MONEY >", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("PACKET_REMAIN_MONEY >=", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyLessThan(Double value) {
            addCriterion("PACKET_REMAIN_MONEY <", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyLessThanOrEqualTo(Double value) {
            addCriterion("PACKET_REMAIN_MONEY <=", value, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyIn(List<Double> values) {
            addCriterion("PACKET_REMAIN_MONEY in", values, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyNotIn(List<Double> values) {
            addCriterion("PACKET_REMAIN_MONEY not in", values, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyBetween(Double value1, Double value2) {
            addCriterion("PACKET_REMAIN_MONEY between", value1, value2, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketRemainMoneyNotBetween(Double value1, Double value2) {
            addCriterion("PACKET_REMAIN_MONEY not between", value1, value2, "packetRemainMoney");
            return (Criteria) this;
        }

        public Criteria andPacketFromIsNull() {
            addCriterion("PACKET_FROM is null");
            return (Criteria) this;
        }

        public Criteria andPacketFromIsNotNull() {
            addCriterion("PACKET_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andPacketFromEqualTo(Integer value) {
            addCriterion("PACKET_FROM =", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromNotEqualTo(Integer value) {
            addCriterion("PACKET_FROM <>", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromGreaterThan(Integer value) {
            addCriterion("PACKET_FROM >", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACKET_FROM >=", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromLessThan(Integer value) {
            addCriterion("PACKET_FROM <", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromLessThanOrEqualTo(Integer value) {
            addCriterion("PACKET_FROM <=", value, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromIn(List<Integer> values) {
            addCriterion("PACKET_FROM in", values, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromNotIn(List<Integer> values) {
            addCriterion("PACKET_FROM not in", values, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromBetween(Integer value1, Integer value2) {
            addCriterion("PACKET_FROM between", value1, value2, "packetFrom");
            return (Criteria) this;
        }

        public Criteria andPacketFromNotBetween(Integer value1, Integer value2) {
            addCriterion("PACKET_FROM not between", value1, value2, "packetFrom");
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