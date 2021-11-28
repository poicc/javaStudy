package com.soft.study.basic.concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 服务端
 * @author: crq
 * @create: 2021-11-28 20:25
 **/
public class Server implements Runnable {
    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Server() {
        try {
            this.serverSocket = new ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Server: Server Listening...");
            while (true) {
                Socket socket = serverSocket.accept();
                // 接收到 Socket 后，独立出线程接受处理
                SocketThread socketThread = new SocketThread(socket);
                new Thread(socketThread).start();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
