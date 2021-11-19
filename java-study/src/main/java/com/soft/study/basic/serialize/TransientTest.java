package com.soft.study.basic.serialize;

import java.io.*;

/**
 * @description: ObjectOutputStream实现序列化和ObjectInputStream实现反序列化
 * @author: crq
 * @create: 2021-11-19 08:06
 **/
public class TransientTest {
    public static void main(String[] args) {
        try {
            serializeUser();
            deSerializeUser();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    private static void serializeUser() throws IOException {
        User user = new User();
        user.setUsername("松山院");
        user.setPassword("123456");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"));
        oos.writeObject(user);
        oos.close();
        System.out.println("普通字段序列化：username=  " + user.getUsername());
        System.out.println("添加了transient关键字序列化：password=  " + user.getPassword());
    }

    private static void deSerializeUser() throws IOException, ClassNotFoundException {
        File file = new File("data.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User user = (User) ois.readObject();
        System.out.println("普通字段反序列化：username=  " + user.getUsername());
        System.out.println("添加了transient关键字反序列化：password=  " + user.getPassword());
    }
}
