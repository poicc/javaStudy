package com.soft.study.io;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @description: 图片和字节数组互转
 * @author: crq
 * @create: 2021-11-21 15:56
 **/
public class Image2ByteTest {
    public static void main(String[] args) {
        String path = "D:/1/img/1.jpg";
        byte[] bytes = image2Byte(path);
        System.out.println(Arrays.toString(bytes));
        String path2 = "D:/1/img/2.jpg";
        byte2Image(bytes, path2);
        String s = byte2String(bytes);
        System.out.println(s);
    }

    /**
     * 图片到byte数组
     * @param path 图片路径
     * @return 字节数组
     */
    public static byte[] image2Byte(String path) {
        byte[] data = null;
        FileImageInputStream input;
        try {
            input = new FileImageInputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int numBytesRead;
            while ((numBytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, numBytesRead);
            }
            data = output.toByteArray();
            output.close();
            input.close();
        } catch (IOException ex1) {
            System.err.println(ex1.getMessage());
        }
        return data;
    }

    /**
     * byte数组到图片
     * @param data 字节数组
     * @param path 路径
     */
    public static void byte2Image(byte[] data, String path) {
        if (data.length < 3 || "".equals(path)) {
            return;
        }
        try {
            FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
            imageOutput.write(data, 0, data.length);
            imageOutput.close();
            System.out.println("Make Picture success,Please find image in " + path);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * byte数组到16进制字符串
     *
     * @param data 字节数组
     * @return String
     */
    public static String byte2String(byte[] data) {
        if (data == null || data.length <= 1) {
            return "0x";
        }
        if (data.length > 200000) {
            return "0x";
        }
        StringBuilder sb = new StringBuilder();
        int[] buf = new int[data.length];
        // byte数组转化成十进制
        for (int k = 0; k < data.length; k++) {
            buf[k] = data[k] < 0 ? (data[k] + 256) : (data[k]);
        }
        // 十进制转化成十六进制
        for (int i : buf) {
            if (i < 16) {
                sb.append("0").append(Integer.toHexString(i));
            } else {
                sb.append(Integer.toHexString(i));
            }
        }
        return "0x" + sb.toString().toUpperCase();
    }
}
