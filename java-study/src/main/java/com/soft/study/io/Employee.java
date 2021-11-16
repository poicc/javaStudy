package com.soft.study.io;

import java.io.Serializable;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-16 19:58
 **/
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    public String name;
    public String address;
    public transient int age;
    /**
     * 添加新的属性 ,重新编译, 可以反序列化,该属性赋为默认值
     */
    public int eid;
    /**
     * transient瞬态修饰成员,不会被序列化
     */
    public void addressCheck() {
        System.out.println("Address check : " + name + " -- " + address);
    }
}
