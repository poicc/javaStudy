package com.soft.study.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: 字节输出流练习——写出字节数组
 * @author: crq
 * @create: 2021-11-16 14:45
 **/
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 使⽤⽂件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcdef".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
