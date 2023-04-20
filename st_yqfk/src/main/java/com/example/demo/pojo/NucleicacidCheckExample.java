package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NucleicacidCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NucleicacidCheckExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("PTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("PTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("PTYPE =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("PTYPE <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("PTYPE >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PTYPE >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("PTYPE <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("PTYPE <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("PTYPE like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("PTYPE not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("PTYPE in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("PTYPE not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("PTYPE between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("PTYPE not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andHidIsNull() {
            addCriterion("HID is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("HID is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("HID =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("HID <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("HID >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HID >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("HID <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("HID <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("HID in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("HID not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("HID between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("HID not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("DID not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNull() {
            addCriterion("SAMPLING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNotNull() {
            addCriterion("SAMPLING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateEqualTo(Date value) {
            addCriterion("SAMPLING_DATE =", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotEqualTo(Date value) {
            addCriterion("SAMPLING_DATE <>", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThan(Date value) {
            addCriterion("SAMPLING_DATE >", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SAMPLING_DATE >=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThan(Date value) {
            addCriterion("SAMPLING_DATE <", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThanOrEqualTo(Date value) {
            addCriterion("SAMPLING_DATE <=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIn(List<Date> values) {
            addCriterion("SAMPLING_DATE in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotIn(List<Date> values) {
            addCriterion("SAMPLING_DATE not in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateBetween(Date value1, Date value2) {
            addCriterion("SAMPLING_DATE between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotBetween(Date value1, Date value2) {
            addCriterion("SAMPLING_DATE not between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(String value) {
            addCriterion("ACTIVE =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(String value) {
            addCriterion("ACTIVE <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(String value) {
            addCriterion("ACTIVE >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(String value) {
            addCriterion("ACTIVE <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLike(String value) {
            addCriterion("ACTIVE like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotLike(String value) {
            addCriterion("ACTIVE not like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<String> values) {
            addCriterion("ACTIVE in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<String> values) {
            addCriterion("ACTIVE not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(String value1, String value2) {
            addCriterion("ACTIVE between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(String value1, String value2) {
            addCriterion("ACTIVE not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterion("LAST_DATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterion("LAST_DATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterion("LAST_DATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_DATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterion("LAST_DATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_DATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterion("LAST_DATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterion("LAST_DATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterion("LAST_DATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_DATE not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andFile1IsNull() {
            addCriterion("FILE1 is null");
            return (Criteria) this;
        }

        public Criteria andFile1IsNotNull() {
            addCriterion("FILE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFile1EqualTo(String value) {
            addCriterion("FILE1 =", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1NotEqualTo(String value) {
            addCriterion("FILE1 <>", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1GreaterThan(String value) {
            addCriterion("FILE1 >", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1GreaterThanOrEqualTo(String value) {
            addCriterion("FILE1 >=", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1LessThan(String value) {
            addCriterion("FILE1 <", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1LessThanOrEqualTo(String value) {
            addCriterion("FILE1 <=", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1Like(String value) {
            addCriterion("FILE1 like", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1NotLike(String value) {
            addCriterion("FILE1 not like", value, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1In(List<String> values) {
            addCriterion("FILE1 in", values, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1NotIn(List<String> values) {
            addCriterion("FILE1 not in", values, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1Between(String value1, String value2) {
            addCriterion("FILE1 between", value1, value2, "file1");
            return (Criteria) this;
        }

        public Criteria andFile1NotBetween(String value1, String value2) {
            addCriterion("FILE1 not between", value1, value2, "file1");
            return (Criteria) this;
        }

        public Criteria andFile2IsNull() {
            addCriterion("FILE2 is null");
            return (Criteria) this;
        }

        public Criteria andFile2IsNotNull() {
            addCriterion("FILE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFile2EqualTo(String value) {
            addCriterion("FILE2 =", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2NotEqualTo(String value) {
            addCriterion("FILE2 <>", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2GreaterThan(String value) {
            addCriterion("FILE2 >", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2GreaterThanOrEqualTo(String value) {
            addCriterion("FILE2 >=", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2LessThan(String value) {
            addCriterion("FILE2 <", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2LessThanOrEqualTo(String value) {
            addCriterion("FILE2 <=", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2Like(String value) {
            addCriterion("FILE2 like", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2NotLike(String value) {
            addCriterion("FILE2 not like", value, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2In(List<String> values) {
            addCriterion("FILE2 in", values, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2NotIn(List<String> values) {
            addCriterion("FILE2 not in", values, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2Between(String value1, String value2) {
            addCriterion("FILE2 between", value1, value2, "file2");
            return (Criteria) this;
        }

        public Criteria andFile2NotBetween(String value1, String value2) {
            addCriterion("FILE2 not between", value1, value2, "file2");
            return (Criteria) this;
        }

        public Criteria andFile3IsNull() {
            addCriterion("FILE3 is null");
            return (Criteria) this;
        }

        public Criteria andFile3IsNotNull() {
            addCriterion("FILE3 is not null");
            return (Criteria) this;
        }

        public Criteria andFile3EqualTo(String value) {
            addCriterion("FILE3 =", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3NotEqualTo(String value) {
            addCriterion("FILE3 <>", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3GreaterThan(String value) {
            addCriterion("FILE3 >", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3GreaterThanOrEqualTo(String value) {
            addCriterion("FILE3 >=", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3LessThan(String value) {
            addCriterion("FILE3 <", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3LessThanOrEqualTo(String value) {
            addCriterion("FILE3 <=", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3Like(String value) {
            addCriterion("FILE3 like", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3NotLike(String value) {
            addCriterion("FILE3 not like", value, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3In(List<String> values) {
            addCriterion("FILE3 in", values, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3NotIn(List<String> values) {
            addCriterion("FILE3 not in", values, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3Between(String value1, String value2) {
            addCriterion("FILE3 between", value1, value2, "file3");
            return (Criteria) this;
        }

        public Criteria andFile3NotBetween(String value1, String value2) {
            addCriterion("FILE3 not between", value1, value2, "file3");
            return (Criteria) this;
        }

        public Criteria andFile4IsNull() {
            addCriterion("FILE4 is null");
            return (Criteria) this;
        }

        public Criteria andFile4IsNotNull() {
            addCriterion("FILE4 is not null");
            return (Criteria) this;
        }

        public Criteria andFile4EqualTo(String value) {
            addCriterion("FILE4 =", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4NotEqualTo(String value) {
            addCriterion("FILE4 <>", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4GreaterThan(String value) {
            addCriterion("FILE4 >", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4GreaterThanOrEqualTo(String value) {
            addCriterion("FILE4 >=", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4LessThan(String value) {
            addCriterion("FILE4 <", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4LessThanOrEqualTo(String value) {
            addCriterion("FILE4 <=", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4Like(String value) {
            addCriterion("FILE4 like", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4NotLike(String value) {
            addCriterion("FILE4 not like", value, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4In(List<String> values) {
            addCriterion("FILE4 in", values, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4NotIn(List<String> values) {
            addCriterion("FILE4 not in", values, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4Between(String value1, String value2) {
            addCriterion("FILE4 between", value1, value2, "file4");
            return (Criteria) this;
        }

        public Criteria andFile4NotBetween(String value1, String value2) {
            addCriterion("FILE4 not between", value1, value2, "file4");
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