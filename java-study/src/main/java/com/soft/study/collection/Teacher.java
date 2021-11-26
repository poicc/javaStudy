package com.soft.study.collection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 22:56
 **/
public class Teacher extends Employee {
    public Teacher() {    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override    public void work() {
        System.out.println("老师在上课");
    }
}
