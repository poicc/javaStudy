package com.soft.study.io;

import java.io.*;
import java.util.Arrays;

/**
 * @description: 字节流写操作
 * @author: crq
 * @create: 2021-11-21 15:48
 **/
public class OutputStreamTest {
    private static final String FILE_PATH = "test.txt";
    private static final String OUT_PATH = "testNew.txt";

    public static void main(String[] args) {
        outputStreamTest();
    }

    /**
     * 字节流写操作
     */
    private static void outputStreamTest() {
        FileOutputStream fos = null;
        try {
            File file = new File(OUT_PATH);
            byte[] buffer = getBytes();
            fos = new FileOutputStream(file);
            fos.write(buffer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    private static byte[] getBytes() {
        InputStream fis = null;
        int len = 512;
        byte[] buffer = new byte[len];
        try {
            fis = new FileInputStream(FILE_PATH);
            while (fis.read(buffer, 0, len) != -1) {
                System.out.print(Arrays.toString(buffer));
            }
            System.out.println();
            for (byte b : buffer) {
                if (Character.isLetterOrDigit((char) b) || (char) b == '\n') {
                    System.out.print((char) b);
                }
            }
        } catch (IOException e) {
            return new byte[1];
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return buffer;
    }

}
