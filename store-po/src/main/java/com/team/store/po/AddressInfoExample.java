package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class AddressInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressInfoExample() {
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

        public Criteria andAddrIdIsNull() {
            addCriterion("ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(Integer value) {
            addCriterion("ADDR_ID =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(Integer value) {
            addCriterion("ADDR_ID <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(Integer value) {
            addCriterion("ADDR_ID >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDR_ID >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(Integer value) {
            addCriterion("ADDR_ID <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ADDR_ID <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<Integer> values) {
            addCriterion("ADDR_ID in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<Integer> values) {
            addCriterion("ADDR_ID not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("ADDR_ID between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDR_ID not between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrAddressIsNull() {
            addCriterion("ADDR_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddrAddressIsNotNull() {
            addCriterion("ADDR_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddrAddressEqualTo(String value) {
            addCriterion("ADDR_ADDRESS =", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressNotEqualTo(String value) {
            addCriterion("ADDR_ADDRESS <>", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressGreaterThan(String value) {
            addCriterion("ADDR_ADDRESS >", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_ADDRESS >=", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressLessThan(String value) {
            addCriterion("ADDR_ADDRESS <", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDR_ADDRESS <=", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressLike(String value) {
            addCriterion("ADDR_ADDRESS like", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressNotLike(String value) {
            addCriterion("ADDR_ADDRESS not like", value, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressIn(List<String> values) {
            addCriterion("ADDR_ADDRESS in", values, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressNotIn(List<String> values) {
            addCriterion("ADDR_ADDRESS not in", values, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressBetween(String value1, String value2) {
            addCriterion("ADDR_ADDRESS between", value1, value2, "addrAddress");
            return (Criteria) this;
        }

        public Criteria andAddrAddressNotBetween(String value1, String value2) {
            addCriterion("ADDR_ADDRESS not between", value1, value2, "addrAddress");
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

        public Criteria andAddrPhoneIsNull() {
            addCriterion("ADDR_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneIsNotNull() {
            addCriterion("ADDR_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneEqualTo(String value) {
            addCriterion("ADDR_PHONE =", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotEqualTo(String value) {
            addCriterion("ADDR_PHONE <>", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneGreaterThan(String value) {
            addCriterion("ADDR_PHONE >", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_PHONE >=", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLessThan(String value) {
            addCriterion("ADDR_PHONE <", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLessThanOrEqualTo(String value) {
            addCriterion("ADDR_PHONE <=", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLike(String value) {
            addCriterion("ADDR_PHONE like", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotLike(String value) {
            addCriterion("ADDR_PHONE not like", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneIn(List<String> values) {
            addCriterion("ADDR_PHONE in", values, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotIn(List<String> values) {
            addCriterion("ADDR_PHONE not in", values, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneBetween(String value1, String value2) {
            addCriterion("ADDR_PHONE between", value1, value2, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotBetween(String value1, String value2) {
            addCriterion("ADDR_PHONE not between", value1, value2, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleIsNull() {
            addCriterion("ADDR_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleIsNotNull() {
            addCriterion("ADDR_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleEqualTo(String value) {
            addCriterion("ADDR_PEOPLE =", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleNotEqualTo(String value) {
            addCriterion("ADDR_PEOPLE <>", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleGreaterThan(String value) {
            addCriterion("ADDR_PEOPLE >", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_PEOPLE >=", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleLessThan(String value) {
            addCriterion("ADDR_PEOPLE <", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleLessThanOrEqualTo(String value) {
            addCriterion("ADDR_PEOPLE <=", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleLike(String value) {
            addCriterion("ADDR_PEOPLE like", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleNotLike(String value) {
            addCriterion("ADDR_PEOPLE not like", value, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleIn(List<String> values) {
            addCriterion("ADDR_PEOPLE in", values, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleNotIn(List<String> values) {
            addCriterion("ADDR_PEOPLE not in", values, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleBetween(String value1, String value2) {
            addCriterion("ADDR_PEOPLE between", value1, value2, "addrPeople");
            return (Criteria) this;
        }

        public Criteria andAddrPeopleNotBetween(String value1, String value2) {
            addCriterion("ADDR_PEOPLE not between", value1, value2, "addrPeople");
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