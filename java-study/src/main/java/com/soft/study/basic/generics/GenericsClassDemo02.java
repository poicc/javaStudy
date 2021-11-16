package com.soft.study.basic.generics;

/**
 * @description: 多个类型参数的泛型类
 * @author: crq
 * @create: 2021-11-06 00:21
 **/
public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(1, "one");
        System.out.println(map);
    }
}
