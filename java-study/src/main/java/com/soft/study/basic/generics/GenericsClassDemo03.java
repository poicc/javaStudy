package com.soft.study.basic.generics;

/**
 * @description: 泛型类的类型嵌套
 * @author: crq
 * @create: 2021-11-06 00:22
 **/
public class GenericsClassDemo03 {
    public static void main(String[] args) {
        Info<String> info = new Info("Hello");
        MyMap<Integer, Info<String>> map = new MyMap<>(1, info);
        System.out.println(map);
    }
}
