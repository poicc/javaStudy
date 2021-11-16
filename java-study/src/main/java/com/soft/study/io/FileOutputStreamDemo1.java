package com.soft.study.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: 字节输出流练习——写出字节数据
 * @author: crq
 * @create: 2021-11-16 14:44
 **/
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 使⽤⽂件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 写出数据
        // 写出第1个字节
        fos.write(97);
        // 写出第2个字节
        fos.write(98);
        // 写出第3个字节
        fos.write(99);
        // 关闭资源
        fos.close();
    }
}
