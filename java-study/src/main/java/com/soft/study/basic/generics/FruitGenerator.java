package com.soft.study.basic.generics;

import java.util.Random;

/**
 * @description: 当实现泛型接口的类，传入了String类型作为泛型的实际参数
 * @author: crq
 * @create: 2021-11-21 16:40
 **/
public class FruitGenerator implements Generator<String> {
    String[] fruits = new String[]{"apple", "banana", "pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }

    public static void main(String[] args) {
        FruitGenerator fg = new FruitGenerator();
        System.out.println(fg.next());
    }
}
