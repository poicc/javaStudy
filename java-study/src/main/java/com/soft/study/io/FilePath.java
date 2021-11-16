package com.soft.study.io;

import java.io.File;

/**
 * @description: 绝对路径和相对路径
 * @author: crq
 * @create: 2021-11-15 19:34
 **/
public class FilePath {
    public static void main(String[] args) {
        // 桌⾯的hello.txt⽂件
        File f = new File("D:/笔记/question.txt");
        System.out.println(f.getAbsolutePath());
        // 项⽬下的bbb.java⽂件
        File f2 = new File("student.java");
        System.out.println(f2.getAbsolutePath());
    }
}
