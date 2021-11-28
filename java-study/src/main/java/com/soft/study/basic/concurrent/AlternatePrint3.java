package com.soft.study.basic.concurrent;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description: 交替打印 A1B2C3D4 —— BlockingQueue方式
 * @author: crq
 * @create: 2021-11-28 20:16
 **/
public class AlternatePrint3 {private static BlockingQueue<Character> numBlockingQueue = new ArrayBlockingQueue<>(1);
    private static BlockingQueue<Character> alphabetBlockingQueue = new ArrayBlockingQueue<>(1);
    private static char[] nums = "1234567".toCharArray();
    private static char[] alphabets = "ABCDEFG".toCharArray();

    public static void main(String[] args) throws InterruptedException, IOException {
        Thread t1, t2;
        alphabetBlockingQueue.add(alphabets[0]);

        t1 = new Thread(() -> {
            for (int i = 0; i < alphabets.length; i++) {
                try {
                    // 返回并删除队列头数据，如队列为空则阻塞等待
                    System.out.print(alphabetBlockingQueue.take());
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                numBlockingQueue.add(nums[i]);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < nums.length; i++) {
                try {
                    System.out.print(numBlockingQueue.take());
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                if (i < alphabets.length - 1) {
                    alphabetBlockingQueue.add(alphabets[i + 1]);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
