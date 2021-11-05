package com.soft.study.basic.generics;

/**
 * @description: 泛型方法
 * @author: crq
 * @create: 2021-11-06 00:26
 **/
public class GenericsMethodDemo01 {
    public static <T> void printClass(T obj) {
        System.out.println(obj.getClass().toString());
    }
    public static void main(String[] args) {
        printClass("abc");
        printClass(10);
    }
}
