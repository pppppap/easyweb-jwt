package com.wf.ew.house.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("`id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("`id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("`id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("`id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("`id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("`id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("`id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("`id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("`delete` is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("`delete` is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("`delete` =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("`delete` <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("`delete` >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("`delete` >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("`delete` <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("`delete` <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("`delete` in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("`delete` not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("`delete` between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("`delete` not between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNull() {
            addCriterion("`house_state` is null");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNotNull() {
            addCriterion("`house_state` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStateEqualTo(String value) {
            addCriterion("`house_state` =", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotEqualTo(String value) {
            addCriterion("`house_state` <>", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThan(String value) {
            addCriterion("`house_state` >", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThanOrEqualTo(String value) {
            addCriterion("`house_state` >=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThan(String value) {
            addCriterion("`house_state` <", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThanOrEqualTo(String value) {
            addCriterion("`house_state` <=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLike(String value) {
            addCriterion("`house_state` like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotLike(String value) {
            addCriterion("`house_state` not like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateIn(List<String> values) {
            addCriterion("`house_state` in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotIn(List<String> values) {
            addCriterion("`house_state` not in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateBetween(String value1, String value2) {
            addCriterion("`house_state` between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotBetween(String value1, String value2) {
            addCriterion("`house_state` not between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("`house_name` is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("`house_name` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("`house_name` =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("`house_name` <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("`house_name` >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("`house_name` >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("`house_name` <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("`house_name` <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("`house_name` like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("`house_name` not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("`house_name` in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("`house_name` not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("`house_name` between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("`house_name` not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHousePlaceIsNull() {
            addCriterion("`house_place` is null");
            return (Criteria) this;
        }

        public Criteria andHousePlaceIsNotNull() {
            addCriterion("`house_place` is not null");
            return (Criteria) this;
        }

        public Criteria andHousePlaceEqualTo(String value) {
            addCriterion("`house_place` =", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceNotEqualTo(String value) {
            addCriterion("`house_place` <>", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceGreaterThan(String value) {
            addCriterion("`house_place` >", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("`house_place` >=", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceLessThan(String value) {
            addCriterion("`house_place` <", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceLessThanOrEqualTo(String value) {
            addCriterion("`house_place` <=", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceLike(String value) {
            addCriterion("`house_place` like", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceNotLike(String value) {
            addCriterion("`house_place` not like", value, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceIn(List<String> values) {
            addCriterion("`house_place` in", values, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceNotIn(List<String> values) {
            addCriterion("`house_place` not in", values, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceBetween(String value1, String value2) {
            addCriterion("`house_place` between", value1, value2, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHousePlaceNotBetween(String value1, String value2) {
            addCriterion("`house_place` not between", value1, value2, "housePlace");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNull() {
            addCriterion("`house_unit` is null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIsNotNull() {
            addCriterion("`house_unit` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUnitEqualTo(String value) {
            addCriterion("`house_unit` =", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotEqualTo(String value) {
            addCriterion("`house_unit` <>", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThan(String value) {
            addCriterion("`house_unit` >", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("`house_unit` >=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThan(String value) {
            addCriterion("`house_unit` <", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLessThanOrEqualTo(String value) {
            addCriterion("`house_unit` <=", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitLike(String value) {
            addCriterion("`house_unit` like", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotLike(String value) {
            addCriterion("`house_unit` not like", value, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitIn(List<String> values) {
            addCriterion("`house_unit` in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotIn(List<String> values) {
            addCriterion("`house_unit` not in", values, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitBetween(String value1, String value2) {
            addCriterion("`house_unit` between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseUnitNotBetween(String value1, String value2) {
            addCriterion("`house_unit` not between", value1, value2, "houseUnit");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNull() {
            addCriterion("`house_number` is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIsNotNull() {
            addCriterion("`house_number` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumberEqualTo(String value) {
            addCriterion("`house_number` =", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotEqualTo(String value) {
            addCriterion("`house_number` <>", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThan(String value) {
            addCriterion("`house_number` >", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`house_number` >=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThan(String value) {
            addCriterion("`house_number` <", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLessThanOrEqualTo(String value) {
            addCriterion("`house_number` <=", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberLike(String value) {
            addCriterion("`house_number` like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotLike(String value) {
            addCriterion("`house_number` not like", value, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberIn(List<String> values) {
            addCriterion("`house_number` in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotIn(List<String> values) {
            addCriterion("`house_number` not in", values, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberBetween(String value1, String value2) {
            addCriterion("`house_number` between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andHouseNumberNotBetween(String value1, String value2) {
            addCriterion("`house_number` not between", value1, value2, "houseNumber");
            return (Criteria) this;
        }

        public Criteria andDirectIsNull() {
            addCriterion("`direct` is null");
            return (Criteria) this;
        }

        public Criteria andDirectIsNotNull() {
            addCriterion("`direct` is not null");
            return (Criteria) this;
        }

        public Criteria andDirectEqualTo(String value) {
            addCriterion("`direct` =", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotEqualTo(String value) {
            addCriterion("`direct` <>", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThan(String value) {
            addCriterion("`direct` >", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThanOrEqualTo(String value) {
            addCriterion("`direct` >=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThan(String value) {
            addCriterion("`direct` <", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThanOrEqualTo(String value) {
            addCriterion("`direct` <=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLike(String value) {
            addCriterion("`direct` like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotLike(String value) {
            addCriterion("`direct` not like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectIn(List<String> values) {
            addCriterion("`direct` in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotIn(List<String> values) {
            addCriterion("`direct` not in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectBetween(String value1, String value2) {
            addCriterion("`direct` between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotBetween(String value1, String value2) {
            addCriterion("`direct` not between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNull() {
            addCriterion("`house_age` is null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNotNull() {
            addCriterion("`house_age` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeEqualTo(Integer value) {
            addCriterion("`house_age` =", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotEqualTo(Integer value) {
            addCriterion("`house_age` <>", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThan(Integer value) {
            addCriterion("`house_age` >", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`house_age` >=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThan(Integer value) {
            addCriterion("`house_age` <", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThanOrEqualTo(Integer value) {
            addCriterion("`house_age` <=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIn(List<Integer> values) {
            addCriterion("`house_age` in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotIn(List<Integer> values) {
            addCriterion("`house_age` not in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeBetween(Integer value1, Integer value2) {
            addCriterion("`house_age` between", value1, value2, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("`house_age` not between", value1, value2, "houseAge");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("`area` is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("`area` is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("`area` =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("`area` <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("`area` >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("`area` >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("`area` <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("`area` <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("`area` in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("`area` not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("`area` between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("`area` not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("`house_type` is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("`house_type` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("`house_type` =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("`house_type` <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("`house_type` >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`house_type` >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("`house_type` <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("`house_type` <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("`house_type` like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("`house_type` not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("`house_type` in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("`house_type` not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("`house_type` between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("`house_type` not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("`original_price` is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("`original_price` is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(Double value) {
            addCriterion("`original_price` =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(Double value) {
            addCriterion("`original_price` <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(Double value) {
            addCriterion("`original_price` >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`original_price` >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(Double value) {
            addCriterion("`original_price` <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(Double value) {
            addCriterion("`original_price` <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<Double> values) {
            addCriterion("`original_price` in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<Double> values) {
            addCriterion("`original_price` not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(Double value1, Double value2) {
            addCriterion("`original_price` between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(Double value1, Double value2) {
            addCriterion("`original_price` not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIsNull() {
            addCriterion("`bottom_price` is null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIsNotNull() {
            addCriterion("`bottom_price` is not null");
            return (Criteria) this;
        }

        public Criteria andBottomPriceEqualTo(Double value) {
            addCriterion("`bottom_price` =", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotEqualTo(Double value) {
            addCriterion("`bottom_price` <>", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThan(Double value) {
            addCriterion("`bottom_price` >", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`bottom_price` >=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThan(Double value) {
            addCriterion("`bottom_price` <", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceLessThanOrEqualTo(Double value) {
            addCriterion("`bottom_price` <=", value, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceIn(List<Double> values) {
            addCriterion("`bottom_price` in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotIn(List<Double> values) {
            addCriterion("`bottom_price` not in", values, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceBetween(Double value1, Double value2) {
            addCriterion("`bottom_price` between", value1, value2, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andBottomPriceNotBetween(Double value1, Double value2) {
            addCriterion("`bottom_price` not between", value1, value2, "bottomPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("`total_price` is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("`total_price` is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("`total_price` =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("`total_price` <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("`total_price` >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`total_price` >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("`total_price` <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("`total_price` <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("`total_price` in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("`total_price` not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("`total_price` between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("`total_price` not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIsNull() {
            addCriterion("`decoration_type` is null");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIsNotNull() {
            addCriterion("`decoration_type` is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeEqualTo(String value) {
            addCriterion("`decoration_type` =", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotEqualTo(String value) {
            addCriterion("`decoration_type` <>", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeGreaterThan(String value) {
            addCriterion("`decoration_type` >", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`decoration_type` >=", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLessThan(String value) {
            addCriterion("`decoration_type` <", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLessThanOrEqualTo(String value) {
            addCriterion("`decoration_type` <=", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLike(String value) {
            addCriterion("`decoration_type` like", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotLike(String value) {
            addCriterion("`decoration_type` not like", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIn(List<String> values) {
            addCriterion("`decoration_type` in", values, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotIn(List<String> values) {
            addCriterion("`decoration_type` not in", values, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeBetween(String value1, String value2) {
            addCriterion("`decoration_type` between", value1, value2, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotBetween(String value1, String value2) {
            addCriterion("`decoration_type` not between", value1, value2, "decorationType");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("`floor` is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("`floor` is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("`floor` =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("`floor` <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("`floor` >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("`floor` >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("`floor` <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("`floor` <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("`floor` in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("`floor` not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("`floor` between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("`floor` not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNull() {
            addCriterion("`total_floor` is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNotNull() {
            addCriterion("`total_floor` is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorEqualTo(Integer value) {
            addCriterion("`total_floor` =", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotEqualTo(Integer value) {
            addCriterion("`total_floor` <>", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThan(Integer value) {
            addCriterion("`total_floor` >", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("`total_floor` >=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThan(Integer value) {
            addCriterion("`total_floor` <", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThanOrEqualTo(Integer value) {
            addCriterion("`total_floor` <=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIn(List<Integer> values) {
            addCriterion("`total_floor` in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotIn(List<Integer> values) {
            addCriterion("`total_floor` not in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorBetween(Integer value1, Integer value2) {
            addCriterion("`total_floor` between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("`total_floor` not between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("`created_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("`created_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("`created_time` =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("`created_time` <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("`created_time` >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`created_time` >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("`created_time` <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("`created_time` <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("`created_time` in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("`created_time` not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("`created_time` between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("`created_time` not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIsNull() {
            addCriterion("`last_follow_time` is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIsNotNull() {
            addCriterion("`last_follow_time` is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeEqualTo(Date value) {
            addCriterion("`last_follow_time` =", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotEqualTo(Date value) {
            addCriterion("`last_follow_time` <>", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeGreaterThan(Date value) {
            addCriterion("`last_follow_time` >", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`last_follow_time` >=", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeLessThan(Date value) {
            addCriterion("`last_follow_time` <", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeLessThanOrEqualTo(Date value) {
            addCriterion("`last_follow_time` <=", value, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeIn(List<Date> values) {
            addCriterion("`last_follow_time` in", values, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotIn(List<Date> values) {
            addCriterion("`last_follow_time` not in", values, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeBetween(Date value1, Date value2) {
            addCriterion("`last_follow_time` between", value1, value2, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andLastFollowTimeNotBetween(Date value1, Date value2) {
            addCriterion("`last_follow_time` not between", value1, value2, "lastFollowTime");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationIsNull() {
            addCriterion("`current_situation` is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationIsNotNull() {
            addCriterion("`current_situation` is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationEqualTo(String value) {
            addCriterion("`current_situation` =", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationNotEqualTo(String value) {
            addCriterion("`current_situation` <>", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationGreaterThan(String value) {
            addCriterion("`current_situation` >", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationGreaterThanOrEqualTo(String value) {
            addCriterion("`current_situation` >=", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationLessThan(String value) {
            addCriterion("`current_situation` <", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationLessThanOrEqualTo(String value) {
            addCriterion("`current_situation` <=", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationLike(String value) {
            addCriterion("`current_situation` like", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationNotLike(String value) {
            addCriterion("`current_situation` not like", value, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationIn(List<String> values) {
            addCriterion("`current_situation` in", values, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationNotIn(List<String> values) {
            addCriterion("`current_situation` not in", values, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationBetween(String value1, String value2) {
            addCriterion("`current_situation` between", value1, value2, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentSituationNotBetween(String value1, String value2) {
            addCriterion("`current_situation` not between", value1, value2, "currentSituation");
            return (Criteria) this;
        }

        public Criteria andUseIsNull() {
            addCriterion("`use` is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion("`use` is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(String value) {
            addCriterion("`use` =", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(String value) {
            addCriterion("`use` <>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(String value) {
            addCriterion("`use` >", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(String value) {
            addCriterion("`use` >=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(String value) {
            addCriterion("`use` <", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(String value) {
            addCriterion("`use` <=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLike(String value) {
            addCriterion("`use` like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotLike(String value) {
            addCriterion("`use` not like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<String> values) {
            addCriterion("`use` in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<String> values) {
            addCriterion("`use` not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(String value1, String value2) {
            addCriterion("`use` between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(String value1, String value2) {
            addCriterion("`use` not between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIsNull() {
            addCriterion("`house_property` is null");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIsNotNull() {
            addCriterion("`house_property` is not null");
            return (Criteria) this;
        }

        public Criteria andHousePropertyEqualTo(String value) {
            addCriterion("`house_property` =", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotEqualTo(String value) {
            addCriterion("`house_property` <>", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyGreaterThan(String value) {
            addCriterion("`house_property` >", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyGreaterThanOrEqualTo(String value) {
            addCriterion("`house_property` >=", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyLessThan(String value) {
            addCriterion("`house_property` <", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyLessThanOrEqualTo(String value) {
            addCriterion("`house_property` <=", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyLike(String value) {
            addCriterion("`house_property` like", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotLike(String value) {
            addCriterion("`house_property` not like", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIn(List<String> values) {
            addCriterion("`house_property` in", values, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotIn(List<String> values) {
            addCriterion("`house_property` not in", values, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyBetween(String value1, String value2) {
            addCriterion("`house_property` between", value1, value2, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotBetween(String value1, String value2) {
            addCriterion("`house_property` not between", value1, value2, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andPaperworkIsNull() {
            addCriterion("`paperwork` is null");
            return (Criteria) this;
        }

        public Criteria andPaperworkIsNotNull() {
            addCriterion("`paperwork` is not null");
            return (Criteria) this;
        }

        public Criteria andPaperworkEqualTo(String value) {
            addCriterion("`paperwork` =", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkNotEqualTo(String value) {
            addCriterion("`paperwork` <>", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkGreaterThan(String value) {
            addCriterion("`paperwork` >", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkGreaterThanOrEqualTo(String value) {
            addCriterion("`paperwork` >=", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkLessThan(String value) {
            addCriterion("`paperwork` <", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkLessThanOrEqualTo(String value) {
            addCriterion("`paperwork` <=", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkLike(String value) {
            addCriterion("`paperwork` like", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkNotLike(String value) {
            addCriterion("`paperwork` not like", value, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkIn(List<String> values) {
            addCriterion("`paperwork` in", values, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkNotIn(List<String> values) {
            addCriterion("`paperwork` not in", values, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkBetween(String value1, String value2) {
            addCriterion("`paperwork` between", value1, value2, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaperworkNotBetween(String value1, String value2) {
            addCriterion("`paperwork` not between", value1, value2, "paperwork");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("`payment_type` is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("`payment_type` is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("`payment_type` =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("`payment_type` <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("`payment_type` >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`payment_type` >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("`payment_type` <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("`payment_type` <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("`payment_type` like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("`payment_type` not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("`payment_type` in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("`payment_type` not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("`payment_type` between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("`payment_type` not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andTaxFilingIsNull() {
            addCriterion("`tax_filing` is null");
            return (Criteria) this;
        }

        public Criteria andTaxFilingIsNotNull() {
            addCriterion("`tax_filing` is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFilingEqualTo(String value) {
            addCriterion("`tax_filing` =", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingNotEqualTo(String value) {
            addCriterion("`tax_filing` <>", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingGreaterThan(String value) {
            addCriterion("`tax_filing` >", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingGreaterThanOrEqualTo(String value) {
            addCriterion("`tax_filing` >=", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingLessThan(String value) {
            addCriterion("`tax_filing` <", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingLessThanOrEqualTo(String value) {
            addCriterion("`tax_filing` <=", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingLike(String value) {
            addCriterion("`tax_filing` like", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingNotLike(String value) {
            addCriterion("`tax_filing` not like", value, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingIn(List<String> values) {
            addCriterion("`tax_filing` in", values, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingNotIn(List<String> values) {
            addCriterion("`tax_filing` not in", values, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingBetween(String value1, String value2) {
            addCriterion("`tax_filing` between", value1, value2, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andTaxFilingNotBetween(String value1, String value2) {
            addCriterion("`tax_filing` not between", value1, value2, "taxFiling");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceIsNull() {
            addCriterion("`property_price` is null");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceIsNotNull() {
            addCriterion("`property_price` is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceEqualTo(String value) {
            addCriterion("`property_price` =", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceNotEqualTo(String value) {
            addCriterion("`property_price` <>", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceGreaterThan(String value) {
            addCriterion("`property_price` >", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("`property_price` >=", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceLessThan(String value) {
            addCriterion("`property_price` <", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceLessThanOrEqualTo(String value) {
            addCriterion("`property_price` <=", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceLike(String value) {
            addCriterion("`property_price` like", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceNotLike(String value) {
            addCriterion("`property_price` not like", value, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceIn(List<String> values) {
            addCriterion("`property_price` in", values, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceNotIn(List<String> values) {
            addCriterion("`property_price` not in", values, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceBetween(String value1, String value2) {
            addCriterion("`property_price` between", value1, value2, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyPriceNotBetween(String value1, String value2) {
            addCriterion("`property_price` not between", value1, value2, "propertyPrice");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNull() {
            addCriterion("`property_type` is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("`property_type` is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("`property_type` =", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("`property_type` <>", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("`property_type` >", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`property_type` >=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("`property_type` <", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("`property_type` <=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLike(String value) {
            addCriterion("`property_type` like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotLike(String value) {
            addCriterion("`property_type` not like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIn(List<String> values) {
            addCriterion("`property_type` in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotIn(List<String> values) {
            addCriterion("`property_type` not in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("`property_type` between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("`property_type` not between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("`structure` is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("`structure` is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("`structure` =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("`structure` <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("`structure` >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("`structure` >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("`structure` <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("`structure` <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("`structure` like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("`structure` not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("`structure` in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("`structure` not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("`structure` between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("`structure` not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateIsNull() {
            addCriterion("`trust_agreement_state` is null");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateIsNotNull() {
            addCriterion("`trust_agreement_state` is not null");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateEqualTo(String value) {
            addCriterion("`trust_agreement_state` =", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateNotEqualTo(String value) {
            addCriterion("`trust_agreement_state` <>", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateGreaterThan(String value) {
            addCriterion("`trust_agreement_state` >", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateGreaterThanOrEqualTo(String value) {
            addCriterion("`trust_agreement_state` >=", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateLessThan(String value) {
            addCriterion("`trust_agreement_state` <", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateLessThanOrEqualTo(String value) {
            addCriterion("`trust_agreement_state` <=", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateLike(String value) {
            addCriterion("`trust_agreement_state` like", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateNotLike(String value) {
            addCriterion("`trust_agreement_state` not like", value, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateIn(List<String> values) {
            addCriterion("`trust_agreement_state` in", values, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateNotIn(List<String> values) {
            addCriterion("`trust_agreement_state` not in", values, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateBetween(String value1, String value2) {
            addCriterion("`trust_agreement_state` between", value1, value2, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andTrustAgreementStateNotBetween(String value1, String value2) {
            addCriterion("`trust_agreement_state` not between", value1, value2, "trustAgreementState");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("`resource` is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("`resource` is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(String value) {
            addCriterion("`resource` =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(String value) {
            addCriterion("`resource` <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(String value) {
            addCriterion("`resource` >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(String value) {
            addCriterion("`resource` >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(String value) {
            addCriterion("`resource` <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(String value) {
            addCriterion("`resource` <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLike(String value) {
            addCriterion("`resource` like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotLike(String value) {
            addCriterion("`resource` not like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<String> values) {
            addCriterion("`resource` in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<String> values) {
            addCriterion("`resource` not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(String value1, String value2) {
            addCriterion("`resource` between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(String value1, String value2) {
            addCriterion("`resource` not between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andKeyStateIsNull() {
            addCriterion("`key_state` is null");
            return (Criteria) this;
        }

        public Criteria andKeyStateIsNotNull() {
            addCriterion("`key_state` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyStateEqualTo(String value) {
            addCriterion("`key_state` =", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateNotEqualTo(String value) {
            addCriterion("`key_state` <>", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateGreaterThan(String value) {
            addCriterion("`key_state` >", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateGreaterThanOrEqualTo(String value) {
            addCriterion("`key_state` >=", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateLessThan(String value) {
            addCriterion("`key_state` <", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateLessThanOrEqualTo(String value) {
            addCriterion("`key_state` <=", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateLike(String value) {
            addCriterion("`key_state` like", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateNotLike(String value) {
            addCriterion("`key_state` not like", value, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateIn(List<String> values) {
            addCriterion("`key_state` in", values, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateNotIn(List<String> values) {
            addCriterion("`key_state` not in", values, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateBetween(String value1, String value2) {
            addCriterion("`key_state` between", value1, value2, "keyState");
            return (Criteria) this;
        }

        public Criteria andKeyStateNotBetween(String value1, String value2) {
            addCriterion("`key_state` not between", value1, value2, "keyState");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("`order` is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("`order` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("`order` =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("`order` <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("`order` >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("`order` >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("`order` <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("`order` <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("`order` in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("`order` not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("`order` between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("`order` not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("`phone` is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("`phone` is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("`phone` =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("`phone` <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("`phone` >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("`phone` >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("`phone` <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("`phone` <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("`phone` like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("`phone` not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("`phone` in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("`phone` not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("`phone` between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("`phone` not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesIsNull() {
            addCriterion("`house_facilities` is null");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesIsNotNull() {
            addCriterion("`house_facilities` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesEqualTo(String value) {
            addCriterion("`house_facilities` =", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesNotEqualTo(String value) {
            addCriterion("`house_facilities` <>", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesGreaterThan(String value) {
            addCriterion("`house_facilities` >", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("`house_facilities` >=", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesLessThan(String value) {
            addCriterion("`house_facilities` <", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("`house_facilities` <=", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesLike(String value) {
            addCriterion("`house_facilities` like", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesNotLike(String value) {
            addCriterion("`house_facilities` not like", value, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesIn(List<String> values) {
            addCriterion("`house_facilities` in", values, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesNotIn(List<String> values) {
            addCriterion("`house_facilities` not in", values, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesBetween(String value1, String value2) {
            addCriterion("`house_facilities` between", value1, value2, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andHouseFacilitiesNotBetween(String value1, String value2) {
            addCriterion("`house_facilities` not between", value1, value2, "houseFacilities");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionIsNull() {
            addCriterion("`area_description` is null");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionIsNotNull() {
            addCriterion("`area_description` is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionEqualTo(String value) {
            addCriterion("`area_description` =", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionNotEqualTo(String value) {
            addCriterion("`area_description` <>", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionGreaterThan(String value) {
            addCriterion("`area_description` >", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("`area_description` >=", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionLessThan(String value) {
            addCriterion("`area_description` <", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("`area_description` <=", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionLike(String value) {
            addCriterion("`area_description` like", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionNotLike(String value) {
            addCriterion("`area_description` not like", value, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionIn(List<String> values) {
            addCriterion("`area_description` in", values, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionNotIn(List<String> values) {
            addCriterion("`area_description` not in", values, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionBetween(String value1, String value2) {
            addCriterion("`area_description` between", value1, value2, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andAreaDescriptionNotBetween(String value1, String value2) {
            addCriterion("`area_description` not between", value1, value2, "areaDescription");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("`note` is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("`note` is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("`note` =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("`note` <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("`note` >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("`note` >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("`note` <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("`note` <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("`note` like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("`note` not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("`note` in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("`note` not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("`note` between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("`note` not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCommissionManIsNull() {
            addCriterion("`commission_man` is null");
            return (Criteria) this;
        }

        public Criteria andCommissionManIsNotNull() {
            addCriterion("`commission_man` is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionManEqualTo(String value) {
            addCriterion("`commission_man` =", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManNotEqualTo(String value) {
            addCriterion("`commission_man` <>", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManGreaterThan(String value) {
            addCriterion("`commission_man` >", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManGreaterThanOrEqualTo(String value) {
            addCriterion("`commission_man` >=", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManLessThan(String value) {
            addCriterion("`commission_man` <", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManLessThanOrEqualTo(String value) {
            addCriterion("`commission_man` <=", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManLike(String value) {
            addCriterion("`commission_man` like", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManNotLike(String value) {
            addCriterion("`commission_man` not like", value, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManIn(List<String> values) {
            addCriterion("`commission_man` in", values, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManNotIn(List<String> values) {
            addCriterion("`commission_man` not in", values, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManBetween(String value1, String value2) {
            addCriterion("`commission_man` between", value1, value2, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionManNotBetween(String value1, String value2) {
            addCriterion("`commission_man` not between", value1, value2, "commissionMan");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNull() {
            addCriterion("`commission_type` is null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIsNotNull() {
            addCriterion("`commission_type` is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeEqualTo(String value) {
            addCriterion("`commission_type` =", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotEqualTo(String value) {
            addCriterion("`commission_type` <>", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThan(String value) {
            addCriterion("`commission_type` >", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`commission_type` >=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThan(String value) {
            addCriterion("`commission_type` <", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLessThanOrEqualTo(String value) {
            addCriterion("`commission_type` <=", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeLike(String value) {
            addCriterion("`commission_type` like", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotLike(String value) {
            addCriterion("`commission_type` not like", value, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeIn(List<String> values) {
            addCriterion("`commission_type` in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotIn(List<String> values) {
            addCriterion("`commission_type` not in", values, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeBetween(String value1, String value2) {
            addCriterion("`commission_type` between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andCommissionTypeNotBetween(String value1, String value2) {
            addCriterion("`commission_type` not between", value1, value2, "commissionType");
            return (Criteria) this;
        }

        public Criteria andRegistrationManIsNull() {
            addCriterion("`registration_man` is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationManIsNotNull() {
            addCriterion("`registration_man` is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationManEqualTo(String value) {
            addCriterion("`registration_man` =", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManNotEqualTo(String value) {
            addCriterion("`registration_man` <>", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManGreaterThan(String value) {
            addCriterion("`registration_man` >", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManGreaterThanOrEqualTo(String value) {
            addCriterion("`registration_man` >=", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManLessThan(String value) {
            addCriterion("`registration_man` <", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManLessThanOrEqualTo(String value) {
            addCriterion("`registration_man` <=", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManLike(String value) {
            addCriterion("`registration_man` like", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManNotLike(String value) {
            addCriterion("`registration_man` not like", value, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManIn(List<String> values) {
            addCriterion("`registration_man` in", values, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManNotIn(List<String> values) {
            addCriterion("`registration_man` not in", values, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManBetween(String value1, String value2) {
            addCriterion("`registration_man` between", value1, value2, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andRegistrationManNotBetween(String value1, String value2) {
            addCriterion("`registration_man` not between", value1, value2, "registrationMan");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("`id_card` is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("`id_card` is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("`id_card` =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("`id_card` <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("`id_card` >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("`id_card` >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("`id_card` <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("`id_card` <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("`id_card` like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("`id_card` not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("`id_card` in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("`id_card` not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("`id_card` between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("`id_card` not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodIsNull() {
            addCriterion("`look_house_method` is null");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodIsNotNull() {
            addCriterion("`look_house_method` is not null");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodEqualTo(String value) {
            addCriterion("`look_house_method` =", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodNotEqualTo(String value) {
            addCriterion("`look_house_method` <>", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodGreaterThan(String value) {
            addCriterion("`look_house_method` >", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodGreaterThanOrEqualTo(String value) {
            addCriterion("`look_house_method` >=", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodLessThan(String value) {
            addCriterion("`look_house_method` <", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodLessThanOrEqualTo(String value) {
            addCriterion("`look_house_method` <=", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodLike(String value) {
            addCriterion("`look_house_method` like", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodNotLike(String value) {
            addCriterion("`look_house_method` not like", value, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodIn(List<String> values) {
            addCriterion("`look_house_method` in", values, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodNotIn(List<String> values) {
            addCriterion("`look_house_method` not in", values, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodBetween(String value1, String value2) {
            addCriterion("`look_house_method` between", value1, value2, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andLookHouseMethodNotBetween(String value1, String value2) {
            addCriterion("`look_house_method` not between", value1, value2, "lookHouseMethod");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNull() {
            addCriterion("`flags` is null");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNotNull() {
            addCriterion("`flags` is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsEqualTo(String value) {
            addCriterion("`flags` =", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotEqualTo(String value) {
            addCriterion("`flags` <>", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThan(String value) {
            addCriterion("`flags` >", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThanOrEqualTo(String value) {
            addCriterion("`flags` >=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThan(String value) {
            addCriterion("`flags` <", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThanOrEqualTo(String value) {
            addCriterion("`flags` <=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLike(String value) {
            addCriterion("`flags` like", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotLike(String value) {
            addCriterion("`flags` not like", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsIn(List<String> values) {
            addCriterion("`flags` in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotIn(List<String> values) {
            addCriterion("`flags` not in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsBetween(String value1, String value2) {
            addCriterion("`flags` between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotBetween(String value1, String value2) {
            addCriterion("`flags` not between", value1, value2, "flags");
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