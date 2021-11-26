package com.soft.study.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 08:20
 **/
public class ListSample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i <= 5; i++) {
            linkedList.add("a" + i);
        }
        System.out.println(linkedList);
        linkedList.add(3, "a100");
        System.out.println(linkedList);
        linkedList.set(6, "a200");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.indexOf("a3"));
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
