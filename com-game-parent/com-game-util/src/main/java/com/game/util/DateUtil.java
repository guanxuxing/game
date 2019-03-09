package com.game.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DateUtil {

    public final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    public final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
    public final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
    public final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final static Integer ADD_DATE = 1;

    /**
     * 获取YYYY格式
     * @return
     */
    public static String getYear() {
        return sdfYear.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD格式
     * @return
     */
    public static String getDay() {
        return sdfDay.format(new Date());
    }

    /**
     * 获取YYYYMMDD格式
     * @return
     */
    public static String getDays() {
        return sdfDays.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     * @return
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }

    public static Long timeToLong(String dateStr) throws Exception{
        return sdfDay.parse(dateStr).getTime();
    }

    public static Integer differentDaysByMillisecond(String callStartTime, String callEndTime){
        try {
            Date callStartDate = sdfDay.parse(callStartTime);
            Date callEndDate = sdfDay.parse(callEndTime);
            return Math.abs((int) ((callEndDate.getTime() - callStartDate.getTime()) / (1000*3600*24)));
        } catch (ParseException e) {
            log.error("date.util.differentDaysByMillisecond.error", e);
        }
        return null;
    }

    /***
     * 给出一个时间得到六个月(前后)的时间点(预计)
     * 查询三天以内的信息(实际业务需求)
     * @param currentDateStr
     * @return
     */
    public static String getHalfDate(String currentDateStr, Integer intTime){
        try {
            SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            Date currentDate = sdfDay.parse(currentDateStr);
            calendar.setTime(currentDate);
            calendar.add(Calendar.DATE, intTime);
            return sdfDay.format(new Date(calendar.getTimeInMillis()));
        } catch (Exception e) {
            log.error("get.call.half.time.error", e);
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(differentDaysByMillisecond("2017-10-31","2017-11-02"));
    }

    /***
     * 判断两个时间点相差几个月
     * @param callStartTime
     * @param callEndTime
     * @return
     */
    public static Integer getDateDel(String callStartTime, String callEndTime){
        try {
            Calendar bef = Calendar.getInstance();
            Calendar aft = Calendar.getInstance();
            bef.setTime(sdfDay.parse(callStartTime));
            aft.setTime(sdfDay.parse(callEndTime));
            int result = (aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH)) *29;
            int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
            int days = aft.get(Calendar.DATE) - bef.get(Calendar.DATE);
            /*if (days>=0){
                return Math.abs(month + result +days);
            }
            return Math.abs(month + result)+1;*/
            return Math.abs(month + result +days);
        } catch (ParseException e) {
            log.error("get.start.end.del.time.error" ,e);
        }
        return null;
    }

    public static String DateAdd(String date, Integer difDate) throws Exception {
        Date dateStr = sdfDay.parse(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateStr);
        calendar.add(Calendar.DATE, difDate);
        Date resultDate = calendar.getTime();
        return sdfDay.format(resultDate);
    }



}
