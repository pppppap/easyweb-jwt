package com.wf.ew.house.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("`content` is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("`content` is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("`content` =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("`content` <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("`content` >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("`content` >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("`content` <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("`content` <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("`content` like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("`content` not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("`content` in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("`content` not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("`content` between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("`content` not between", value1, value2, "content");
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

        public Criteria andFollowTimeIsNull() {
            addCriterion("`follow_time` is null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIsNotNull() {
            addCriterion("`follow_time` is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTimeEqualTo(Date value) {
            addCriterion("`follow_time` =", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotEqualTo(Date value) {
            addCriterion("`follow_time` <>", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThan(Date value) {
            addCriterion("`follow_time` >", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`follow_time` >=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThan(Date value) {
            addCriterion("`follow_time` <", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeLessThanOrEqualTo(Date value) {
            addCriterion("`follow_time` <=", value, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeIn(List<Date> values) {
            addCriterion("`follow_time` in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotIn(List<Date> values) {
            addCriterion("`follow_time` not in", values, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeBetween(Date value1, Date value2) {
            addCriterion("`follow_time` between", value1, value2, "followTime");
            return (Criteria) this;
        }

        public Criteria andFollowTimeNotBetween(Date value1, Date value2) {
            addCriterion("`follow_time` not between", value1, value2, "followTime");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("`house_id` is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("`house_id` is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("`house_id` =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("`house_id` <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("`house_id` >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`house_id` >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("`house_id` <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("`house_id` <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("`house_id` in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("`house_id` not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("`house_id` between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`house_id` not between", value1, value2, "houseId");
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