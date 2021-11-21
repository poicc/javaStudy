package com.soft.study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: 客户端
 * @author: crq
 * @create: 2021-11-21 15:54
 **/
public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        OutputStream out = new FileOutputStream("D:/1/img/download.jpg");
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        System.out.println("下载成功！");
    }
}
