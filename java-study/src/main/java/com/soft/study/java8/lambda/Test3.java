package com.soft.study.java8.lambda;

import java.util.function.Function;

/**
 * @description: Function 函数式接口测试
 * @author: crq
 * @create: 2021-11-23 19:59
 **/
public class Test3 {
    public static void main(String[] args) {
        String newStr = strHandler("abc", (str) -> str.toUpperCase());
        System.out.println(newStr);
        newStr = strHandler("  abc  ", (str) -> str.trim());
        System.out.println(newStr);
    }

    public static String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }
}
