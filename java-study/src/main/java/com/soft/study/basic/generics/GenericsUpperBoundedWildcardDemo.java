package com.soft.study.basic.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 上界通配符
 * @author: crq
 * @create: 2021-11-06 00:31
 **/
public class GenericsUpperBoundedWildcardDemo {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));
    }
}
