package com.soft.study.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: 服务端线程
 * @author: crq
 * @create: 2021-11-21 15:52
 **/
public class MyDownload implements Runnable {
    private Socket socket;

    public MyDownload(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("与客户端连接成功");
            //服务端向客户端发送消息
            OutputStream out = socket.getOutputStream();
            File file = new File("D:/1/img/1.jpg");
            //将此文件从硬盘读到内存中
            InputStream in = new FileInputStream(file);
            //定义每次发送的文件大小
            byte[] bytes = new byte[1000];
            int len;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
