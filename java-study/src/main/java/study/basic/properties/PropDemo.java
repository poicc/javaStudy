package study.basic.properties;

import java.util.Properties;
import java.util.Set;

/**
 * @description: properties练习
 * @author: crq
 * @create: 2021-11-15 09:04
 **/
public class PropDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("host","localhost");
        properties.setProperty("port","3306");
        properties.setProperty("username","root");
        properties.setProperty("password","123123");
        System.out.println(properties);
        String value = properties.getProperty("port");
        System.out.println(value);
        //所有的键存储到Set集合
        Set<String> set = properties.stringPropertyNames();
        for(String key : set) {
            System.out.println(key + "==" + properties.getProperty(key));
        }
    }
}
