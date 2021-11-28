package com.soft.study.basic.concurrent;


import java.sql.Connection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 20:03
 **/
public class ConnectionManager {
    private Connection connect = null;
//    public Connection openConnection() {
//        if(connect == null){
//            connect = DriverManager.getConnection();
//        }
//        return connect;
//    }
//
//    public void closeConnection() {
//        if(connect!=null)
//            connect.close();
//    }
}

class Dao{
//    public void insert() {
//        ConnectionManager connectionManager = new ConnectionManager();
//        Connection connection = connectionManager.openConnection();
//        //使用connection进行操作
//        connectionManager.closeConnection();
//    }
}