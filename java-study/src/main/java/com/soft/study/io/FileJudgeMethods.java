package com.soft.study.io;

import java.io.File;

/**
 * @description: File类的判断⽅法
 * @author: crq
 * @create: 2021-11-15 19:37
 **/
public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("D:/笔记/question.txt");
        File f2 = new File("D:/笔记");
        // 判断是否存在
        System.out.println("D:/笔记/question.txt 是否存在:" + f.exists());
        System.out.println("D:/笔记 是否存在" + f2.exists());
        // 判断是⽂件还是⽬录
        System.out.println("D:/笔记 是⽂件?:" +
                f2.isFile());
        System.out.println("D:/笔记 是⽬录?:" +
                f2.isDirectory());
    }
}
