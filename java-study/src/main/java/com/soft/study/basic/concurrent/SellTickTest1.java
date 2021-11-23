package com.soft.study.basic.concurrent;

/**
 * @description: 继承Thread类的方式实现卖票
 * @author: crq
 * @create: 2021-11-23 19:14
 **/
public class SellTickTest1 {
    public static void main(String[] args) {
        TicketWindow tw1 = new TicketWindow();
        TicketWindow tw2 = new TicketWindow();
        TicketWindow tw3 = new TicketWindow();
        tw1.setName("窗口1");
        tw2.setName("窗口2");
        tw3.setName("窗口3");
        tw1.start();
        tw2.start();
        tw3.start();
    }

}

class TicketWindow extends Thread {
    private int ticket = 30;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了一张票,当前票是为:" + --ticket);

            } else {
                System.out.println(Thread.currentThread().getName() + "余票不足,无法售票！");
                break;
            }
        }
    }
}