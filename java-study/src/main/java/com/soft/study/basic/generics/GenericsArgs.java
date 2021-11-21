package com.soft.study.basic.generics;

/**
 * @description: 泛型方法与可变参数
 * @author: crq
 * @create: 2021-11-21 16:55
 **/
public class GenericsArgs {
    /**
     * 静态方法中使用泛型，必须要将泛型定义在方法上。
     *
     * @param args 可变长参数,类型为泛型
     * @param <T>  返回范型
     */
    public static <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println("泛型测试，it is " + t);
        }
    }

    public static void main(String[] args) {
        printMsg("1111", 2222, "Java", "0.00", 55.55);
    }
}
