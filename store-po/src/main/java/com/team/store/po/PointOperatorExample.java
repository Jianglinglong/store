package com.team.store.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointOperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointOperatorExample() {
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

        public Criteria andPointopIdIsNull() {
            addCriterion("POINTOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPointopIdIsNotNull() {
            addCriterion("POINTOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPointopIdEqualTo(Integer value) {
            addCriterion("POINTOP_ID =", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdNotEqualTo(Integer value) {
            addCriterion("POINTOP_ID <>", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdGreaterThan(Integer value) {
            addCriterion("POINTOP_ID >", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINTOP_ID >=", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdLessThan(Integer value) {
            addCriterion("POINTOP_ID <", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdLessThanOrEqualTo(Integer value) {
            addCriterion("POINTOP_ID <=", value, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdIn(List<Integer> values) {
            addCriterion("POINTOP_ID in", values, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdNotIn(List<Integer> values) {
            addCriterion("POINTOP_ID not in", values, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdBetween(Integer value1, Integer value2) {
            addCriterion("POINTOP_ID between", value1, value2, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POINTOP_ID not between", value1, value2, "pointopId");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Integer value) {
            addCriterion("POINT_ID =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Integer value) {
            addCriterion("POINT_ID <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Integer value) {
            addCriterion("POINT_ID >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINT_ID >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Integer value) {
            addCriterion("POINT_ID <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("POINT_ID <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Integer> values) {
            addCriterion("POINT_ID in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Integer> values) {
            addCriterion("POINT_ID not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Integer value1, Integer value2) {
            addCriterion("POINT_ID between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POINT_ID not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointopTimeIsNull() {
            addCriterion("POINTOP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPointopTimeIsNotNull() {
            addCriterion("POINTOP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPointopTimeEqualTo(Date value) {
            addCriterion("POINTOP_TIME =", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeNotEqualTo(Date value) {
            addCriterion("POINTOP_TIME <>", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeGreaterThan(Date value) {
            addCriterion("POINTOP_TIME >", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("POINTOP_TIME >=", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeLessThan(Date value) {
            addCriterion("POINTOP_TIME <", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeLessThanOrEqualTo(Date value) {
            addCriterion("POINTOP_TIME <=", value, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeIn(List<Date> values) {
            addCriterion("POINTOP_TIME in", values, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeNotIn(List<Date> values) {
            addCriterion("POINTOP_TIME not in", values, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeBetween(Date value1, Date value2) {
            addCriterion("POINTOP_TIME between", value1, value2, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTimeNotBetween(Date value1, Date value2) {
            addCriterion("POINTOP_TIME not between", value1, value2, "pointopTime");
            return (Criteria) this;
        }

        public Criteria andPointopTypeIsNull() {
            addCriterion("POINTOP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPointopTypeIsNotNull() {
            addCriterion("POINTOP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPointopTypeEqualTo(String value) {
            addCriterion("POINTOP_TYPE =", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeNotEqualTo(String value) {
            addCriterion("POINTOP_TYPE <>", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeGreaterThan(String value) {
            addCriterion("POINTOP_TYPE >", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POINTOP_TYPE >=", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeLessThan(String value) {
            addCriterion("POINTOP_TYPE <", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeLessThanOrEqualTo(String value) {
            addCriterion("POINTOP_TYPE <=", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeLike(String value) {
            addCriterion("POINTOP_TYPE like", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeNotLike(String value) {
            addCriterion("POINTOP_TYPE not like", value, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeIn(List<String> values) {
            addCriterion("POINTOP_TYPE in", values, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeNotIn(List<String> values) {
            addCriterion("POINTOP_TYPE not in", values, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeBetween(String value1, String value2) {
            addCriterion("POINTOP_TYPE between", value1, value2, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointopTypeNotBetween(String value1, String value2) {
            addCriterion("POINTOP_TYPE not between", value1, value2, "pointopType");
            return (Criteria) this;
        }

        public Criteria andPointNumIsNull() {
            addCriterion("POINT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPointNumIsNotNull() {
            addCriterion("POINT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPointNumEqualTo(Integer value) {
            addCriterion("POINT_NUM =", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumNotEqualTo(Integer value) {
            addCriterion("POINT_NUM <>", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumGreaterThan(Integer value) {
            addCriterion("POINT_NUM >", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINT_NUM >=", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumLessThan(Integer value) {
            addCriterion("POINT_NUM <", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumLessThanOrEqualTo(Integer value) {
            addCriterion("POINT_NUM <=", value, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumIn(List<Integer> values) {
            addCriterion("POINT_NUM in", values, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumNotIn(List<Integer> values) {
            addCriterion("POINT_NUM not in", values, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumBetween(Integer value1, Integer value2) {
            addCriterion("POINT_NUM between", value1, value2, "pointNum");
            return (Criteria) this;
        }

        public Criteria andPointNumNotBetween(Integer value1, Integer value2) {
            addCriterion("POINT_NUM not between", value1, value2, "pointNum");
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