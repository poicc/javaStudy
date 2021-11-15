package study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void getArea() {
        System.out.println((x * y) / 2);

    }
}
