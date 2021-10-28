package com.soft.study.java;

import java.util.GregorianCalendar;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-28 14:50
 **/
public class MyDate {
    private Integer year;
    private Integer month;
    private Integer day;


    public MyDate() {
        GregorianCalendar gc = new GregorianCalendar();
        this.year = gc.get(GregorianCalendar.YEAR);
        this.day = gc.get(GregorianCalendar.MONTH);
        this.month = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(elapsedTime);
        this.year = gc.get(GregorianCalendar.YEAR);
        this.day = gc.get(GregorianCalendar.MONTH);
        this.month = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(elapsedTime + toCalender(year, month, day));
        this.year = gc.get(GregorianCalendar.YEAR);
        this.day = gc.get(GregorianCalendar.MONTH);
        this.month = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public long toCalender(int year, int month, int day) {
        day += year * 365;
        switch (month) {
            case 11:
                day += 31;
            case 10:
                day += 30;
            case 9:
                day += 31;
            case 8:
                day += 30;
            case 7:
                day += 31;
            case 6:
                day += 31;
            case 5:
                day += 30;
            case 4:
                day += 31;
            case 3:
                day += 30;
            case 2:
                day += 31;
            case 1:
                day += 28;
        }
        return (long) day * 24 * 60 * 60 * 1000;

    }

    @Override
    public String toString() {
        return "MyDate{" +
                year +
                "年" + month +
                "月" + day + "日" +
                '}';
    }

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }
}
