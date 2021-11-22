package com.soft.study.basic.concurrent;

/**
 * @description: 线程状态-RUNNABLE
 * @author: crq
 * @create: 2021-11-23 00:36
 **/
public class ThreadStateRunnableExample {
    private static boolean flag = true;

    public static void main(String[] args) {
        Runnable waiting = () -> {
            //让程序空转 保持线程是runnable状态
            do {

            }while (flag);
        };
        Thread thread = new Thread(waiting);
        thread.start();
        try {
            //主线程先休眠一秒 让子线程先跑起来 然后输出线程状态
            Thread.sleep(1000);
            System.out.println(thread.getState());
            //更改标志位 让子线程结束循环
            flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }
}
