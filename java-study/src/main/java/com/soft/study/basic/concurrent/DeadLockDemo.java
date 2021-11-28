package com.soft.study.basic.concurrent;

/**
 * @description: 死锁示例
 * @author: crq
 * @create: 2021-11-28 15:39
 **/
public class DeadLockDemo {
    static Beer beer = new Beer();
    static Story story = new Story();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (beer) {
                System.out.println("我有酒，给我故事");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                synchronized (story) {
                    System.out.println("小王开始喝酒讲故事");
                }
            }
        }, "小王").start();

        new Thread(() -> {
            synchronized (story) {
                System.out.println("我有故事，给我酒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                synchronized (beer) {
                    System.out.println("老王开始喝酒讲故事");
                }
            }
        }, "老王").start();
    }
}

class Beer {
}

class Story {
}