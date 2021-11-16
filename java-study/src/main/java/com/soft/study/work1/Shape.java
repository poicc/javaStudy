package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public abstract class Shape {
    protected int x;
    protected int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void getArea();
}
