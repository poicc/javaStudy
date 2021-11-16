package com.soft.study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 算术操作符
 * @author: crq
 * @create: 2021-09-28 23:00
 **/
@Slf4j
public class MathOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        log.info("a + b = " + (a + b));
        log.info("a - b = " + (a - b));
        log.info("a * b = " + (a * b));
        log.info("b / a = " + (b / a));
        log.info("b % a = " + (b % a));
        log.info("c % a = " + (c % a));
        log.info("a++ = " + (a++));
        log.info("a-- = " + (a--));

        //d++先赋值再加  ++d先加一再赋值
        log.info("d++ = " + (d++));
        log.info("++d = " + (++d));

    }
}
