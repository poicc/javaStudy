package com.soft.study.basic.concurrent;

import javax.swing.*;
import java.util.Random;

/**
 * @description: 随机数线程
 * @author: crq
 * @create: 2021-11-23 19:25
 **/
public class NumberThread implements Runnable{
    private final JLabel numberLabel;

    public NumberThread(JLabel numberLabel) {
        this.numberLabel = numberLabel;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true){
            numberLabel.setText(String.valueOf(random.nextInt(100)));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
