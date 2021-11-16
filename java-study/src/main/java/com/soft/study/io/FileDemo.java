package com.soft.study.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * @description: File相关
 * @author: crq
 * @create: 2021-11-16 16:22
 **/
public class FileDemo {
    private static final String BASE_PATH = "D:/笔记/";

    public static void main(String[] args) throws IOException {
        // 创建File对象
        File dir = new File("D:/dev/java/restudy");
        // 调⽤打印⽬录⽅法
        printDir(dir);
    }

    /**
     * File类的构造方法
     */
    public static void fileConstructor() {
        //文件路径名
        String pathname = BASE_PATH + "question.txt";
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

    /**
     * File的创建和删除⽅法
     */
    public static void fileCreateDelete() throws IOException {
        // ⽂件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否创建:" + f.createNewFile());
        System.out.println("是否存在:" + f.exists());
        // ⽬录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在:" + f2.exists());
        System.out.println("是否创建:" + f2.mkdirs());
        System.out.println("是否存在:" + f2.exists());
        // ⽂件的删除
        System.out.println(f.delete());
        // ⽬录的删除
        System.out.println(f2.delete());
    }

    /**
     * File类的获取⽅法
     */
    public static void fileGetMethods() {
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

    /**
     * File类的判断⽅法
     */
    public static void fileJudgeMethods() {
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

    /**
     * FileInputStream类构造⽅法
     */
    public static void fileInputStreamConstructor() throws IOException {
        // 使⽤File对象创建流对象,⽂件如不存在会报异常
        File file = new File("read.txt");
        FileInputStream fos = new FileInputStream(file);
        // 使⽤⽂件名称创建流对象
        FileInputStream fos1 = new FileInputStream("read.txt");
    }

    /**
     * 绝对路径和相对路径
     */
    public static void filePath() {
        // 桌⾯的hello.txt⽂件
        File f = new File("D:/笔记/question.txt");
        System.out.println(f.getAbsolutePath());
        // 项⽬下的bbb.java⽂件
        File f2 = new File("student.java");
        System.out.println(f2.getAbsolutePath());
    }

    /**
     * File类⽬录遍历⽅法
     */
    public static void listFile() {
        File dir = new File("D:/dev/java/restudy");
        //获取当前⽬录下的⽂件以及⽂件夹对象，通过⽂件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }

    /**
     * 遍历⽬录，获取所有的java⽂件
     */
    public static void javaFileFilter() {
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

    /**
     * 目录遍历
     * @param dir dir
     */
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
