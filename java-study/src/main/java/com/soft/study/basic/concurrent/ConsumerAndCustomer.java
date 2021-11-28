package com.soft.study.basic.concurrent;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

/**
 * @description: 生产者消费者模型
 * @author: crq
 * @create: 2021-11-28 15:33
 **/
public class ConsumerAndCustomer {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue queue = new MessageQueue(2);
        // 三个生产者向队列里存值
        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(() -> {
                queue.put(new Message(id, "值" + id));
            }, "生产者" + i).start();
        }

        Thread.sleep(1000);

        // 一个消费者不停地从队列里取值
        new Thread(() -> {
            while (true) {
                queue.take();
            }
        }, "消费者").start();

    }
}
/**
 * 消息队列被生产者和消费者持有
 */
class MessageQueue {
    private final LinkedList<Message> list = new LinkedList<>();
    /**
     * 容量
     */
    private final int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 生产
     */
    public void put(Message message) {
        synchronized (list) {
            while (list.size() == capacity) {
                System.out.println("队列已满，生产者等待");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.addLast(message);
            System.out.println("生产消息:" + message);
            // 生产后通知消费者
            list.notifyAll();
        }
    }

    public Message take() {
        synchronized (list) {
            while (list.isEmpty()) {
                System.out.println("队列已空，消费者等待");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = list.removeFirst();
            System.out.println("消费消息:" + message);
            // 消费后通知生产者
            list.notifyAll();
            return message;
        }
    }
}

/**
 * 消息类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Message {
    private int id;
    private Object value;
}