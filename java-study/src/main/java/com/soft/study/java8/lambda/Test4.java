package com.soft.study.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description: Predicate 断言式接口测试
 * @author: crq
 * @create: 2021-11-23 20:03
 **/
public class Test4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "Java", "lambda", "www", "ok", "Web");
        List<String> ret = filterStr(list, (str) -> str.length() > 2);
        System.out.println(ret);
    }

    public static List<String> filterStr(List<String> list, Predicate<String> pre) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
