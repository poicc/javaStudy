package com.soft.study.java8.function;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 14:48
 **/
public interface ConvertFunctionInterface<T, R> {
    /**
     * 类型转换
     *
     * @param t t
     * @return R
     */
    R convert(T t);
}
