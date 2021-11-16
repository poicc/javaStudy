package com.soft.study.io;

import java.io.File;

/**
 * @description: File类的获取⽅法
 * @author: crq
 * @create: 2021-11-15 19:32
 **/
public class FileGetMethods {
    public static void main(String[] args) {
        File f = new File("D:/笔记/question.txt");
        System.out.println("⽂件绝对路径:" + f.getAbsolutePath());
        System.out.println("⽂件构造路径:" + f.getPath());
        System.out.println("⽂件名称:" + f.getName());
        System.out.println("⽂件⻓度:" + f.length() + "字节");
        System.out.println("⽂件路径的⽗路径" + f.getParentFile());
        File f2 = new File("D:/笔记");
        System.out.println("⽬录绝对路径:" + f2.getAbsolutePath());
        System.out.println("⽬录构造路径:" + f2.getPath());
        System.out.println("⽬录名称:" + f2.getName());
        System.out.println("⽬录⻓度:" + f2.length());
        System.out.println("⽬录⽗路径" + f2.getParentFile());
    }
}
