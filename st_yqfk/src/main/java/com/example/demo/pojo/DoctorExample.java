package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDnameIsNull() {
            addCriterion("DNAME is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("DNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("DNAME =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("DNAME <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("DNAME >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("DNAME >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("DNAME <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("DNAME <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("DNAME like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("DNAME not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("DNAME in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("DNAME not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("DNAME between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("DNAME not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDtextIsNull() {
            addCriterion("DTEXT is null");
            return (Criteria) this;
        }

        public Criteria andDtextIsNotNull() {
            addCriterion("DTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andDtextEqualTo(String value) {
            addCriterion("DTEXT =", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextNotEqualTo(String value) {
            addCriterion("DTEXT <>", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextGreaterThan(String value) {
            addCriterion("DTEXT >", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextGreaterThanOrEqualTo(String value) {
            addCriterion("DTEXT >=", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextLessThan(String value) {
            addCriterion("DTEXT <", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextLessThanOrEqualTo(String value) {
            addCriterion("DTEXT <=", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextLike(String value) {
            addCriterion("DTEXT like", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextNotLike(String value) {
            addCriterion("DTEXT not like", value, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextIn(List<String> values) {
            addCriterion("DTEXT in", values, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextNotIn(List<String> values) {
            addCriterion("DTEXT not in", values, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextBetween(String value1, String value2) {
            addCriterion("DTEXT between", value1, value2, "dtext");
            return (Criteria) this;
        }

        public Criteria andDtextNotBetween(String value1, String value2) {
            addCriterion("DTEXT not between", value1, value2, "dtext");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("DSEX is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("DSEX is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(String value) {
            addCriterion("DSEX =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(String value) {
            addCriterion("DSEX <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(String value) {
            addCriterion("DSEX >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(String value) {
            addCriterion("DSEX >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(String value) {
            addCriterion("DSEX <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(String value) {
            addCriterion("DSEX <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLike(String value) {
            addCriterion("DSEX like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotLike(String value) {
            addCriterion("DSEX not like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<String> values) {
            addCriterion("DSEX in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<String> values) {
            addCriterion("DSEX not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(String value1, String value2) {
            addCriterion("DSEX between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(String value1, String value2) {
            addCriterion("DSEX not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDcardIsNull() {
            addCriterion("DCARD is null");
            return (Criteria) this;
        }

        public Criteria andDcardIsNotNull() {
            addCriterion("DCARD is not null");
            return (Criteria) this;
        }

        public Criteria andDcardEqualTo(String value) {
            addCriterion("DCARD =", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardNotEqualTo(String value) {
            addCriterion("DCARD <>", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardGreaterThan(String value) {
            addCriterion("DCARD >", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardGreaterThanOrEqualTo(String value) {
            addCriterion("DCARD >=", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardLessThan(String value) {
            addCriterion("DCARD <", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardLessThanOrEqualTo(String value) {
            addCriterion("DCARD <=", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardLike(String value) {
            addCriterion("DCARD like", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardNotLike(String value) {
            addCriterion("DCARD not like", value, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardIn(List<String> values) {
            addCriterion("DCARD in", values, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardNotIn(List<String> values) {
            addCriterion("DCARD not in", values, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardBetween(String value1, String value2) {
            addCriterion("DCARD between", value1, value2, "dcard");
            return (Criteria) this;
        }

        public Criteria andDcardNotBetween(String value1, String value2) {
            addCriterion("DCARD not between", value1, value2, "dcard");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNull() {
            addCriterion("DPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDphoneIsNotNull() {
            addCriterion("DPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDphoneEqualTo(String value) {
            addCriterion("DPHONE =", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotEqualTo(String value) {
            addCriterion("DPHONE <>", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThan(String value) {
            addCriterion("DPHONE >", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DPHONE >=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThan(String value) {
            addCriterion("DPHONE <", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLessThanOrEqualTo(String value) {
            addCriterion("DPHONE <=", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneLike(String value) {
            addCriterion("DPHONE like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotLike(String value) {
            addCriterion("DPHONE not like", value, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneIn(List<String> values) {
            addCriterion("DPHONE in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotIn(List<String> values) {
            addCriterion("DPHONE not in", values, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneBetween(String value1, String value2) {
            addCriterion("DPHONE between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDphoneNotBetween(String value1, String value2) {
            addCriterion("DPHONE not between", value1, value2, "dphone");
            return (Criteria) this;
        }

        public Criteria andDlocationIsNull() {
            addCriterion("DLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andDlocationIsNotNull() {
            addCriterion("DLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andDlocationEqualTo(String value) {
            addCriterion("DLOCATION =", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotEqualTo(String value) {
            addCriterion("DLOCATION <>", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationGreaterThan(String value) {
            addCriterion("DLOCATION >", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationGreaterThanOrEqualTo(String value) {
            addCriterion("DLOCATION >=", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLessThan(String value) {
            addCriterion("DLOCATION <", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLessThanOrEqualTo(String value) {
            addCriterion("DLOCATION <=", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationLike(String value) {
            addCriterion("DLOCATION like", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotLike(String value) {
            addCriterion("DLOCATION not like", value, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationIn(List<String> values) {
            addCriterion("DLOCATION in", values, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotIn(List<String> values) {
            addCriterion("DLOCATION not in", values, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationBetween(String value1, String value2) {
            addCriterion("DLOCATION between", value1, value2, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDlocationNotBetween(String value1, String value2) {
            addCriterion("DLOCATION not between", value1, value2, "dlocation");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNull() {
            addCriterion("DADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIsNotNull() {
            addCriterion("DADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressEqualTo(String value) {
            addCriterion("DADDRESS =", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotEqualTo(String value) {
            addCriterion("DADDRESS <>", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThan(String value) {
            addCriterion("DADDRESS >", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DADDRESS >=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThan(String value) {
            addCriterion("DADDRESS <", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLessThanOrEqualTo(String value) {
            addCriterion("DADDRESS <=", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressLike(String value) {
            addCriterion("DADDRESS like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotLike(String value) {
            addCriterion("DADDRESS not like", value, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressIn(List<String> values) {
            addCriterion("DADDRESS in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotIn(List<String> values) {
            addCriterion("DADDRESS not in", values, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressBetween(String value1, String value2) {
            addCriterion("DADDRESS between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andDaddressNotBetween(String value1, String value2) {
            addCriterion("DADDRESS not between", value1, value2, "daddress");
            return (Criteria) this;
        }

        public Criteria andTouchIsNull() {
            addCriterion("TOUCH is null");
            return (Criteria) this;
        }

        public Criteria andTouchIsNotNull() {
            addCriterion("TOUCH is not null");
            return (Criteria) this;
        }

        public Criteria andTouchEqualTo(String value) {
            addCriterion("TOUCH =", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchNotEqualTo(String value) {
            addCriterion("TOUCH <>", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchGreaterThan(String value) {
            addCriterion("TOUCH >", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchGreaterThanOrEqualTo(String value) {
            addCriterion("TOUCH >=", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchLessThan(String value) {
            addCriterion("TOUCH <", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchLessThanOrEqualTo(String value) {
            addCriterion("TOUCH <=", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchLike(String value) {
            addCriterion("TOUCH like", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchNotLike(String value) {
            addCriterion("TOUCH not like", value, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchIn(List<String> values) {
            addCriterion("TOUCH in", values, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchNotIn(List<String> values) {
            addCriterion("TOUCH not in", values, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchBetween(String value1, String value2) {
            addCriterion("TOUCH between", value1, value2, "touch");
            return (Criteria) this;
        }

        public Criteria andTouchNotBetween(String value1, String value2) {
            addCriterion("TOUCH not between", value1, value2, "touch");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("DIAGNOSIS is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("DIAGNOSIS is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("DIAGNOSIS =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("DIAGNOSIS <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("DIAGNOSIS >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("DIAGNOSIS <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSIS <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("DIAGNOSIS like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("DIAGNOSIS not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("DIAGNOSIS in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("DIAGNOSIS not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSIS not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceIsNull() {
            addCriterion("INFECTION_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceIsNotNull() {
            addCriterion("INFECTION_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceEqualTo(String value) {
            addCriterion("INFECTION_SOURCE =", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceNotEqualTo(String value) {
            addCriterion("INFECTION_SOURCE <>", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceGreaterThan(String value) {
            addCriterion("INFECTION_SOURCE >", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INFECTION_SOURCE >=", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceLessThan(String value) {
            addCriterion("INFECTION_SOURCE <", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceLessThanOrEqualTo(String value) {
            addCriterion("INFECTION_SOURCE <=", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceLike(String value) {
            addCriterion("INFECTION_SOURCE like", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceNotLike(String value) {
            addCriterion("INFECTION_SOURCE not like", value, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceIn(List<String> values) {
            addCriterion("INFECTION_SOURCE in", values, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceNotIn(List<String> values) {
            addCriterion("INFECTION_SOURCE not in", values, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceBetween(String value1, String value2) {
            addCriterion("INFECTION_SOURCE between", value1, value2, "infectionSource");
            return (Criteria) this;
        }

        public Criteria andInfectionSourceNotBetween(String value1, String value2) {
            addCriterion("INFECTION_SOURCE not between", value1, value2, "infectionSource");
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