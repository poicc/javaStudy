package com.soft.study.basic.concurrent;

/**
 * @description: 改进后的售票程序
 * @author: crq
 * @create: 2021-11-23 19:19
 **/
public class SellTickTest3 {
    public static void main(String[] args) {
        TicketWindow3 tw = new TicketWindow3();
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(tw, "窗口" + i);
            thread.start();
        }
    }
}

class TicketWindow3 implements Runnable {
    private static int ticket = 30;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票,当前票数为:" + --ticket);
                } else {
                    System.out.println(Thread.currentThread().getName() + "余票不足,无法售票");
                    break;
                }
            }
        }
    }
}
