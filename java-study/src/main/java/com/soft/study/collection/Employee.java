package com.soft.study.collection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 22:56
 **/
public abstract class Employee {
    private String name;
    private int age;
    public Employee() {
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }
}
