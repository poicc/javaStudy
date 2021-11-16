package com.soft.study.io;

import java.io.File;
import java.util.Objects;

/**
 * @description: 目录遍历搜索java文件
 * @author: crq
 * @create: 2021-11-16 13:59
 **/
public class ListJavaFile {
    public static void main(String[] args) {
        // 创建File对象
        File dir = new File("D:/dev/java/restudy");
        // 调⽤打印⽬录⽅法
        printDir(dir);
    }
    public static void printDir(File dir) {
        // 获取⼦⽂件和⽬录
        File[] files = dir.listFiles(pathname -> {
            if (pathname.isDirectory())
                return true;
            return pathname.getName().toLowerCase().endsWith("java");
        });
        // 循环打印
        for (File file : Objects.requireNonNull(files)) {
            if (file.isFile()) {
                System.out.println(file);
            } else {
                // 是⽬录，继续遍历,形成递归
                printDir(file);
            }
        }
    }
}
