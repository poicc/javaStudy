package com.soft.study.java8.lambda;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-23 22:33
 **/
@FunctionalInterface
public interface IStudent {
//    void study(String technology);
//
//    static void play() {
//        System.out.println("这是函数式接口中的静态方法");
//    }
    /**
     * study方法
     *
     * @param technology 入参
     * @param time       入参
     */
    void study(String technology, int time);
}
