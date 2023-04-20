package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);


    /**
     * 获取给定日期的前一天时间
     *
     * @param date
     * @return
     */
    public static Date getBeforeDate(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).minusDays(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的前二天时间
     *
     * @param date
     * @return
     */
    public static Date getBeforeDate(Date date, int n) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).minusDays(n);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的后一天时间
     *
     * @param date
     * @return
     */
    public static Date getAfterDate(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusDays(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    public static Date getDateAfterDay(Date date, Integer days) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusDays(days);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的后2天时间
     *
     * @param date
     * @return
     */
    public static Date getAfterAfterDate(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusDays(2);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的上一周的同一天时间
     *
     * @param date
     * @return
     */
    public static Date getBeforeWeek(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).minusWeeks(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的下一周的同一天时间
     *
     * @param date
     * @return
     */
    public static Date getAfterWeek(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusWeeks(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的周一
     *
     * @param date
     * @return
     */
    public static Date getMondayOfWeek(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(DayOfWeek.MONDAY);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的周日
     *
     * @param date
     * @return
     */
    public static Date getSundayOfWeek(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(DayOfWeek.SUNDAY);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期上个月的同一天
     *
     * @param date
     * @return
     */
    public static Date getBeforeMonth(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).minusMonths(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期去年的同一天
     *
     * @param date
     * @return
     */
    public static Date getBeforeYear(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).minusMonths(12);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /**
     * 获取给定日期的下个月的同一天
     *
     * @param date
     * @return
     */
    public static Date getAfterMonth(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).plusMonths(1);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }


    /**
     * 获取给定日期的所在月的第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfMonth(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(TemporalAdjusters.firstDayOfMonth());
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }


    /**
     * 获取给定日期的所在月的最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(TemporalAdjusters.lastDayOfMonth());
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }


    /**
     * 给定日期转指定格式字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateToFormatString(Date date, String format) {
        if (date != null) {
            try {
                return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(format));
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
        return null;
    }

    /**
     * 给定字符串转指定日期
     *
     * @param dateStr
     * @param format
     * @return
     */
    public static Date stringToFormatDate(String dateStr, String format) {
        if (dateStr != null) {
            SimpleDateFormat sDateFormat = new SimpleDateFormat(format);
            Date date = null;
            try {
                date = sDateFormat.parse(dateStr);
            } catch (ParseException px) {
                px.printStackTrace();
            }
            return date;
        }
        return null;
    }


    /**
     * 获取给定时间的年份
     *
     * @param date
     * @return
     */
    public static Integer getDateYear(Date date) {
        if (date != null) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getYear();
        }
        return null;
    }

    /**
     * 获取给定时间的月份
     *
     * @param date
     * @return
     */
    public static Integer getDateMonth(Date date) {
        if (date != null) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getMonthValue();
        }
        return null;
    }

    /**
     * 获取给定时间的月份 共两位，位数不足补零
     *
     * @param date
     * @return
     */
    public static String getDateMonthString(Date date) {
        if (date != null) {
            return String.format("%02d", LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getMonthValue());
        }
        return null;
    }

    /**
     * 获取给定时间的日期 共两位，位数不足补零
     *
     * @param date
     * @return
     */
    public static String getDateDayString(Date date) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int day = calendar.get(Calendar.DATE);
            return String.format("%02d", day);
        }
        return null;
    }

    /**
     * 获取给定时间的周的第几天
     *
     * @param date
     * @return
     */
    public static Integer getDayOfWeekByDate(Date date) {
        if (date != null) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfWeek().getValue();
        }
        return null;
    }

    /**
     * 获取给定时间的月的第几天
     *
     * @param date
     * @return
     */
    public static Integer getDayOfMonthByDate(Date date) {
        if (date != null) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfMonth();
        }
        return null;
    }

    /**
     * 获取给定时间的月的第几天 共两位，位数不足补零
     *
     * @param date
     * @return
     */
    public static String getDateString(Date date) {
        if (date != null) {
            return String.format("%02d", getDayOfMonthByDate(date));
        }
        return null;
    }

    /**
     * 获取给定时间年的第几天
     *
     * @param date
     * @return
     */
    public static Integer getDayOfYearByDate(Date date) {
        if (date != null) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfYear();
        }
        return null;
    }


    /**
     * 获取下一年的今天的时间戳
     *
     * @return
     */
    public static Date getLastYearDate() {
        Calendar curr = Calendar.getInstance();
        curr.set(Calendar.YEAR, curr.get(Calendar.YEAR) + 1);
        return curr.getTime();
    }

    public static Date getDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date str2date = formatter.parse(date, pos);
        return str2date;
    }

    /**
     * 获取指定时间的当天起始时间
     *
     * @param date
     * @return
     */
    public static Date getDayStartTime(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取指定时间的当天终止时间
     *
     * @param date
     * @return
     */
    public static Date getDayEndTime(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    /**
     * 获取指定时间的当天起始时间
     *
     * @param date
     * @return
     */
    public static Date getDayEndTime2(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }


    /**
     * 获取当前时间的前多少分钟
     */
    public static Date getBeforeMinutes(int n) {
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, -n);// 3分钟之前的时间
        Date beforeD = beforeTime.getTime();

        return beforeD;
    }

    /**
     * 获取当前日期到第二天0点的秒数
     *
     * @return
     */
    public static Long getSecondsNextEarlyMorning() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return (cal.getTimeInMillis() - System.currentTimeMillis()) / 1000;
    }



    /***
     * 取得季度  包含年份
     * @param date
     * @return
     */
    public static String getQuarter(Date date) {
        int season = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        int year = c.get(Calendar.YEAR);
        return "" + year + "0" + season;
    }

    public static Date getFirstDayOfYear(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(TemporalAdjusters.firstDayOfYear());
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    public static Date getLastDayOfYear(Date date) {
        if (date != null) {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(TemporalAdjusters.lastDayOfYear());
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    /***
     * 获取季度的第一天
     * @param date
     * @return
     */
    public static Date getFirstDayOfQuarter(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        int month = localDateTime.getMonth().getValue();//当月
        int start = 0;
        if (month >= 1 && month <= 3) {//第一季度
            start = 1;
        } else if (month >= 4 && month <= 6) {//第二季度
            start = 4;
        } else if (month >= 7 && month <= 9) {//第三季度
            start = 7;
        } else if ((month >= 10 && month <= 12)) {//第四季度
            start = 10;
        }
        LocalDateTime localDateTime2 = localDateTime.plusMonths(start - month).with(TemporalAdjusters.firstDayOfMonth());
        return Date.from(localDateTime2.atZone(ZoneId.systemDefault()).toInstant());
    }

    /***
     * 获取季度的最后一天
     * @param date
     * @return
     */
    public static Date getLastDayOfQuarter(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        int month = localDateTime.getMonth().getValue();//当月
        int start = 0;
        if (month >= 1 && month <= 3) {//第一季度
            start = 3;
        } else if (month >= 4 && month <= 6) {//第二季度
            start = 6;
        } else if (month >= 7 && month <= 9) {//第三季度
            start = 9;
        } else if ((month >= 10 && month <= 12)) {//第四季度
            start = 12;
        }
        LocalDateTime localDateTime2 = localDateTime.plusMonths(start - month).with(TemporalAdjusters.lastDayOfMonth());
        return Date.from(localDateTime2.atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获取当前时间属于星期几
     * <p>
     * 每日一袋业务使用
     * ---by anpeiyong 2019-12-11
     * <p>
     * 1：星期一、2：星期二、3:星期三、4：星期四、5：星期五、6：星期六、7：星期日
     *
     * @param date
     * @return
     */
    public static int getCurrentTimeBelongToWhichWeek(Date date) {
        int[] weekDays = {7, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    /**
     * 获取当前时间的后多少秒
     */
    public static Date getAfterSeconds(int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, seconds);
        return calendar.getTime();
    }

    public static Date getDateByDateTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 将时分秒,毫秒域清零
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getWeekLastDayByFormat(String yearAndWeek) {
        try {
            int year = Integer.valueOf(yearAndWeek.substring(0, 4));
            String weekStr = yearAndWeek.substring(4);
            int week = weekStr.startsWith("0") ? Integer.valueOf(weekStr.substring(1)) : Integer.valueOf(weekStr);
            Calendar cal = Calendar.getInstance();
            cal.setFirstDayOfWeek(Calendar.SUNDAY);
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.WEEK_OF_YEAR, week);
            cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
            cal.add(Calendar.DAY_OF_WEEK, 6);
            Date lastTime = cal.getTime();
            return lastTime;
        } catch (Exception e) {
            return null;
        }

    }

    public static Date getMonthLastDayByFormat(String yearAndMonth) {
        try {
            Date date = stringToFormatDate(yearAndMonth, "yyyyMM");
            return getLastDayOfMonth(date);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date getQuarterLastDayByFormat(String yearAndQuearter) {
        try {
            String year = yearAndQuearter.substring(0, 4);
            String quarterStr = yearAndQuearter.substring(4);
            int quarter = quarterStr.startsWith("0") ? Integer.valueOf(quarterStr.substring(1)) : Integer.valueOf(quarterStr);
            if (quarter == 1) {
                return getMonthLastDayByFormat(year + "03");
            } else if (quarter == 2) {
                return getMonthLastDayByFormat(year + "06");
            } else if (quarter == 3) {
                return getMonthLastDayByFormat(year + "09");
            } else if (quarter == 4) {
                return getMonthLastDayByFormat(year + "12");
            }
        } catch (Exception e) {

        }
        return null;
    }

    public static Date getYearLastDayByFormat(String year) {
        try {
            return getLastDayOfYear(stringToFormatDate(year, "yyyy"));
        } catch (Exception e) {
            return null;
        }

    }

    private static Calendar getCalendar(Date date, int weekStart) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setMinimalDaysInFirstWeek(1);
        if (weekStart == 7) {
            calendar.setFirstDayOfWeek(Calendar.SUNDAY);//星期天为第一天
        } else {
            calendar.setFirstDayOfWeek(weekStart + 1);//星期一到星期五
        }
        return calendar;
    }

    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        smdate = sdf.parse(sdf.format(smdate));

        bdate = sdf.parse(sdf.format(bdate));

        Calendar cal = Calendar.getInstance();

        cal.setTime(smdate);

        long time1 = cal.getTimeInMillis();

        cal.setTime(bdate);

        long time2 = cal.getTimeInMillis();

        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));

    }

    /**
     * 获取指定时间的当月的天数
     *
     * @param date
     * @return
     */
    public static int getDaysOfMonth(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 1);
        calendar.roll(Calendar.DATE, -1);
        return calendar.get(Calendar.DATE);
    }

    /***
     * 获取最近的天
     * @param dayCount
     * @return
     */
    public static List<String> getLastDayList(int dayCount) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -dayCount);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < dayCount; i++) {
            list.add(sdf.format(cal.getTime()));
            cal.add(Calendar.DAY_OF_YEAR, 1);
        }
        return list;
    }

    /***
     * 获取最近的月
     * @param dayCount
     * @return
     */
    public static List<String> getLastMonthList(int dayCount) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -dayCount);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < dayCount; i++) {
            list.add(sdf.format(cal.getTime()));
            cal.add(Calendar.MONTH, 1);
        }
        return list;
    }


    /**
     * 根据第几周的获取时间
     *
     * @param year      年份
     * @param weekNum   第几周
     * @param weekStart 从周几开始算一周
     * @param dayNum    周的第几天
     * @return
     */
    public static Date getDateByWeekNum(int year, int weekNum, int weekStart, int dayNum) {
        Calendar cal = Calendar.getInstance();
        // 保证是0点0分0秒
        cal.setTimeInMillis(-28800000);
        cal.set(Calendar.YEAR, year);
        if (weekStart == 7) {
            cal.setFirstDayOfWeek(Calendar.SUNDAY);//星期天为第一天
        } else {
            cal.setFirstDayOfWeek(weekStart + 1);//星期一到星期五
        }
        cal.set(Calendar.WEEK_OF_YEAR, weekNum);
        int weekDay = cal.getFirstDayOfWeek() + dayNum - 1;
        if (weekDay > 7) {
            weekDay = weekDay - 7;
        }
        cal.set(Calendar.DAY_OF_WEEK, weekDay);
        return cal.getTime();
    }

    public static Integer getMonthSecond() {
        Calendar c = Calendar.getInstance();
        int d = c.getActualMaximum(Calendar.DAY_OF_MONTH);//获得月底日期
        int nowDay = c.get(Calendar.DAY_OF_MONTH);//获得当前天
        Date nowdate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        String dateNowStr = sdf.format(nowdate);
        int now = Integer.parseInt(dateNowStr);//获得当前时分秒（去首零）
        return (d - nowDay) * 24 * 60 * 60 + 235959 - now;
    }

    /**
     * <p>Compares two <code>dates</code> for order.</p>
     *
     * <p>This method is more comprehensive than the standard Java equals operators.</p>
     * <ul>
     *  <li>It returns <code>true</code> if the first value's year and month is equal to the second.</li>
     *  <li>It returns <code>false</code> if the first value's year and month is not equal to the second.</li>
     * </ul>
     *
     * @param lhs  the first <code>Date</code>
     * @param rhs  the second <code>Date</code>
     * @return <code>false</code> if not equal to lhs
     *  <code>true</code> if equal to rhs
     */
    public static boolean compareYearAndMonth(Date lhs,Date rhs){
        if(Objects.isNull(lhs) || Objects.isNull(rhs)){
            return false;
        }
        ZonedDateTime lzonedDateTime = ZonedDateTime.ofInstant(lhs.toInstant(), ZoneId.systemDefault());
        ZonedDateTime hzonedDateTime = ZonedDateTime.ofInstant(rhs.toInstant(), ZoneId.systemDefault());
        if(lzonedDateTime.getYear() == hzonedDateTime.getYear() && lzonedDateTime.getMonthValue() == hzonedDateTime.getMonthValue()){
            return true;
        }
        return false;
    }
}



