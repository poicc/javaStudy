package com.soft.study.basic.concurrent;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 时间线程案例
 * @author: crq
 * @create: 2021-11-23 19:24
 **/
public class TimeThread implements Runnable{
    private final JLabel timeLabel;

    public TimeThread(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while (true){
            timeLabel.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
