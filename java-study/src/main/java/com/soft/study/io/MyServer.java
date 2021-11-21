package com.soft.study.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 服务端
 * @author: crq
 * @create: 2021-11-21 15:52
 **/
public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);
        while (true) {
            Socket socket = server.accept();
            MyDownload download = new MyDownload(socket);
            Thread thread = new Thread(download);
            thread.start();
        }
    }
}
