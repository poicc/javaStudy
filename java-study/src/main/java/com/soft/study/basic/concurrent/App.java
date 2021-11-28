package com.soft.study.basic.concurrent;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 20:25
 **/
public class App {
    public static void main(String[] args) {
        Server server = new Server();
        new Thread(server).start();

        Client client1 = new Client();
        client1.send("Hi, I'm Client_1");

        Client client2 = new Client();
        client2.send("Hi, I'm Client_2");
    }
}
