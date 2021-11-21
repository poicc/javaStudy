package com.soft.study.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description: 字节流读操作
 * @author: crq
 * @create: 2021-11-21 15:43
 **/
public class InputStreamTest {
    private static final String FILE_PATH = "test.txt";
    private static final String CHINESE_FILE_PATH = "中文.txt";

    public static void main(String[] args) {
        readByChar(true);
        System.out.println("\n====================");
        readByCharArray();
    }

    /**
     * 字节流读取文件：单个字符读取
     *
     * @param isChineseFile 是否中文文件
     */
    private static void readByChar(boolean isChineseFile) {
        FileInputStream fis = null;
        try {
            if (isChineseFile) {
                fis = new FileInputStream(CHINESE_FILE_PATH);
            } else {
                fis = new FileInputStream(FILE_PATH);
            }
            int read;
            while ((read = fis.read()) != -1) {
                System.out.print(read + " ");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    /**
     * 字节流读取文件：数组循环读取
     */
    private static void readByCharArray() {
        FileInputStream fis = null;
        int len = 512;
        byte[] buffer = new byte[len];
        try {
            fis = new FileInputStream(FILE_PATH);
            int read;
            while ((read = fis.read(buffer, 0, len)) != -1) {
                System.out.print(read);
            }
            System.out.println();
            for (byte b : buffer) {
                if (Character.isLetterOrDigit((char) b) || (char) b == '\n') {
                    System.out.print((char) b);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

}
