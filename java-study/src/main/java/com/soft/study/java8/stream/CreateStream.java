package com.soft.study.java8.stream;

import java.util.stream.Stream;

/**
 * @description: 创建和使用stream流
 * @author: crq
 * @create: 2021-11-24 23:17
 **/
public class CreateStream {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a", "b", "c");
//        // 创建一个顺序流
//        Stream<String> stream = list.stream();
//        // 创建一个并行流
//        Stream<String> parallelStream = list.parallelStream();
//        int[] array={1,3,5,6,8};
//        IntStream stream = Arrays.stream(array);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);
    }

}
