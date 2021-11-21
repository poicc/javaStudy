package com.soft.study.io;

import java.io.*;

/**
 * @description: 字符流写操作
 * @author: crq
 * @create: 2021-11-21 15:49
 **/
public class WriterTest {
    private static final String CHINESE_FILE_PATH = "中文.txt";
    private static final String OUT_PATH = "中文New.txt";

    public static void main(String[] args) {
        fileWriter();
    }

    /**
     * 字符流写操作
     */
    private static void fileWriter() {
        Reader fr = null;
        Writer fw = null;
        try {
            //先读
            fr = new FileReader(CHINESE_FILE_PATH);
            StringBuilder sb = new StringBuilder();
            int read;
            while ((read = fr.read()) != -1) {
                System.out.print((char) read);
                sb.append((char) read);
            }
            //再写
            File file = new File(OUT_PATH);
            fw = new FileWriter(file);
            fw.write(sb.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}
