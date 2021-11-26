package com.soft.study.collection;

import com.soft.study.basic.reflect.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 10:12
 **/
public class ListTestParam {
    public static void main(String[] args) {
//        test01();
        test03();
    }
    private static <T> void test01() {
        List<T> list = new ArrayList<>();
        User user = new User("aaa", 20);
        list.add((T) user);
        list.add((T) "222");
        System.out.println(list);
    }

    private static <T> void test03() {
        List<T> list = new ArrayList<>();
        User user = new User("aaa", 20);
        list.add((T) user);
        list.add((T) "222");
        test04(list);
//        test04(list,user);
    }

    private static <T> void test04(List<T> list) {
        System.out.println(list);
        User user = new User("aaa", 20);
        list.remove(user);
        System.out.println(list);
    }

    private static <T> void test04(List<T> list, User user) {
        System.out.println(list);
        list.remove(user);
        System.out.println(list);
    }
}
