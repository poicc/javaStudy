package com.soft.study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 结合可变参数练习
 * @author: crq
 * @create: 2021-11-28 00:35
 **/
public class AddAllTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //原来的写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);

        //采用工具类往集合中添加元素的写法
        Collections.addAll(list, 5, 222, 1,2);
        System.out.println(list);
    }
}
