package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalExample() {
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

        public Criteria andHnameIsNull() {
            addCriterion("HNAME is null");
            return (Criteria) this;
        }

        public Criteria andHnameIsNotNull() {
            addCriterion("HNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHnameEqualTo(String value) {
            addCriterion("HNAME =", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotEqualTo(String value) {
            addCriterion("HNAME <>", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThan(String value) {
            addCriterion("HNAME >", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThanOrEqualTo(String value) {
            addCriterion("HNAME >=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThan(String value) {
            addCriterion("HNAME <", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThanOrEqualTo(String value) {
            addCriterion("HNAME <=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLike(String value) {
            addCriterion("HNAME like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotLike(String value) {
            addCriterion("HNAME not like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameIn(List<String> values) {
            addCriterion("HNAME in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotIn(List<String> values) {
            addCriterion("HNAME not in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameBetween(String value1, String value2) {
            addCriterion("HNAME between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotBetween(String value1, String value2) {
            addCriterion("HNAME not between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHlocationIsNull() {
            addCriterion("HLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andHlocationIsNotNull() {
            addCriterion("HLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andHlocationEqualTo(String value) {
            addCriterion("HLOCATION =", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationNotEqualTo(String value) {
            addCriterion("HLOCATION <>", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationGreaterThan(String value) {
            addCriterion("HLOCATION >", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationGreaterThanOrEqualTo(String value) {
            addCriterion("HLOCATION >=", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationLessThan(String value) {
            addCriterion("HLOCATION <", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationLessThanOrEqualTo(String value) {
            addCriterion("HLOCATION <=", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationLike(String value) {
            addCriterion("HLOCATION like", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationNotLike(String value) {
            addCriterion("HLOCATION not like", value, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationIn(List<String> values) {
            addCriterion("HLOCATION in", values, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationNotIn(List<String> values) {
            addCriterion("HLOCATION not in", values, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationBetween(String value1, String value2) {
            addCriterion("HLOCATION between", value1, value2, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHlocationNotBetween(String value1, String value2) {
            addCriterion("HLOCATION not between", value1, value2, "hlocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationIsNull() {
            addCriterion("HDETAILED_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationIsNotNull() {
            addCriterion("HDETAILED_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationEqualTo(String value) {
            addCriterion("HDETAILED_LOCATION =", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationNotEqualTo(String value) {
            addCriterion("HDETAILED_LOCATION <>", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationGreaterThan(String value) {
            addCriterion("HDETAILED_LOCATION >", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationGreaterThanOrEqualTo(String value) {
            addCriterion("HDETAILED_LOCATION >=", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationLessThan(String value) {
            addCriterion("HDETAILED_LOCATION <", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationLessThanOrEqualTo(String value) {
            addCriterion("HDETAILED_LOCATION <=", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationLike(String value) {
            addCriterion("HDETAILED_LOCATION like", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationNotLike(String value) {
            addCriterion("HDETAILED_LOCATION not like", value, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationIn(List<String> values) {
            addCriterion("HDETAILED_LOCATION in", values, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationNotIn(List<String> values) {
            addCriterion("HDETAILED_LOCATION not in", values, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationBetween(String value1, String value2) {
            addCriterion("HDETAILED_LOCATION between", value1, value2, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHdetailedLocationNotBetween(String value1, String value2) {
            addCriterion("HDETAILED_LOCATION not between", value1, value2, "hdetailedLocation");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNull() {
            addCriterion("HPHONE is null");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNotNull() {
            addCriterion("HPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHphoneEqualTo(String value) {
            addCriterion("HPHONE =", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotEqualTo(String value) {
            addCriterion("HPHONE <>", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThan(String value) {
            addCriterion("HPHONE >", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThanOrEqualTo(String value) {
            addCriterion("HPHONE >=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThan(String value) {
            addCriterion("HPHONE <", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThanOrEqualTo(String value) {
            addCriterion("HPHONE <=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLike(String value) {
            addCriterion("HPHONE like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotLike(String value) {
            addCriterion("HPHONE not like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneIn(List<String> values) {
            addCriterion("HPHONE in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotIn(List<String> values) {
            addCriterion("HPHONE not in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneBetween(String value1, String value2) {
            addCriterion("HPHONE between", value1, value2, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotBetween(String value1, String value2) {
            addCriterion("HPHONE not between", value1, value2, "hphone");
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