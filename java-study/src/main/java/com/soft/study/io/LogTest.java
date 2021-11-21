package com.soft.study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @description: 日志打印
 * @author: crq
 * @create: 2021-11-21 15:50
 **/
public class LogTest {
    private static final String LOG_PATH = "log.txt";

    public static void main(String[] args) throws FileNotFoundException {
        log("日志消息测试", true, true);
    }

    /**
     * @param msg  带输出信息
     * @param wrap 是否换行
     * @param out  是否输出
     */
    private static void log(Object msg, boolean wrap, boolean out) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(LOG_PATH));
        if (out) {
            if (wrap) {
                System.out.println(msg + "");
                pw.println(msg + "");
            } else {
                System.out.print(msg + "");
                pw.print(msg + "");
            }
        }
        pw.close();
    }
}
