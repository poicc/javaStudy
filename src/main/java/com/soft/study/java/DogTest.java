package com.soft.study.java;

import java.util.Scanner;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-29 10:21
 **/
public class DogTest {
    public static void main(String[] args) {
//        Master master = new Master("lg",100);
//        Dog dog = new Dog("QQ","Q仔",90,91);
//        Dog dog1 = new Dog("欢欢","拉布拉多",1,1);
//        Dog dog2 = new Dog("多多","藏獒",90,90);
//        Dog dog3 = new Dog();
//        dog3.setName("旺财");
//
//
//        master.feed(dog1);
//        System.out.println(dog1);

        Scanner scanner = new Scanner(System.in);
        Master master = new Master("lhl",1000);
        Penguin penguin = new Penguin("QQ","Q仔",90,91);

        //生成Dog对象和你定义一个基本类型的数据是一样的
        //自动去调用构造方法
        Dog dog1 = new Dog("欢欢","拉布拉多",90,90);

        Dog dog2 = new Dog("多多","藏獒",90,93);

        //自动调用无参构造方法
        Dog dog3 = new Dog();
        dog3.setName("旺财");

        System.out.println("请问你要领养什么宠物：1，狗，2，penguin");
        String typeId = scanner.nextLine();
        System.out.println(master.getPet(typeId));

        master.feed(dog1);
        System.out.println(dog1);
        master.feed(penguin);
        System.out.println(penguin);

        master.play(dog1);
        System.out.println(dog1);
    }
}
