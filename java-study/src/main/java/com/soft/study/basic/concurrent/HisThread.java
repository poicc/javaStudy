package com.soft.study.basic.concurrent;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: Callable和Future实现的线程（可以带返回值 可以异步执行）
 * @author: crq
 * @create: 2021-11-23 00:13
 **/
public class HisThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "执行了，将会返回100");
        return 100;
    }

    public static void main(String[] args) {
        HisThread ht = new HisThread();
        FutureTask<Integer> ft = new FutureTask<>(ht);
        Thread thread = new Thread(ft, "有返回值的线程");
        thread.start();
        try {
            Integer result = ft.get();
            System.out.println("线程的返回值：" + result);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println(e.getMessage());
        }
    }
}
