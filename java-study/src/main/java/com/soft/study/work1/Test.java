package com.soft.study.work1;


/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Test {
    public static void main(String[] args) {

        Shape shape1 = new Rectangle(1, 2);
        shape1.getArea();

        Shape shape2 = new Triangle(3, 4);
        shape2.getArea();

        Cube cube = new Cube(4, 5, 6);
        cube.volume();

    }

}
