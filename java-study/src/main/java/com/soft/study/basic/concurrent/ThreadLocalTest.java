package com.soft.study.basic.concurrent;

/**
 * @description: ThreadLocal示例
 * @author: crq
 * @create: 2021-11-28 20:08
 **/
public class ThreadLocalTest {
    ThreadLocal<Long> longLocal = new ThreadLocal<>();
    ThreadLocal<String> stringLocal = new ThreadLocal<>();

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();

        test.set();
        System.out.println("************ 1 ***************");
        System.out.println(test.getLong());
        System.out.println(test.getString());

        Thread thread1 = new Thread(() -> {
            test.set();
            System.out.println("************ 2 ***************");
            System.out.println(test.getLong());
            System.out.println(test.getString());
        });

        thread1.start();
        thread1.join();

        System.out.println("************ 3 ***************");
        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}
