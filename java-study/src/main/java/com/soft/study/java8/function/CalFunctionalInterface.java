package com.soft.study.java8.function;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 14:45
 **/
@FunctionalInterface
public interface CalFunctionalInterface<T, R> {
    /**
     * 计算
     *
     * @param t1 入参1
     * @param t2 入参2
     * @return R
     */
    R cal(T t1, T t2);
}