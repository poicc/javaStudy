package com.soft.study.collection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 22:56
 **/
public class Manager extends Employee {
    public Manager() {    }
    public Manager(String name, int age) {
        super(name, age);
    }
    @Override    public void work() {
        System.out.println("班主任管理班级");
    }
}
