package com.nnljfl.bean;

import java.util.ArrayList;
import java.util.List;

public class TypeModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeModelExample() {
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeDatilIsNull() {
            addCriterion("type_datil is null");
            return (Criteria) this;
        }

        public Criteria andTypeDatilIsNotNull() {
            addCriterion("type_datil is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDatilEqualTo(String value) {
            addCriterion("type_datil =", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilNotEqualTo(String value) {
            addCriterion("type_datil <>", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilGreaterThan(String value) {
            addCriterion("type_datil >", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilGreaterThanOrEqualTo(String value) {
            addCriterion("type_datil >=", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilLessThan(String value) {
            addCriterion("type_datil <", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilLessThanOrEqualTo(String value) {
            addCriterion("type_datil <=", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilLike(String value) {
            addCriterion("type_datil like", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilNotLike(String value) {
            addCriterion("type_datil not like", value, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilIn(List<String> values) {
            addCriterion("type_datil in", values, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilNotIn(List<String> values) {
            addCriterion("type_datil not in", values, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilBetween(String value1, String value2) {
            addCriterion("type_datil between", value1, value2, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeDatilNotBetween(String value1, String value2) {
            addCriterion("type_datil not between", value1, value2, "typeDatil");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeIsNull() {
            addCriterion("type_include is null");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeIsNotNull() {
            addCriterion("type_include is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeEqualTo(String value) {
            addCriterion("type_include =", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeNotEqualTo(String value) {
            addCriterion("type_include <>", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeGreaterThan(String value) {
            addCriterion("type_include >", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeGreaterThanOrEqualTo(String value) {
            addCriterion("type_include >=", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeLessThan(String value) {
            addCriterion("type_include <", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeLessThanOrEqualTo(String value) {
            addCriterion("type_include <=", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeLike(String value) {
            addCriterion("type_include like", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeNotLike(String value) {
            addCriterion("type_include not like", value, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeIn(List<String> values) {
            addCriterion("type_include in", values, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeNotIn(List<String> values) {
            addCriterion("type_include not in", values, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeBetween(String value1, String value2) {
            addCriterion("type_include between", value1, value2, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeIncludeNotBetween(String value1, String value2) {
            addCriterion("type_include not between", value1, value2, "typeInclude");
            return (Criteria) this;
        }

        public Criteria andTypeK1IsNull() {
            addCriterion("type_k1 is null");
            return (Criteria) this;
        }

        public Criteria andTypeK1IsNotNull() {
            addCriterion("type_k1 is not null");
            return (Criteria) this;
        }

        public Criteria andTypeK1EqualTo(String value) {
            addCriterion("type_k1 =", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1NotEqualTo(String value) {
            addCriterion("type_k1 <>", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1GreaterThan(String value) {
            addCriterion("type_k1 >", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1GreaterThanOrEqualTo(String value) {
            addCriterion("type_k1 >=", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1LessThan(String value) {
            addCriterion("type_k1 <", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1LessThanOrEqualTo(String value) {
            addCriterion("type_k1 <=", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1Like(String value) {
            addCriterion("type_k1 like", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1NotLike(String value) {
            addCriterion("type_k1 not like", value, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1In(List<String> values) {
            addCriterion("type_k1 in", values, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1NotIn(List<String> values) {
            addCriterion("type_k1 not in", values, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1Between(String value1, String value2) {
            addCriterion("type_k1 between", value1, value2, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK1NotBetween(String value1, String value2) {
            addCriterion("type_k1 not between", value1, value2, "typeK1");
            return (Criteria) this;
        }

        public Criteria andTypeK2IsNull() {
            addCriterion("type_k2 is null");
            return (Criteria) this;
        }

        public Criteria andTypeK2IsNotNull() {
            addCriterion("type_k2 is not null");
            return (Criteria) this;
        }

        public Criteria andTypeK2EqualTo(String value) {
            addCriterion("type_k2 =", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2NotEqualTo(String value) {
            addCriterion("type_k2 <>", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2GreaterThan(String value) {
            addCriterion("type_k2 >", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2GreaterThanOrEqualTo(String value) {
            addCriterion("type_k2 >=", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2LessThan(String value) {
            addCriterion("type_k2 <", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2LessThanOrEqualTo(String value) {
            addCriterion("type_k2 <=", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2Like(String value) {
            addCriterion("type_k2 like", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2NotLike(String value) {
            addCriterion("type_k2 not like", value, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2In(List<String> values) {
            addCriterion("type_k2 in", values, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2NotIn(List<String> values) {
            addCriterion("type_k2 not in", values, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2Between(String value1, String value2) {
            addCriterion("type_k2 between", value1, value2, "typeK2");
            return (Criteria) this;
        }

        public Criteria andTypeK2NotBetween(String value1, String value2) {
            addCriterion("type_k2 not between", value1, value2, "typeK2");
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