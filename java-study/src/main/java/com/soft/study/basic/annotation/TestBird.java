package com.soft.study.basic.annotation;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-10 21:06
 **/
public class TestBird {
    public static void main(String[] args) {
        Bird bird = BirdNest.Sparrow.reproduce();
        Desc.Color color = bird.getColor();
        System.out.println("Bird's color is :" + color);
    }
}
