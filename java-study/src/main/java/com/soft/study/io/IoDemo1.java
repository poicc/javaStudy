package com.soft.study.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: IO流练习1
 * @author: crq
 * @create: 2021-11-16 16:37
 **/
public class IoDemo1 {
    public static void main(String[] args) throws IOException {

    }

    /**
     * 读取字节数据
     *
     * @throws IOException e
     */
    public static void readByte() throws IOException {
        // 使⽤⽂件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        // 读取数据，返回⼀个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read = fis.read();
        System.out.println(read);
        // 关闭资源
        fis.close();
    }

    /**
     * 使⽤字节数组读取
     *
     * @throws IOException e
     */
    public static void readByArray() throws IOException {
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

    /**
     * 使⽤循环改进字节读取
     *
     * @throws IOException e
     */
    public static void readByLoop() throws IOException {
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

    /**
     * 字节输出流练习——写出字节数据
     *
     * @throws IOException e
     */
    public static void fileOutputStreamDemo1() throws IOException {
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

    /**
     * 字节输出流练习——写出字节数据
     *
     * @throws IOException e
     */
    public static void fileOutputStreamDemo2() throws IOException {
        // 使⽤⽂件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcdef".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }

    /**
     * 字节输出流练习——写出指定⻓度字节数组
     *
     * @throws IOException e
     */
    public static void fileOutputStreamDemo3() throws IOException {
        // 使⽤⽂件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b, 2, 2);
        // 关闭资源
        fos.close();
    }
    /**
     * 数据追加读写
     *
     * @throws IOException e
     */
    public static void dataAppend() throws IOException{
        // 使⽤⽂件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt", true);
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
