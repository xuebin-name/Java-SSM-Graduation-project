package com.nnljfl.bean;

import java.util.ArrayList;
import java.util.List;

public class WayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WayExample() {
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

        public Criteria andWayIdIsNull() {
            addCriterion("way_id is null");
            return (Criteria) this;
        }

        public Criteria andWayIdIsNotNull() {
            addCriterion("way_id is not null");
            return (Criteria) this;
        }

        public Criteria andWayIdEqualTo(Integer value) {
            addCriterion("way_id =", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotEqualTo(Integer value) {
            addCriterion("way_id <>", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThan(Integer value) {
            addCriterion("way_id >", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_id >=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThan(Integer value) {
            addCriterion("way_id <", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("way_id <=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdIn(List<Integer> values) {
            addCriterion("way_id in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotIn(List<Integer> values) {
            addCriterion("way_id not in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdBetween(Integer value1, Integer value2) {
            addCriterion("way_id between", value1, value2, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("way_id not between", value1, value2, "wayId");
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

        public Criteria andWayDatilsIsNull() {
            addCriterion("way_datils is null");
            return (Criteria) this;
        }

        public Criteria andWayDatilsIsNotNull() {
            addCriterion("way_datils is not null");
            return (Criteria) this;
        }

        public Criteria andWayDatilsEqualTo(String value) {
            addCriterion("way_datils =", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsNotEqualTo(String value) {
            addCriterion("way_datils <>", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsGreaterThan(String value) {
            addCriterion("way_datils >", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsGreaterThanOrEqualTo(String value) {
            addCriterion("way_datils >=", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsLessThan(String value) {
            addCriterion("way_datils <", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsLessThanOrEqualTo(String value) {
            addCriterion("way_datils <=", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsLike(String value) {
            addCriterion("way_datils like", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsNotLike(String value) {
            addCriterion("way_datils not like", value, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsIn(List<String> values) {
            addCriterion("way_datils in", values, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsNotIn(List<String> values) {
            addCriterion("way_datils not in", values, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsBetween(String value1, String value2) {
            addCriterion("way_datils between", value1, value2, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayDatilsNotBetween(String value1, String value2) {
            addCriterion("way_datils not between", value1, value2, "wayDatils");
            return (Criteria) this;
        }

        public Criteria andWayTitleIsNull() {
            addCriterion("way_title is null");
            return (Criteria) this;
        }

        public Criteria andWayTitleIsNotNull() {
            addCriterion("way_title is not null");
            return (Criteria) this;
        }

        public Criteria andWayTitleEqualTo(String value) {
            addCriterion("way_title =", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleNotEqualTo(String value) {
            addCriterion("way_title <>", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleGreaterThan(String value) {
            addCriterion("way_title >", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleGreaterThanOrEqualTo(String value) {
            addCriterion("way_title >=", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleLessThan(String value) {
            addCriterion("way_title <", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleLessThanOrEqualTo(String value) {
            addCriterion("way_title <=", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleLike(String value) {
            addCriterion("way_title like", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleNotLike(String value) {
            addCriterion("way_title not like", value, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleIn(List<String> values) {
            addCriterion("way_title in", values, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleNotIn(List<String> values) {
            addCriterion("way_title not in", values, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleBetween(String value1, String value2) {
            addCriterion("way_title between", value1, value2, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayTitleNotBetween(String value1, String value2) {
            addCriterion("way_title not between", value1, value2, "wayTitle");
            return (Criteria) this;
        }

        public Criteria andWayK1IsNull() {
            addCriterion("way_k1 is null");
            return (Criteria) this;
        }

        public Criteria andWayK1IsNotNull() {
            addCriterion("way_k1 is not null");
            return (Criteria) this;
        }

        public Criteria andWayK1EqualTo(String value) {
            addCriterion("way_k1 =", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1NotEqualTo(String value) {
            addCriterion("way_k1 <>", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1GreaterThan(String value) {
            addCriterion("way_k1 >", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1GreaterThanOrEqualTo(String value) {
            addCriterion("way_k1 >=", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1LessThan(String value) {
            addCriterion("way_k1 <", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1LessThanOrEqualTo(String value) {
            addCriterion("way_k1 <=", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1Like(String value) {
            addCriterion("way_k1 like", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1NotLike(String value) {
            addCriterion("way_k1 not like", value, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1In(List<String> values) {
            addCriterion("way_k1 in", values, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1NotIn(List<String> values) {
            addCriterion("way_k1 not in", values, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1Between(String value1, String value2) {
            addCriterion("way_k1 between", value1, value2, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK1NotBetween(String value1, String value2) {
            addCriterion("way_k1 not between", value1, value2, "wayK1");
            return (Criteria) this;
        }

        public Criteria andWayK2IsNull() {
            addCriterion("way_k2 is null");
            return (Criteria) this;
        }

        public Criteria andWayK2IsNotNull() {
            addCriterion("way_k2 is not null");
            return (Criteria) this;
        }

        public Criteria andWayK2EqualTo(String value) {
            addCriterion("way_k2 =", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2NotEqualTo(String value) {
            addCriterion("way_k2 <>", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2GreaterThan(String value) {
            addCriterion("way_k2 >", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2GreaterThanOrEqualTo(String value) {
            addCriterion("way_k2 >=", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2LessThan(String value) {
            addCriterion("way_k2 <", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2LessThanOrEqualTo(String value) {
            addCriterion("way_k2 <=", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2Like(String value) {
            addCriterion("way_k2 like", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2NotLike(String value) {
            addCriterion("way_k2 not like", value, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2In(List<String> values) {
            addCriterion("way_k2 in", values, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2NotIn(List<String> values) {
            addCriterion("way_k2 not in", values, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2Between(String value1, String value2) {
            addCriterion("way_k2 between", value1, value2, "wayK2");
            return (Criteria) this;
        }

        public Criteria andWayK2NotBetween(String value1, String value2) {
            addCriterion("way_k2 not between", value1, value2, "wayK2");
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