package com.soft.study.java8.lambda;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-24 18:21
 **/
public class Person {
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        this.name = "mike";
        System.out.println("创建了一个对象");
    }

    public Person(Integer x, String y) {
        this.id = x;
        this.name = y;
    }
}
