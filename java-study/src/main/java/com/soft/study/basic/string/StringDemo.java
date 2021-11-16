package com.soft.study.basic.string;

import java.util.Scanner;

/**
 * @description: 字符串练习
 * @author: crq
 * @create: 2021-09-24 23:50
 **/
public class StringDemo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("给a赋个值");
        String a = s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("给b赋个值");
        String b = s2.nextLine();

        System.out.println("比较两个字符串（忽略大小写）" + a.equalsIgnoreCase(b));
        System.out.println("调用count 输出a b包含次数" + repetitions(a, b));

    }

    public static int repetitions(String c,String d){
        //统计次数
        int count = 0;
        //设开始的地址
        int fromIndex = 0;
        while ((fromIndex = c.indexOf(d,fromIndex)) != -1) {
            //子串第一次出现的位置+长度=下一次的起始位置
            fromIndex = fromIndex + d.length();
            count ++;
        }
        return count;
    }

}
