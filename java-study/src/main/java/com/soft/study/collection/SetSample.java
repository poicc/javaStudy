package com.soft.study.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 08:16
 **/
public class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.println(set);

        Set<String> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);
    }
}
