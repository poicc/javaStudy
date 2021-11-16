package com.soft.study.basic.annotation;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-10 20:57
 **/
@FunctionalInterface
public interface GreetingService {
    /**
     * 抽象⽅法
     *
     * @param message ⼊参
     */
    void sayMessage(String message);
}