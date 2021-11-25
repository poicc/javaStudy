package com.soft.study.java8.function;

/**
 * @description: 带泛型的方法型函数
 * @author: crq
 * @create: 2021-11-25 14:58
 **/
@FunctionalInterface
public interface LogFunction2<T extends Pupil> {
    /**
     * 带泛型的方法型函数
     *
     * @param t 泛型
     */
    void log(T t);
}
