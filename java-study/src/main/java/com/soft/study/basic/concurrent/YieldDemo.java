package com.soft.study.basic.concurrent;

/**
 * @description: 线程礼让yield示例
 * @author: crq
 * @create: 2021-11-28 13:59
 **/
public class YieldDemo {
    /**
     * 方法定义
     */
    public static native void yield();

    public static void main(String[] args) {
        Runnable r1 = () -> {
            int count = 0;
            while (true) {
                System.out.println("---- 1>" + count++);
            }
        };

        Runnable r2 = () -> {
            int count = 0;
            while (true) {
                Thread.yield();
                System.out.println("            ---- 2>" + count++);
            }
        };
        Thread t1 = new Thread(r1, "t1");
        Thread t2 = new Thread(r2, "t2");
        t1.start();
        t2.start();
    }
}
