package com.soft.study.collection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-27 23:45
 **/
public class PersonTest {
    public static void main(String[] args){
        Person person = new Person();
        int code = person.hashCode();
        System.out.println(code);
    }
}
