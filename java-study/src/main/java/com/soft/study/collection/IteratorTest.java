package com.soft.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 10:30
 **/
public class IteratorTest {
    public static void main(String[] args) {
        // 使用多态方式创建对象
        Collection<String> coll = new ArrayList<String>();
        // 添加元素到集合
        coll.add("Java");
        coll.add("JavaSE");
        coll.add("JavaEE");

        //使用迭代器遍历，每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();
        //判断是否有迭代元素
        while(it.hasNext()){
            //获取迭代出的元素
            String s = it.next();
            System.out.println(s);
        }
    }
}
