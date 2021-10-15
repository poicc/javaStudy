package com.soft.study.java;

/**
 * @description: 狗
 * @author: crq
 * @create: 2021-10-15 10:28
 **/
public class Dog {
    private String color;
    private int num;

    public Dog(String color, int num) {
        this.color = color;
        this.num = num;
    }

    public void dog1(){
        System.out.println("毛色:"+this.color+"\t数量:"+this.num);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("白色",1);
        dog.dog1();
    }

}
