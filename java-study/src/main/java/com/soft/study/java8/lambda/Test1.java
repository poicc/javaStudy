package com.soft.study.java8.lambda;

import java.util.function.Consumer;

/**
 * @description: Consumer消费性接口测试
 * @author: crq
 * @create: 2021-11-23 19:50
 **/
public class Test1 {
    public static void main(String[] args) {
        consumerTest();
    }

    /**
     * 有一个参数，并且无返回值
     */
    public static void consumerTest() {
        //这个e就代表所实现的接口的方法的参数，
        Consumer<String> consumer = e -> System.out.println("Lambda 表达式方式，" + e);
        consumer.accept("传入参数");
    }
}
