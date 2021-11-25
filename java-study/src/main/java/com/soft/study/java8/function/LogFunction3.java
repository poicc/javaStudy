package com.soft.study.java8.function;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 15:03
 **/
@FunctionalInterface
public interface LogFunction3<T extends Pupil, R extends PupilTeacher> {
    /**
     * 带多个泛型的功能型函数
     *
     * @param t t
     * @return R
     */
    R build(T t);
}