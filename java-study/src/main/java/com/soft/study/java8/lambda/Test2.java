package com.soft.study.java8.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @description: Supplier供给型接口测试
 * @author: crq
 * @create: 2021-11-23 19:55
 **/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> res = getNumList(10, () -> (int) (Math.random() * 100));
        System.out.println(res);
    }

    public static ArrayList<Integer> getNumList(int num, Supplier<Integer> sup) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer e = sup.get();
            list.add(e);
        }
        return list;
    }
}
