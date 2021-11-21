package com.soft.study.basic.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @description: String、StringBuilder和StringBuffer
 * @author: crq
 * @create: 2021-11-21 15:27
 **/
public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
        test05();
    }

    private static void test01() {
        String str = "松山院,";
        String ret = "";
        System.out.println("+字符串拼接开始...");
        long start = System.currentTimeMillis();
        // + 在循环中的效率太低，用10万条测试吧
        for (int i = 0; i < 100000; i++) {
            ret += str;
        }
        long end = System.currentTimeMillis();
        System.out.println("+号拼接10万条数据耗时：" + (end - start) + "ms");
        System.out.println("************");
    }

    private static void test02() {
        String str = "松山院,";
        StringBuilder builder = new StringBuilder();
        System.out.println("StringBuilder,字符串拼接开始...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            builder.append(str);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接1000万条数据耗时：" + (end - start) + "ms");
        System.out.println("************");
    }

    private static void test03() {
        String str = "松山院,";
        StringBuffer buffer = new StringBuffer();
        System.out.println("StringBuffer,字符串拼接开始...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            buffer.append(str);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer拼接1000万条数据耗时：" + (end - start) + "ms");
        System.out.println("************");
    }

    /**
     * StringJoiner的效率明显高于List + StringJoiner
     */
    private static void test04() {
        String str = "松山院";
        StringJoiner join = new StringJoiner(",");
        System.out.println("StringJoiner,字符串拼接开始...");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            join.add(str);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringJoiner拼接1000万条数据耗时：" + (end - start) + "ms");
        System.out.println("************");
    }

    private static void test05() {
        String str = "松山院";
        List<String> list = new ArrayList<String>();
        System.out.println("List + StringJoiner,字符串拼接开始...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(str);
        }
        String ret = String.join(",", list);
        long end = System.currentTimeMillis();
        //563ms,477ms,585ms
        System.out.println("List + StringJoiner拼接1000万条数据耗时：" + (end - start) + "ms");
        System.out.println("************");
    }
}
