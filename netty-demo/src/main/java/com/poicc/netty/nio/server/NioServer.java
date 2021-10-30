package com.poicc.netty.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @description: Nio服务端
 * @author: crq
 * @create: 2021-10-31 00:22
 **/
public class NioServer {
    public static void main(String[] args) {
        new NioServer().bind(7397);
    }

    public void bind(int port) {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel socketChannel = ServerSocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.socket().bind(new InetSocketAddress(port), 1024);
            socketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("NIO服务端启动成功！");
            new NioServerHandler(selector, StandardCharsets.UTF_8).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
