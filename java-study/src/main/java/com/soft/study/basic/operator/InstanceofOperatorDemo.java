package com.soft.study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: Instanceof操作符
 * @author: crq
 * @create: 2021-09-28 23:33
 **/
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(result));
    }
    
    static class Animal {}
    static class Cat extends Animal{}
}
