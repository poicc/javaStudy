package com.soft.study.basic.concurrent;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 14:39
 **/
public class SynchronizedDemo {
    /**
     * 加在方法上 实际是对this对象加锁
     */
    private synchronized void a() {
    }

    /**
     * 同步代码块,锁对象可以是任意的，加在this上 和a()方法作用相同
     */
    private void b() {
        synchronized (this) {

        }
    }

    /**
     * 加在静态方法上 实际是对类对象加锁
     */
    private synchronized static void c() {

    }

    /**
     * 同步代码块 实际是对类对象加锁 和c()方法作用相同
     */
    private void d() {
        synchronized (SynchronizedDemo.class) {

        }
    }
}
