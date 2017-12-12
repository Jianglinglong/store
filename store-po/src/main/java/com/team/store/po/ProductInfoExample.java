package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
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

        public Criteria andProImgIsNull() {
            addCriterion("PRO_IMG is null");
            return (Criteria) this;
        }

        public Criteria andProImgIsNotNull() {
            addCriterion("PRO_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andProImgEqualTo(String value) {
            addCriterion("PRO_IMG =", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgNotEqualTo(String value) {
            addCriterion("PRO_IMG <>", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgGreaterThan(String value) {
            addCriterion("PRO_IMG >", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_IMG >=", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgLessThan(String value) {
            addCriterion("PRO_IMG <", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgLessThanOrEqualTo(String value) {
            addCriterion("PRO_IMG <=", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgLike(String value) {
            addCriterion("PRO_IMG like", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgNotLike(String value) {
            addCriterion("PRO_IMG not like", value, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgIn(List<String> values) {
            addCriterion("PRO_IMG in", values, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgNotIn(List<String> values) {
            addCriterion("PRO_IMG not in", values, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgBetween(String value1, String value2) {
            addCriterion("PRO_IMG between", value1, value2, "proImg");
            return (Criteria) this;
        }

        public Criteria andProImgNotBetween(String value1, String value2) {
            addCriterion("PRO_IMG not between", value1, value2, "proImg");
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

        public Criteria andPtIdIsNull() {
            addCriterion("PT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("PT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Integer value) {
            addCriterion("PT_ID =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Integer value) {
            addCriterion("PT_ID <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Integer value) {
            addCriterion("PT_ID >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PT_ID >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Integer value) {
            addCriterion("PT_ID <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("PT_ID <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Integer> values) {
            addCriterion("PT_ID in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Integer> values) {
            addCriterion("PT_ID not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Integer value1, Integer value2) {
            addCriterion("PT_ID between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PT_ID not between", value1, value2, "ptId");
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

        public Criteria andProExpressIsNull() {
            addCriterion("PRO_EXPRESS is null");
            return (Criteria) this;
        }

        public Criteria andProExpressIsNotNull() {
            addCriterion("PRO_EXPRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProExpressEqualTo(Double value) {
            addCriterion("PRO_EXPRESS =", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressNotEqualTo(Double value) {
            addCriterion("PRO_EXPRESS <>", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressGreaterThan(Double value) {
            addCriterion("PRO_EXPRESS >", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressGreaterThanOrEqualTo(Double value) {
            addCriterion("PRO_EXPRESS >=", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressLessThan(Double value) {
            addCriterion("PRO_EXPRESS <", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressLessThanOrEqualTo(Double value) {
            addCriterion("PRO_EXPRESS <=", value, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressIn(List<Double> values) {
            addCriterion("PRO_EXPRESS in", values, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressNotIn(List<Double> values) {
            addCriterion("PRO_EXPRESS not in", values, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressBetween(Double value1, Double value2) {
            addCriterion("PRO_EXPRESS between", value1, value2, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProExpressNotBetween(Double value1, Double value2) {
            addCriterion("PRO_EXPRESS not between", value1, value2, "proExpress");
            return (Criteria) this;
        }

        public Criteria andProBigImgIsNull() {
            addCriterion("PRO_BIG_IMG is null");
            return (Criteria) this;
        }

        public Criteria andProBigImgIsNotNull() {
            addCriterion("PRO_BIG_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andProBigImgEqualTo(String value) {
            addCriterion("PRO_BIG_IMG =", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgNotEqualTo(String value) {
            addCriterion("PRO_BIG_IMG <>", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgGreaterThan(String value) {
            addCriterion("PRO_BIG_IMG >", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_BIG_IMG >=", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgLessThan(String value) {
            addCriterion("PRO_BIG_IMG <", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgLessThanOrEqualTo(String value) {
            addCriterion("PRO_BIG_IMG <=", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgLike(String value) {
            addCriterion("PRO_BIG_IMG like", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgNotLike(String value) {
            addCriterion("PRO_BIG_IMG not like", value, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgIn(List<String> values) {
            addCriterion("PRO_BIG_IMG in", values, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgNotIn(List<String> values) {
            addCriterion("PRO_BIG_IMG not in", values, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgBetween(String value1, String value2) {
            addCriterion("PRO_BIG_IMG between", value1, value2, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProBigImgNotBetween(String value1, String value2) {
            addCriterion("PRO_BIG_IMG not between", value1, value2, "proBigImg");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("PRO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("PRO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("PRO_DESC =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("PRO_DESC <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("PRO_DESC >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_DESC >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("PRO_DESC <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("PRO_DESC <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("PRO_DESC like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("PRO_DESC not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("PRO_DESC in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("PRO_DESC not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("PRO_DESC between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("PRO_DESC not between", value1, value2, "proDesc");
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