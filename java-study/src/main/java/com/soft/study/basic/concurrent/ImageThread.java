package com.soft.study.basic.concurrent;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 图片线程
 * @author: crq
 * @create: 2021-11-23 19:26
 **/
public class ImageThread implements Runnable {
    private JLabel imageLabel;
    private static List<String> imageList = new ArrayList<>(
            Arrays.asList("https://cdn.jsdelivr.net/gh/poicc/image@main/ayy.4ehpjvc0ltk0.jpg",
                    "https://cdn.jsdelivr.net/gh/poicc/image@main/download.zx8q3dicc5s.jpg",
                    "https://cdn.jsdelivr.net/gh/poicc/image@main/favicon.79v96ub6ml40.ico",
                    "https://cdn.jsdelivr.net/gh/poicc/image@main/bgh_gaitubao_1920x866.10kdqagz5zio.jpg",
                    "https://cdn.jsdelivr.net/gh/poicc/image@main/小莫.11h647cp5e80.jpg")
    );

    public ImageThread(JLabel imageLabel) {
        this.imageLabel = imageLabel;
    }

    @Override
    public void run() {
        for(int i=0;i<imageList.size();i++){
            Icon icon = null;
            try {
                icon = new ImageIcon(new URL(imageList.get(i)));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            imageLabel.setIcon(icon);
            imageLabel.repaint();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
