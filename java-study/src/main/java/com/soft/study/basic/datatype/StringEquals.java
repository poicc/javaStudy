package com.soft.study.basic.datatype;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 字符串判等
 * @author: crq
 * @create: 2021-09-26 23:38
 **/
@Slf4j
public class StringEquals {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        log.info("a == b ? {}", a == b);

        //对象地址指向不同
        String c = new String("2");
        String d = new String("2");
        log.info("c == d? {}", c == d);

        /**
         * intern() 方法返回字符串对象的规范化表示形式
         *
         * 最初为空的字符串池由String类私有维护。
         *
         * 当调用实习生方法时，如果池中已经包含一个等于这个string对象(由equals(object)方法确定)的字符串，则返回池中的字符串。否则，将此String对象添加到池中并返回对该String对象的引用。
         *
         * 由此可知，对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
         *
         * 所有字面值字符串和字符串值常量表达式都被实习生。字符串字面值在Java语言规范一节中定义。
         *
         * 返回:
         *
         * 具有与此字符串相同内容的字符串，但保证来自唯一字符串池。
         */
        String e = new String("3").intern();
        String f = new String("3").intern();
        log.info("e == f ? {}", e == f);

        //equals比较值
        String g = new String("4");
        String h = new String("4");
        log.info("g == h ? {}", g.equals(h));
    }
}
