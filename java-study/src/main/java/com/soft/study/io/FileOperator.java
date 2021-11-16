package com.soft.study.io;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @description: ⽂件操作练习
 * @author: crq
 * @create: 2021-11-15 19:46
 **/
public class FileOperator {
    /**
     * 判断⽂件是否存在
     *
     * @param pathname ⽂件路径
     * @return 判断结果
     */
    public static boolean isExist(String pathname) {
        File file = new File(pathname);
        return file.exists();
    }
    /**
     * 创建⽬录
     *
     * @param pathname ⽬录路径
     * @return 创建结果
     */
    public static boolean createDir(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return false;
    }
    /**
     * 创建⽂件
     *
     * @param pathname ⽂件路径
     * @return 创建结果
     */
    public static boolean createFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.createNewFile();
        }
        return false;
    }
    /**
     * 获取⽂件信息
     *
     * @param file file对象
     * @return ⽂件信息Properties对象
     */
    public static Properties getFileInfo(File file) {
        String fileName = file.getName();
        String filePath = file.getPath();
        String parentDir = file.getParent();
        long fileLength = file.length();
        Properties properties = new Properties();
        properties.setProperty("fileName", fileName);
        properties.setProperty("filePath", filePath);
        properties.setProperty("parentDir", parentDir);
        properties.setProperty("fileLength", String.valueOf(fileLength));
        return properties;
    }
    /**
     * 删除⽂件
     *
     * @param pathname ⽂件路径
     * @return 删除结果
     */
    public static boolean deleteFile(String pathname) {
        File file = new File(pathname);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }
}
