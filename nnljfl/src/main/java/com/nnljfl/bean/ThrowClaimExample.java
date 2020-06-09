package com.nnljfl.bean;

import java.util.ArrayList;
import java.util.List;

public class ThrowClaimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThrowClaimExample() {
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

        public Criteria andThrowIdIsNull() {
            addCriterion("throw_id is null");
            return (Criteria) this;
        }

        public Criteria andThrowIdIsNotNull() {
            addCriterion("throw_id is not null");
            return (Criteria) this;
        }

        public Criteria andThrowIdEqualTo(Integer value) {
            addCriterion("throw_id =", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdNotEqualTo(Integer value) {
            addCriterion("throw_id <>", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdGreaterThan(Integer value) {
            addCriterion("throw_id >", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("throw_id >=", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdLessThan(Integer value) {
            addCriterion("throw_id <", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("throw_id <=", value, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdIn(List<Integer> values) {
            addCriterion("throw_id in", values, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdNotIn(List<Integer> values) {
            addCriterion("throw_id not in", values, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdBetween(Integer value1, Integer value2) {
            addCriterion("throw_id between", value1, value2, "throwId");
            return (Criteria) this;
        }

        public Criteria andThrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("throw_id not between", value1, value2, "throwId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andThrowTitleIsNull() {
            addCriterion("throw_title is null");
            return (Criteria) this;
        }

        public Criteria andThrowTitleIsNotNull() {
            addCriterion("throw_title is not null");
            return (Criteria) this;
        }

        public Criteria andThrowTitleEqualTo(String value) {
            addCriterion("throw_title =", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleNotEqualTo(String value) {
            addCriterion("throw_title <>", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleGreaterThan(String value) {
            addCriterion("throw_title >", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleGreaterThanOrEqualTo(String value) {
            addCriterion("throw_title >=", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleLessThan(String value) {
            addCriterion("throw_title <", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleLessThanOrEqualTo(String value) {
            addCriterion("throw_title <=", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleLike(String value) {
            addCriterion("throw_title like", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleNotLike(String value) {
            addCriterion("throw_title not like", value, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleIn(List<String> values) {
            addCriterion("throw_title in", values, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleNotIn(List<String> values) {
            addCriterion("throw_title not in", values, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleBetween(String value1, String value2) {
            addCriterion("throw_title between", value1, value2, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowTitleNotBetween(String value1, String value2) {
            addCriterion("throw_title not between", value1, value2, "throwTitle");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsIsNull() {
            addCriterion("throw_datils is null");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsIsNotNull() {
            addCriterion("throw_datils is not null");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsEqualTo(String value) {
            addCriterion("throw_datils =", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsNotEqualTo(String value) {
            addCriterion("throw_datils <>", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsGreaterThan(String value) {
            addCriterion("throw_datils >", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsGreaterThanOrEqualTo(String value) {
            addCriterion("throw_datils >=", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsLessThan(String value) {
            addCriterion("throw_datils <", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsLessThanOrEqualTo(String value) {
            addCriterion("throw_datils <=", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsLike(String value) {
            addCriterion("throw_datils like", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsNotLike(String value) {
            addCriterion("throw_datils not like", value, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsIn(List<String> values) {
            addCriterion("throw_datils in", values, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsNotIn(List<String> values) {
            addCriterion("throw_datils not in", values, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsBetween(String value1, String value2) {
            addCriterion("throw_datils between", value1, value2, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowDatilsNotBetween(String value1, String value2) {
            addCriterion("throw_datils not between", value1, value2, "throwDatils");
            return (Criteria) this;
        }

        public Criteria andThrowPromptIsNull() {
            addCriterion("throw_prompt is null");
            return (Criteria) this;
        }

        public Criteria andThrowPromptIsNotNull() {
            addCriterion("throw_prompt is not null");
            return (Criteria) this;
        }

        public Criteria andThrowPromptEqualTo(String value) {
            addCriterion("throw_prompt =", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptNotEqualTo(String value) {
            addCriterion("throw_prompt <>", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptGreaterThan(String value) {
            addCriterion("throw_prompt >", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptGreaterThanOrEqualTo(String value) {
            addCriterion("throw_prompt >=", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptLessThan(String value) {
            addCriterion("throw_prompt <", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptLessThanOrEqualTo(String value) {
            addCriterion("throw_prompt <=", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptLike(String value) {
            addCriterion("throw_prompt like", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptNotLike(String value) {
            addCriterion("throw_prompt not like", value, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptIn(List<String> values) {
            addCriterion("throw_prompt in", values, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptNotIn(List<String> values) {
            addCriterion("throw_prompt not in", values, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptBetween(String value1, String value2) {
            addCriterion("throw_prompt between", value1, value2, "throwPrompt");
            return (Criteria) this;
        }

        public Criteria andThrowPromptNotBetween(String value1, String value2) {
            addCriterion("throw_prompt not between", value1, value2, "throwPrompt");
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