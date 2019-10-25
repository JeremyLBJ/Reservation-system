package com.lhd.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public PayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRoidIsNull() {
            addCriterion("roid is null");
            return (Criteria) this;
        }

        public Criteria andRoidIsNotNull() {
            addCriterion("roid is not null");
            return (Criteria) this;
        }

        public Criteria andRoidEqualTo(String value) {
            addCriterion("roid =", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotEqualTo(String value) {
            addCriterion("roid <>", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThan(String value) {
            addCriterion("roid >", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThanOrEqualTo(String value) {
            addCriterion("roid >=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThan(String value) {
            addCriterion("roid <", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThanOrEqualTo(String value) {
            addCriterion("roid <=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLike(String value) {
            addCriterion("roid like", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotLike(String value) {
            addCriterion("roid not like", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidIn(List<String> values) {
            addCriterion("roid in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotIn(List<String> values) {
            addCriterion("roid not in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidBetween(String value1, String value2) {
            addCriterion("roid between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotBetween(String value1, String value2) {
            addCriterion("roid not between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaystatueIsNull() {
            addCriterion("payStatue is null");
            return (Criteria) this;
        }

        public Criteria andPaystatueIsNotNull() {
            addCriterion("payStatue is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatueEqualTo(Integer value) {
            addCriterion("payStatue =", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueNotEqualTo(Integer value) {
            addCriterion("payStatue <>", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueGreaterThan(Integer value) {
            addCriterion("payStatue >", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("payStatue >=", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueLessThan(Integer value) {
            addCriterion("payStatue <", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueLessThanOrEqualTo(Integer value) {
            addCriterion("payStatue <=", value, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueIn(List<Integer> values) {
            addCriterion("payStatue in", values, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueNotIn(List<Integer> values) {
            addCriterion("payStatue not in", values, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueBetween(Integer value1, Integer value2) {
            addCriterion("payStatue between", value1, value2, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPaystatueNotBetween(Integer value1, Integer value2) {
            addCriterion("payStatue not between", value1, value2, "paystatue");
            return (Criteria) this;
        }

        public Criteria andPayclassIsNull() {
            addCriterion("payClass is null");
            return (Criteria) this;
        }

        public Criteria andPayclassIsNotNull() {
            addCriterion("payClass is not null");
            return (Criteria) this;
        }

        public Criteria andPayclassEqualTo(Integer value) {
            addCriterion("payClass =", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassNotEqualTo(Integer value) {
            addCriterion("payClass <>", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassGreaterThan(Integer value) {
            addCriterion("payClass >", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("payClass >=", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassLessThan(Integer value) {
            addCriterion("payClass <", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassLessThanOrEqualTo(Integer value) {
            addCriterion("payClass <=", value, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassIn(List<Integer> values) {
            addCriterion("payClass in", values, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassNotIn(List<Integer> values) {
            addCriterion("payClass not in", values, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassBetween(Integer value1, Integer value2) {
            addCriterion("payClass between", value1, value2, "payclass");
            return (Criteria) this;
        }

        public Criteria andPayclassNotBetween(Integer value1, Integer value2) {
            addCriterion("payClass not between", value1, value2, "payclass");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 24 15:52:53 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
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