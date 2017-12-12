package com.team.store.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppraiseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppraiseInfoExample() {
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

        public Criteria andApprIdIsNull() {
            addCriterion("APPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprIdIsNotNull() {
            addCriterion("APPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprIdEqualTo(Integer value) {
            addCriterion("APPR_ID =", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotEqualTo(Integer value) {
            addCriterion("APPR_ID <>", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdGreaterThan(Integer value) {
            addCriterion("APPR_ID >", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPR_ID >=", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdLessThan(Integer value) {
            addCriterion("APPR_ID <", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPR_ID <=", value, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdIn(List<Integer> values) {
            addCriterion("APPR_ID in", values, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotIn(List<Integer> values) {
            addCriterion("APPR_ID not in", values, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdBetween(Integer value1, Integer value2) {
            addCriterion("APPR_ID between", value1, value2, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPR_ID not between", value1, value2, "apprId");
            return (Criteria) this;
        }

        public Criteria andApprContentsIsNull() {
            addCriterion("APPR_CONTENTS is null");
            return (Criteria) this;
        }

        public Criteria andApprContentsIsNotNull() {
            addCriterion("APPR_CONTENTS is not null");
            return (Criteria) this;
        }

        public Criteria andApprContentsEqualTo(String value) {
            addCriterion("APPR_CONTENTS =", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsNotEqualTo(String value) {
            addCriterion("APPR_CONTENTS <>", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsGreaterThan(String value) {
            addCriterion("APPR_CONTENTS >", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_CONTENTS >=", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsLessThan(String value) {
            addCriterion("APPR_CONTENTS <", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsLessThanOrEqualTo(String value) {
            addCriterion("APPR_CONTENTS <=", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsLike(String value) {
            addCriterion("APPR_CONTENTS like", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsNotLike(String value) {
            addCriterion("APPR_CONTENTS not like", value, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsIn(List<String> values) {
            addCriterion("APPR_CONTENTS in", values, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsNotIn(List<String> values) {
            addCriterion("APPR_CONTENTS not in", values, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsBetween(String value1, String value2) {
            addCriterion("APPR_CONTENTS between", value1, value2, "apprContents");
            return (Criteria) this;
        }

        public Criteria andApprContentsNotBetween(String value1, String value2) {
            addCriterion("APPR_CONTENTS not between", value1, value2, "apprContents");
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

        public Criteria andApprPictureIsNull() {
            addCriterion("APPR_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andApprPictureIsNotNull() {
            addCriterion("APPR_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andApprPictureEqualTo(String value) {
            addCriterion("APPR_PICTURE =", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureNotEqualTo(String value) {
            addCriterion("APPR_PICTURE <>", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureGreaterThan(String value) {
            addCriterion("APPR_PICTURE >", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_PICTURE >=", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureLessThan(String value) {
            addCriterion("APPR_PICTURE <", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureLessThanOrEqualTo(String value) {
            addCriterion("APPR_PICTURE <=", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureLike(String value) {
            addCriterion("APPR_PICTURE like", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureNotLike(String value) {
            addCriterion("APPR_PICTURE not like", value, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureIn(List<String> values) {
            addCriterion("APPR_PICTURE in", values, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureNotIn(List<String> values) {
            addCriterion("APPR_PICTURE not in", values, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureBetween(String value1, String value2) {
            addCriterion("APPR_PICTURE between", value1, value2, "apprPicture");
            return (Criteria) this;
        }

        public Criteria andApprPictureNotBetween(String value1, String value2) {
            addCriterion("APPR_PICTURE not between", value1, value2, "apprPicture");
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

        public Criteria andApprTimeIsNull() {
            addCriterion("APPR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApprTimeIsNotNull() {
            addCriterion("APPR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApprTimeEqualTo(Date value) {
            addCriterion("APPR_TIME =", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotEqualTo(Date value) {
            addCriterion("APPR_TIME <>", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeGreaterThan(Date value) {
            addCriterion("APPR_TIME >", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPR_TIME >=", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeLessThan(Date value) {
            addCriterion("APPR_TIME <", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPR_TIME <=", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeIn(List<Date> values) {
            addCriterion("APPR_TIME in", values, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotIn(List<Date> values) {
            addCriterion("APPR_TIME not in", values, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeBetween(Date value1, Date value2) {
            addCriterion("APPR_TIME between", value1, value2, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPR_TIME not between", value1, value2, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTypeIsNull() {
            addCriterion("APPR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApprTypeIsNotNull() {
            addCriterion("APPR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApprTypeEqualTo(Integer value) {
            addCriterion("APPR_TYPE =", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeNotEqualTo(Integer value) {
            addCriterion("APPR_TYPE <>", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeGreaterThan(Integer value) {
            addCriterion("APPR_TYPE >", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPR_TYPE >=", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeLessThan(Integer value) {
            addCriterion("APPR_TYPE <", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeLessThanOrEqualTo(Integer value) {
            addCriterion("APPR_TYPE <=", value, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeIn(List<Integer> values) {
            addCriterion("APPR_TYPE in", values, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeNotIn(List<Integer> values) {
            addCriterion("APPR_TYPE not in", values, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeBetween(Integer value1, Integer value2) {
            addCriterion("APPR_TYPE between", value1, value2, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("APPR_TYPE not between", value1, value2, "apprType");
            return (Criteria) this;
        }

        public Criteria andApprNonameIsNull() {
            addCriterion("APPR_NONAME is null");
            return (Criteria) this;
        }

        public Criteria andApprNonameIsNotNull() {
            addCriterion("APPR_NONAME is not null");
            return (Criteria) this;
        }

        public Criteria andApprNonameEqualTo(String value) {
            addCriterion("APPR_NONAME =", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameNotEqualTo(String value) {
            addCriterion("APPR_NONAME <>", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameGreaterThan(String value) {
            addCriterion("APPR_NONAME >", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameGreaterThanOrEqualTo(String value) {
            addCriterion("APPR_NONAME >=", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameLessThan(String value) {
            addCriterion("APPR_NONAME <", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameLessThanOrEqualTo(String value) {
            addCriterion("APPR_NONAME <=", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameLike(String value) {
            addCriterion("APPR_NONAME like", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameNotLike(String value) {
            addCriterion("APPR_NONAME not like", value, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameIn(List<String> values) {
            addCriterion("APPR_NONAME in", values, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameNotIn(List<String> values) {
            addCriterion("APPR_NONAME not in", values, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameBetween(String value1, String value2) {
            addCriterion("APPR_NONAME between", value1, value2, "apprNoname");
            return (Criteria) this;
        }

        public Criteria andApprNonameNotBetween(String value1, String value2) {
            addCriterion("APPR_NONAME not between", value1, value2, "apprNoname");
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