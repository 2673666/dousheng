package com.douSheng.pojo;

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMyUidIsNull() {
            addCriterion("my_uid is null");
            return (Criteria) this;
        }

        public Criteria andMyUidIsNotNull() {
            addCriterion("my_uid is not null");
            return (Criteria) this;
        }

        public Criteria andMyUidEqualTo(Long value) {
            addCriterion("my_uid =", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidNotEqualTo(Long value) {
            addCriterion("my_uid <>", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidGreaterThan(Long value) {
            addCriterion("my_uid >", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidGreaterThanOrEqualTo(Long value) {
            addCriterion("my_uid >=", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidLessThan(Long value) {
            addCriterion("my_uid <", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidLessThanOrEqualTo(Long value) {
            addCriterion("my_uid <=", value, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidIn(List<Long> values) {
            addCriterion("my_uid in", values, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidNotIn(List<Long> values) {
            addCriterion("my_uid not in", values, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidBetween(Long value1, Long value2) {
            addCriterion("my_uid between", value1, value2, "myUid");
            return (Criteria) this;
        }

        public Criteria andMyUidNotBetween(Long value1, Long value2) {
            addCriterion("my_uid not between", value1, value2, "myUid");
            return (Criteria) this;
        }

        public Criteria andHisUidIsNull() {
            addCriterion("his_uid is null");
            return (Criteria) this;
        }

        public Criteria andHisUidIsNotNull() {
            addCriterion("his_uid is not null");
            return (Criteria) this;
        }

        public Criteria andHisUidEqualTo(Long value) {
            addCriterion("his_uid =", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidNotEqualTo(Long value) {
            addCriterion("his_uid <>", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidGreaterThan(Long value) {
            addCriterion("his_uid >", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidGreaterThanOrEqualTo(Long value) {
            addCriterion("his_uid >=", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidLessThan(Long value) {
            addCriterion("his_uid <", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidLessThanOrEqualTo(Long value) {
            addCriterion("his_uid <=", value, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidIn(List<Long> values) {
            addCriterion("his_uid in", values, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidNotIn(List<Long> values) {
            addCriterion("his_uid not in", values, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidBetween(Long value1, Long value2) {
            addCriterion("his_uid between", value1, value2, "hisUid");
            return (Criteria) this;
        }

        public Criteria andHisUidNotBetween(Long value1, Long value2) {
            addCriterion("his_uid not between", value1, value2, "hisUid");
            return (Criteria) this;
        }

        public Criteria andIsFollowIsNull() {
            addCriterion("is_follow is null");
            return (Criteria) this;
        }

        public Criteria andIsFollowIsNotNull() {
            addCriterion("is_follow is not null");
            return (Criteria) this;
        }

        public Criteria andIsFollowEqualTo(Byte value) {
            addCriterion("is_follow =", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowNotEqualTo(Byte value) {
            addCriterion("is_follow <>", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowGreaterThan(Byte value) {
            addCriterion("is_follow >", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_follow >=", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowLessThan(Byte value) {
            addCriterion("is_follow <", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowLessThanOrEqualTo(Byte value) {
            addCriterion("is_follow <=", value, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowIn(List<Byte> values) {
            addCriterion("is_follow in", values, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowNotIn(List<Byte> values) {
            addCriterion("is_follow not in", values, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowBetween(Byte value1, Byte value2) {
            addCriterion("is_follow between", value1, value2, "isFollow");
            return (Criteria) this;
        }

        public Criteria andIsFollowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_follow not between", value1, value2, "isFollow");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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