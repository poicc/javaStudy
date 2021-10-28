package com.soft.study.java;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-28 21:32
 **/
public class DateTest {
    public static void main(String[] args) {
        MyDate date0 = new MyDate();
        MyDate date1 = new MyDate(34355555133101L);

        System.out.println(date0.getYear() + "年" + date0.getMonth() + "月" + date0.getDay() + "日");
        System.out.println(date1.getYear() + "年" + date1.getMonth() + "月" + date1.getDay() + "日");
    }
}
