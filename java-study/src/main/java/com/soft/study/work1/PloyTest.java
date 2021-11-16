package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class PloyTest {
    public static void main(String[] args) {
        Person person = new Person("lhl", 18);
        Employee employee = new Employee("lhl", 18, 1234, 10000);
        Manager manager = new Manager("yjl", 18, 3456, 12000, "teacher");
        System.out.println(person);
        System.out.println(employee);
        System.out.println(manager);

    }
}
