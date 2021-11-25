package com.soft.study.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 14:31
 **/
public class ConsumerTest {
    public static void main(String[] args) {
//        testConsumer();
        testConsumer2();
    }

    private static void testConsumer() {
        String[] arr = {"张三:18", "李四:25", "王五:28"};
        test1(arr, con -> {
            System.out.print("姓名：" + con.split(":")[0] + "，");
        }, con -> {
            System.out.println("年龄：" + con.split(":")[1]);
        });
    }

    private static void test1(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        for (String s : arr) {
            consumer1.andThen(consumer2).accept(s);
        }
    }

    private static void testConsumer2() {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Effective Java", 110));
        list.add(new Book("Effective C++", 88));
        list.add(new Book("Effective C#", 59));
        list.forEach(x -> {
            if (x.getBookName().contains("Java")) {
                x.setBookPrice(x.getBookPrice() / 2);
            }
        });
        list.forEach(System.out::println);
    }
}
