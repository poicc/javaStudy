package com.soft.study.basic.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @description: 加载外部Properties文件
 * @author: crq
 * @create: 2021-11-15 09:11
 **/
public class PropLoad {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream in = PropLoad.class.getResourceAsStream("database.properties");
        prop.load(in);
        Set<String> keySet = prop.stringPropertyNames();
        for(String key : keySet) {
            System.out.println(key + ":" + prop.getProperty(key));
        }
    }
}
