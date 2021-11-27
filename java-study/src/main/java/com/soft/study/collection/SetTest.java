package com.soft.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-27 23:41
 **/
public class SetTest {
    public static void main(String[] args)  {
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("hello");
        set.add("world");
        set.add("songshanyuan");
        set.add("software");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        for(String str : set) {
            System.out.println(str);
        }
    }
}
