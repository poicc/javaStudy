package study.java;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 圆
 * @author: crq
 * @create: 2021-10-15 10:43
 **/
@Slf4j
public class Circle {
    private double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double area() {
        return  Math.PI * Math.pow(radius,2) / 2;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        log.info("面积: {}"+circle.area());
        log.info("周长: {}"+circle.perimeter());
    }
}
