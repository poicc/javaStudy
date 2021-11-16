package com.soft.study.io;

import java.io.*;

/**
 * @description: 缓冲流
 * @author: crq
 * @create: 2021-11-16 15:15
 **/
public class StreamFlow {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();

        // 创建流对象
        BufferedInputStream bis = new BufferedInputStream(new
                FileInputStream("jdk8.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new
                FileOutputStream("copy.exe"));
        // 读写数据
        int len = 0;
        byte[] bytes = new byte[8*1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0 , len);
        }

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使⽤数组复制时间:"+(end - start)+" 毫秒");
    }
}
