package com.soft.study.basic.concurrent;

/**
 * @description: 线程状态-NEW
 * @author: crq
 * @create: 2021-11-23 00:34
 **/
public class ThreadStateNewExample {
    private static final Object WAITER = new Object();

    public static void main(String[] args) {
        Runnable waiting = () -> {
            try {
                WAITER.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread whoWillWait = new Thread(waiting);
        System.out.println(whoWillWait.getState());
    }
}
