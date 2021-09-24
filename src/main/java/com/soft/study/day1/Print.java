package com.soft.study.day1;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * @description: 输出练习
 * @author: crq
 * @create: 2021-09-24 10:04
 **/
public class Print {
    public static void main(String[] args) {
        int radius;
        double area;

        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        area = PI * radius * radius;
        System.out.println("半径为"+radius+"面积为"+area);

    }
}
