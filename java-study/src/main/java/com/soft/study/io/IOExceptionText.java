package com.soft.study.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description: 异常处理
 * @author: crq
 * @create: 2021-11-16 15:05
 **/
public class IOExceptionText {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos.write(100);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        }
    }
}
