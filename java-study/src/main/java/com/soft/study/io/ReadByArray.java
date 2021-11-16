package com.soft.study.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description: 使⽤字节数组读取
 * @author: crq
 * @create: 2021-11-16 15:02
 **/
public class ReadByArray {
    public static void main(String[] args) throws IOException {
//        // 使⽤⽂件名称创建流对象
//        FileInputStream fis = new FileInputStream("read.txt");
//        // 定义变量，作为有效个数
//        int len;
//        // 定义字节数组，作为装字节数据的容器
//        byte[] b = new byte[2];
//        // 循环读取
//        while ((len = fis.read(b)) != -1) {
//            // 每次读取后,把数组变成字符串打印
//            System.out.println(new String(b));
//        }
//        // 关闭资源
//        fis.close();
        // 使⽤⽂件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while ((len = fis.read(b)) != -1) {
            // 每次读取后,把数组的有效字节部分，变成字符串打印
            // len 每次读取的有效字节个数
            System.out.println(new String(b, 0, len));
        }
        // 关闭资源
        fis.close();
    }
}
