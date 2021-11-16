package com.soft.study.io;

import java.io.File;
import java.util.Objects;

/**
 * @description: File类⽬录遍历⽅法
 * @author: crq
 * @create: 2021-11-16 13:49
 **/
public class ListFile {
    public static void main(String[] args) {
        File dir = new File("D:/dev/java/restudy");
        //获取当前⽬录下的⽂件以及⽂件夹对象，通过⽂件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
