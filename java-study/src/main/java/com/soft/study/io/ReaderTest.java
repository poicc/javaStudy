package com.soft.study.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @description: 字符流读操作
 * @author: crq
 * @create: 2021-11-21 15:47
 **/
public class ReaderTest {
    private static final String CHINESE_FILE_PATH = "中文.txt";

    public static void main(String[] args) {
        readerTest(new File(CHINESE_FILE_PATH));
    }

    /**
     * 字符流读取中文文档，解决字节流读取中文乱码问题
     *
     * @param file 中文文件
     */
    private static void readerTest(File file) {
        Reader fr = null;
        try {
            fr = new FileReader(file);
            int read;
            while ((read = fr.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
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
