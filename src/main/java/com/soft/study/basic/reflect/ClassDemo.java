package com.soft.study.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: JAVA反射之Class类的练习
 * 在面向对象的语言里 万事万物皆对象 那么类是谁的对象呢
 * 类的类型是Class
 * 反射机制 欲获取一个类或调用某个类的方法 首先要获取到该类的CLASS对象
 * @author: crq
 * @create: 2021-10-06 21:30
 **/
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        //在 Java API中 提供了获取Class类对象的三种方法
        //第一种 使用Class.forName静态方法 前提：已明确类是全路径名
        Class clazz1 = null;
        try {
            clazz1 = Class.forName("com.soft.study.basic.reflect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种 使用.class方法 仅适合在编译前就已经明确要操作的Class
        Class clazz2 = User.class;

        //第三种 使用类对象的getClass()方法 适合有对象实例的情况下
        User user = new User();
        Class clazz3 = user.getClass();

        log.info("clazz1-clazz2-clazz-3:{},{},{}",clazz1,clazz2,clazz3);
        log.info(String.valueOf(clazz1 == clazz2));
        log.info(String.valueOf(clazz3 == clazz2));


    }
}
