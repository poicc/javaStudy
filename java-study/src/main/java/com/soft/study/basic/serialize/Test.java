package com.soft.study.basic.serialize;

import java.io.*;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-18 23:47
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(
                        new FileOutputStream( new File("singleton.txt") )
                );
        // 将单例对象先序列化到文本文件singleton.txt中
        objectOutputStream.writeObject( Singleton.getSingleton() );
        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(
                        new FileInputStream( new File("singleton.txt") )
                );
        // 将文本文件singleton.txt中的对象反序列化为singleton1
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        objectInputStream.close();

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println( singleton1 == singleton2 );
    }
}
