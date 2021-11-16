package com.soft.study.io;

import java.io.File;
import java.util.Objects;

/**
 * @description: 目录遍历
 * @author: crq
 * @create: 2021-11-16 13:58
 **/
public class PrintDir {
    public static void main(String[] args) {
        // 创建File对象
        File dir = new File("D:/dev/java/restudy");
        // 调⽤打印⽬录⽅法
        printDir(dir);
    }
    public static void printDir(File dir) {
        System.out.println(dir);
        // 获取⼦⽂件和⽬录
        File[] files = dir.listFiles();
        // 循环打印
        for (File file : Objects.requireNonNull(files)) {
            //判断是⽂件，直接输出
            if (file.isFile()) {
                System.out.println(file);
            } else {
                // 是⽬录，继续遍历,形成递归
                printDir(file);
            }
        }
    }
}
