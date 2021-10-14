package com.soft.study.basic.method;

import io.vavr.Tuple;
import io.vavr.Tuple3;
import lombok.extern.slf4j.Slf4j;
import org.javatuples.Triplet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * @description: 方法返回多个结果
 * @author: crq
 * @create: 2021-10-14 18:09
 **/
@Slf4j
public class MultiReturnTest {
    public static void main(String[] args) {
        int[] resultArr = multiReturnMethod1(4,2,5);
        log.info(Arrays.toString(resultArr));
        log.info("*******************");
        Map<String, Integer> resultMap = multiReturnMethod2(4, 3, 5);
        log.info(String.valueOf(resultMap));
        log.info("****************************");
        ReturnObject returnObject = multiReturnMethod3(4, 3, 5);
        log.info(returnObject.toString());
        log.info("****************************");
        Tuple3<Integer,Integer,Integer> tuple3 = multiReturnMethod4(4, 3, 5);
        log.info(String.valueOf(tuple3));
        log.info("****************************");
        Triplet<Integer, Integer, Integer> triplet = multiReturnMethod5(4, 3, 5);
        log.info(String.valueOf(triplet));
    }

    /**
     * 可变长参数+整型数组返回
     * @param args 可变长参数
     * @return int[]
     */
    public static int[] multiReturnMethod1(int... args) {
        int[] arr = new int[3];
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        arr[0] = max.getAsInt();
        arr[1] = min.getAsInt();
        arr[2] = sum;
        return arr;
    }

    /**
     * @param args 可变长参数
     * @return map
     */
    public static Map<String,Integer> multiReturnMethod2(int... args) {
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        //初始化集合建议最好指定大小
        Map<String,Integer> map = new HashMap<>(4);
        map.put("max",max.getAsInt());
        map.put("min",min.getAsInt());
        map.put("sum",sum);
        return map;
    }

    /**
     *
     * @param args 可变长参数
     * @return 封装的结果对象
     */
    public static ReturnObject multiReturnMethod3(int... args) {
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return new ReturnObject(max.getAsInt(),min.getAsInt(),sum);
    }

    public static Tuple3<Integer,Integer,Integer> multiReturnMethod4(int... args) {
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return Tuple.of(max.getAsInt(),min.getAsInt(),sum);
    }

    /**
     * 支持1个到10个
     * @param args 可变长参数
     * @return Triplet
     */
    public static Triplet<Integer,Integer,Integer> multiReturnMethod5(int... args) {
        OptionalInt max = Arrays.stream(args).max();
        OptionalInt min = Arrays.stream(args).min();
        int sum = Arrays.stream(args).sum();
        return new Triplet<Integer,Integer,Integer>(max.getAsInt(), min.getAsInt(), sum);
    }
}
