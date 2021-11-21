package com.soft.study.basic.generics;

/**
 * @description: 泛型接口
 * @author: crq
 * @create: 2021-11-21 16:40
 **/
public interface Generator<T> {
    /**
     * next方法生成类
     *
     * @return T
     */
    T next();
}
