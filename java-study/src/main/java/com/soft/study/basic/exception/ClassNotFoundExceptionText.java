package com.soft.study.basic.exception;

/**
 * @description: ClassNotFoundException发生场景练习
 * @author: crq
 * @create: 2021-11-20 14:21
 **/
public class ClassNotFoundExceptionText {
    public static void main(String[] args) {
        try {
            Class.forName("test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
