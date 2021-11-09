package com.soft.study.basic.reflection;

import com.soft.study.basic.reflect.User;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: 动态创建对象执行方法
 * @author: crq
 * @create: 2021-11-09 23:35
 **/
@Slf4j
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.soft.study.basic.reflect.User");
        //构造一个对象 本质是无参构造器
        User user1 = (User) clazz.getDeclaredConstructor().newInstance();
        log.info("user1:{}", user1);

        //通过构造器创建对象
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,Integer.class);
        User user2 = (User) constructor.newInstance("李四",1);
        log.info("user2:{}", user2);

        //通过反射调用普通方法
        User user3 = (User) clazz.getDeclaredConstructor().newInstance();
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        setName.invoke(user3, "张三丰");
        log.info("user3.name{}", user3.getName());

        //通过反射操作熟悉（私有也可以操作）
        User user4 = (User) clazz.getDeclaredConstructor().newInstance();
        Field name = clazz.getDeclaredField("name");
        //true:取消Java语言访问检查
        name.setAccessible(true);
        name.set(user4,"张无忌");
        log.info("user4.name{}",user4.getName());

    }
}
