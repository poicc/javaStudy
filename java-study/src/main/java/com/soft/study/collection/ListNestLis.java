package com.soft.study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: List嵌套List
 * @author: crq
 * @create: 2021-11-28 00:37
 **/
public class ListNestLis {
    public static void main(String[] args) {
        //List大集合
        List<List<String>> bigList = new ArrayList<>();

        //List小集合
        List<String> little1 = new ArrayList<>();
        List<String> little2 = new ArrayList<>();
        List<String> little3 = new ArrayList<>();

        //小集合存储字符串
        little1.add("张三");
        little1.add("李四");
        little2.add("aaa");
        little2.add("bbb");
        little3.add("111");
        little3.add("222");

        //大集合，存储小集合
        bigList.add(little1);
        bigList.add(little2);
        bigList.add(little3);

        //遍历大集合
        Iterator<List<String>> iterator = bigList.iterator();
        while (iterator.hasNext()) {
            //取出大集合中的小集合
            List<String> little = iterator.next();
            Iterator<String> littleIterator = little.iterator();
            while (littleIterator.hasNext()) {
                System.out.println(littleIterator.next());
            }
        }
    }
}
