package com.soft.study.basic.generics;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-21 16:54
 **/
public class City {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
