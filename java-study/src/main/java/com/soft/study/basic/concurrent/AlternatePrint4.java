package com.soft.study.basic.concurrent;

import java.util.concurrent.SynchronousQueue;

/**
 * @description: 交替打印 A1B2C3D4 —— SynchronousQueue方式
 * @author: crq
 * @create: 2021-11-28 20:18
 **/
public class AlternatePrint4 {
    public static void main(String[] args) throws InterruptedException {
        final char[] nums = "1234567".toCharArray();
        final char[] alphabets = "ABCDEFG".toCharArray();
        SynchronousQueue<Character> numQueue = new SynchronousQueue<>();
        SynchronousQueue<Character> alphabetQueue = new SynchronousQueue<>();

        //打印字母
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < nums.length; i++) {
                try {
                    System.out.print(alphabetQueue.take());
                    numQueue.put(nums[i]);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }

            }
        });

        //打印数字
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < alphabets.length; i++) {
                try {
                    alphabetQueue.put(alphabets[i]);
                    System.out.print(numQueue.take());
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(10000);
    }
}
