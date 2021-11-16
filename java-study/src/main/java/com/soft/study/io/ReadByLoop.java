package com.soft.study.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description: 使⽤循环改进字节读取
 * @author: crq
 * @create: 2021-11-16 14:57
 **/
public class ReadByLoop {
    public static void main(String[] args) throws IOException {
        // 使⽤⽂件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        // 定义变量，保存数据
        int b = 0;
        // 循环读取
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        // 关闭资源
        fis.close();
    }
}
