package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ViewhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewhistoryExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andViewhistoryIdIsNull() {
            addCriterion("viewHistory_id is null");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdIsNotNull() {
            addCriterion("viewHistory_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdEqualTo(String value) {
            addCriterion("viewHistory_id =", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdNotEqualTo(String value) {
            addCriterion("viewHistory_id <>", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdGreaterThan(String value) {
            addCriterion("viewHistory_id >", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("viewHistory_id >=", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdLessThan(String value) {
            addCriterion("viewHistory_id <", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdLessThanOrEqualTo(String value) {
            addCriterion("viewHistory_id <=", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdLike(String value) {
            addCriterion("viewHistory_id like", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdNotLike(String value) {
            addCriterion("viewHistory_id not like", value, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdIn(List<String> values) {
            addCriterion("viewHistory_id in", values, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdNotIn(List<String> values) {
            addCriterion("viewHistory_id not in", values, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdBetween(String value1, String value2) {
            addCriterion("viewHistory_id between", value1, value2, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andViewhistoryIdNotBetween(String value1, String value2) {
            addCriterion("viewHistory_id not between", value1, value2, "viewhistoryId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateIsNull() {
            addCriterion("viewHistory_date is null");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateIsNotNull() {
            addCriterion("viewHistory_date is not null");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateEqualTo(Date value) {
            addCriterionForJDBCDate("viewHistory_date =", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("viewHistory_date <>", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("viewHistory_date >", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("viewHistory_date >=", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateLessThan(Date value) {
            addCriterionForJDBCDate("viewHistory_date <", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("viewHistory_date <=", value, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateIn(List<Date> values) {
            addCriterionForJDBCDate("viewHistory_date in", values, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("viewHistory_date not in", values, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("viewHistory_date between", value1, value2, "viewhistoryDate");
            return (Criteria) this;
        }

        public Criteria andViewhistoryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("viewHistory_date not between", value1, value2, "viewhistoryDate");
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