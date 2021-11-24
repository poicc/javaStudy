package com.soft.study.java8.lambda;

import java.util.function.Supplier;

/**
 * @description: Supplier<T>函数式接口测试
 * @author: crq
 * @create: 2021-11-24 15:30
 **/
public class TestSupplier {
    public void test() {
        System.out.println("Java8新特性，Supplier");
    }

    TestSupplier() {
        System.out.println("调用构造方法");
    }

    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    private static void test01() {
        Integer[] arr = {10, 2, 5, 3, 9, 4};
        int max2 = getMax(() -> {
            int max = 0;
            for (Integer i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(max2);
    }

    public static void main(String[] args) {
        //创建Supplier容器，声明为TestSupplier类型，此时并不会调用对象的构造方法，即不会创建对象
        Supplier<TestSupplier> sup = TestSupplier::new;
        sup.get().test();
        System.out.println("------------");
        //调用get()方法，此时会调用对象的构造方法，即获得到真正对象
        sup.get();
        //每次get都会调用构造方法，即获取的对象不同
        System.out.println(("是否是相同的对象实例" + sup.get()).equals(sup.get().toString()));

        sup.get().test01();
    }

}
