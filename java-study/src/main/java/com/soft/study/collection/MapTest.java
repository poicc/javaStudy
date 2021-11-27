package com.soft.study.collection;

import java.util.*;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 00:22
 **/
public class MapTest {
    public static void main(String[] args) {
//        mapTest();
//        getKey();
//        getEntrySet();
//        setObj();
        mapTest01();
    }

    static void mapTest() {
        //创建 map对象
        Map<String, String> map = new HashMap<>(8);

        //添加元素到集合
        map.put("江苏", "南京");
        map.put("浙江", "杭州");
        map.put("湖南", "长沙");
        System.out.println(map);

        System.out.println(map.remove("江苏"));
        System.out.println(map);

        // 根据key查值
        System.out.println(map.get("浙江"));
        System.out.println(map.get("湖南"));

        Collection<String> coll = map.values();
        for (String value : coll) {
            System.out.println(value);
        }
    }

    static void getKey() {
        //1 创建Hashmap集合对象
        Map<Student, String> map = new HashMap<>();
        //2 添加元素
        map.put(new Student("张三", 28), "上海");
        map.put(new Student("张三丰", 22), "北京");
        map.put(new Student("张无忌", 23), "南京");

        //3 取出元素。键找值方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString() + "..." + value);
        }
    }

    static void getEntrySet() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("江苏", "南京");
        map.put("浙江", "杭州");
        map.put("湖南", "长沙");
        //键值对方式遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    static void setObj() {
        //1 创建Hashmap集合对象
        Map<Student, String> map = new HashMap<>();
        //2 添加元素
        map.put(new Student("lisi", 28), "上海");
        map.put(new Student("wangwu", 22), "北京");
        map.put(new Student("wangwu", 22), "南京");

        //3 取出元素:键找值方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString() + "....." + value);
        }
    }

    private static void mapTest01() {//提示
        System.out.println("请录入一个字符串:");
        String line = new Scanner(System.in).nextLine();
        // 统计每个字符出现次数的方法
        findChar(line);
    }
    private static void findChar(String line) {
        //1:创建一个集合 存储  字符 以及其出现的次数
        Map<Character, Integer> map = new HashMap<>();
        //2:遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //判断该字符是否在键集中
            if (!map.containsKey(c)) {
                //这个字符没有出现过，那就是第一次，计入map
                map.put(c, 1);
            } else {
                //先获取之前的次数
                Integer count = map.get(c);
                //count++;
                //再次存入更新
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}
