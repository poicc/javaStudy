package com.soft.study.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 利用反射解决泛型问题
 * @author: crq
 * @create: 2021-11-09 23:54
 **/
@Slf4j
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        //list.add(29)不是String会报错

        //利用反射解决泛型问题
        Class<?> clazz = list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, 28);
        log.info("反射太强大了:{}", list);
    }
}
