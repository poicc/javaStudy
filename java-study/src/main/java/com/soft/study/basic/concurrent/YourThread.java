package com.soft.study.basic.concurrent;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-22 20:00
 **/
public class YourThread implements Runnable {
    private final String threadName;

    public YourThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating:" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running:" + threadName);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread:" + threadName + "," + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Thread:" + threadName + "exited");
    }

    public static void main(String[] args) {
        YourThread yt = new YourThread("hello");
        Thread thread1 = new Thread(yt);
        Thread thread2 = new Thread(yt);
        Thread thread3 = new Thread(yt);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
