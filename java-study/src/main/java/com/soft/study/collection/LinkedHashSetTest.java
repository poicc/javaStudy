package com.soft.study.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-28 00:19
 **/
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for(String s : set) {
            System.out.println(s);
        }
    }
}
