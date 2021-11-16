package com.soft.study.io;

import java.io.File;

/**
 * @description: File类的构造方法
 * @author: crq
 * @create: 2021-11-15 19:26
 **/
public class FileConstructor {
    public static void main(String[] args) {
        //文件路径名
        String pathname = "D:/笔记/question.txt";
        File file1 = new File(pathname);
        System.out.println(file1);

        // 通过⽗路径和⼦路径字符串
        String parent = "D:/笔记";
        String child1 = "question.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);

        // 通过⽗级File对象和⼦路径字符串
        File parentDir = new File("D:/笔记");
        String child2 = "question.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }
}
