package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Cube extends Rectangle {
    private int height;

    public Cube(int x, int y, int height) {
        super(x, y);
        this.height = height;
    }

    public void volume() {
        System.out.println(x * y * height);

    }
}
