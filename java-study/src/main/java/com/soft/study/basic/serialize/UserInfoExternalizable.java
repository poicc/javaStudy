package com.soft.study.basic.serialize;

import java.io.*;

/**
 * @description: Externalizable实例
 * @author: crq
 * @create: 2021-10-18 23:36
 **/
public class UserInfoExternalizable {
    /**
     * 序列化
     *
     * @throws IOException IO异常
     */
    public static void serialize() throws IOException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("crq");
        userInfo.setUserAge(20);
        userInfo.setUsePass("pass");

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("userInfo.txt"));
        objectOutputStream.writeObject(userInfo);
        objectOutputStream.close();

        System.out.println("序列化成功！已经生成userInfo.txt文件");
        System.out.println("==============================================");
    }

    /**
     * 反序列化
     *
     * @throws IOException            IO异常
     * @throws ClassNotFoundException 类找不到异常
     */
    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("userInfo.txt"));
        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("反序列化结果为：");
        System.out.println(userInfo);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serialize();
        deserialize();
    }
}
