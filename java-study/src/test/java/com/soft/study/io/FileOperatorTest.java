package com.soft.study.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("unchecked")
@Slf4j
public class FileOperatorTest{

    @Test
    public void createDir() {
        String path = "D:/1/img/aaa";
        boolean res = FileOperator.createDir(path);
        assertTrue(res);
    }
    @Test
    public void createFile() {
        String path = "D:/1/img/aaa/hello.txt";
        boolean res = false;
        try {
            res = FileOperator.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        assertTrue(res);
    }
    @Test
    public void getFileInfo() {
        File file = new File("D:/1/img/logo1.png");
        Properties fileProperties = FileOperator.getFileInfo(file);
        assertEquals(4, fileProperties.size());
    }
    @Test
    public void deleteFile() {
        boolean res =
                FileOperator.deleteFile("D:/1/img/logo1.png");
        assertTrue(res);
    }
}