package com.soft.study.collection;

import java.util.Properties;
import java.util.Set;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 00:31
 **/
public class PropDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //存储键值对
        properties.setProperty("host", "localhost");
        properties.setProperty("port", "3306");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123123");
        System.out.println(properties);
        //获取k2键对应的值
        String value = properties.getProperty("k2");
        System.out.println(value);
        //所有的键存储到Set集合
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "==" + properties.getProperty(key));
        }
    }
}
