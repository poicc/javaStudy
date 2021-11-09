package com.soft.study.basic.reflection;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @description: 通过反射获取配置问卷中的内容调用类的方法
 * @author: crq
 * @create: 2021-11-10 00:08
 **/
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("Class.txt"));

        String classname = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> clazz = Class.forName(classname);
        Method method = clazz.getMethod(methodName);
        method.invoke(clazz.getDeclaredConstructor().newInstance());
    }
}
