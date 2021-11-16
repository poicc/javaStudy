package com.soft.study.java;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-23 20:53
 **/
public class QueueMain {
    public static void main(String[] args) {

        Queue queue =  new Queue();
        for (int i = 1; i <=20; i++) {
            queue.enqueue(i);
        }
        System.out.println("队列实际长度："+queue.getSize());
        for (int i = 0; i < 20; i++) {
            System.out.println("元素 "+queue.dequeue()+"出队列");
        }
    }
}
