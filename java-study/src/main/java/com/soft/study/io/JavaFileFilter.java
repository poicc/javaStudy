package com.soft.study.io;

import java.io.File;
import java.util.Objects;

/**
 * @description: 遍历⽬录，获取所有的java⽂件
 * @author: crq
 * @create: 2021-11-16 13:51
 **/
public class JavaFileFilter {
    public static void main(String[] args) {
        File dir = new File("D:/dev/java/restudy/java-study/src/main/java/com/soft/study/io");
        File[] files = dir.listFiles(file -> {
            //判断如果获取到的是⽬录，直接放⾏
            if (file.isDirectory()) {
                return true;
            }
            //获取路径中的⽂件名，判断是否java结尾，是就返回true
            return file.getName().toLowerCase().endsWith("java");
        });
        //遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
