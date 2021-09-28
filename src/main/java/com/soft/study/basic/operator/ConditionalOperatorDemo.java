package com.soft.study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 三目运算符
 * @author: crq
 * @create: 2021-09-28 23:26
 **/
@Slf4j
public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        log.info("b = " + b);

        b = (a == 10) ? 20 : 30;
        log.info("b = " + b);
    }
}
