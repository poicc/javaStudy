package com.soft.study.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

/**
 * @description: 数值溢出
 * @author: crq
 * @create: 2021-09-26 23:00
 **/
@Slf4j
public class ValueOverflow {
    public static void main(String[] args) {
        log.info("====================== wrong1 ======================");
        wrong();
        log.info("====================== right1 ======================");
        right1();
        log.info("====================== right2 ======================");
        right2();
    }


    private static void wrong() {
        long l = Long.MAX_VALUE;
        log.info(String.valueOf(l + 1));
        log.info(String.valueOf(l + 1 == Long.MIN_VALUE));
    }


    private static void right1() {
        try {
            long l = Long.MAX_VALUE;
            //math相加
            System.out.println(Math.addExact(l, 1));
        } catch (Exception ex) {
            log.error(ex.toString());
        }
    }

    private static void right2() {
        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        log.info(i.add(BigInteger.ONE).toString());
        try {
            //使用longValueExact()方法 如果超出了long型的范围，会抛出ArithmeticException
            long longValue = i.add(BigInteger.ONE).longValueExact();
            log.info(String.valueOf(longValue));
        } catch (Exception ex) {
            log.error(ex.toString());
        }
    }
}
