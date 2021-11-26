package com.soft.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 17:13
 **/
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        getElement(list1);
        Collection<String> list2 = new ArrayList<String>();
        getElement(list2);
    }
    //?为通配符，可以接收任意类型
    public static void getElement(Collection<?> coll){
        Iterator<?> it = coll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
