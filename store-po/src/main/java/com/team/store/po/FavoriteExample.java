package com.team.store.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FavoriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoriteExample() {
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

        public Criteria andFavoriteIdIsNull() {
            addCriterion("FAVORITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdIsNotNull() {
            addCriterion("FAVORITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdEqualTo(Integer value) {
            addCriterion("FAVORITE_ID =", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotEqualTo(Integer value) {
            addCriterion("FAVORITE_ID <>", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdGreaterThan(Integer value) {
            addCriterion("FAVORITE_ID >", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_ID >=", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdLessThan(Integer value) {
            addCriterion("FAVORITE_ID <", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdLessThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_ID <=", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdIn(List<Integer> values) {
            addCriterion("FAVORITE_ID in", values, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotIn(List<Integer> values) {
            addCriterion("FAVORITE_ID not in", values, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_ID between", value1, value2, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_ID not between", value1, value2, "favoriteId");
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

        public Criteria andFavoriteTimeIsNull() {
            addCriterion("FAVORITE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeIsNotNull() {
            addCriterion("FAVORITE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeEqualTo(Date value) {
            addCriterion("FAVORITE_TIME =", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotEqualTo(Date value) {
            addCriterion("FAVORITE_TIME <>", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeGreaterThan(Date value) {
            addCriterion("FAVORITE_TIME >", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FAVORITE_TIME >=", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeLessThan(Date value) {
            addCriterion("FAVORITE_TIME <", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeLessThanOrEqualTo(Date value) {
            addCriterion("FAVORITE_TIME <=", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeIn(List<Date> values) {
            addCriterion("FAVORITE_TIME in", values, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotIn(List<Date> values) {
            addCriterion("FAVORITE_TIME not in", values, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeBetween(Date value1, Date value2) {
            addCriterion("FAVORITE_TIME between", value1, value2, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotBetween(Date value1, Date value2) {
            addCriterion("FAVORITE_TIME not between", value1, value2, "favoriteTime");
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