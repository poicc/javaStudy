package com.soft.study.java8.stream;



import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 00:47
 **/
public class StreamTest {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
//        streamUsage();
//        filter01();
//        customFilter();
//        getMaxLengthItem();
//        getMaxInteger();
//        getMaxAge();
//        getGreaterThan();
//        toUpperCase();
//        integerItemPlus();
//        addSalary();
//        mergeStrArr();
        mergeNewArr();
    }

    /**
     * 遍历/匹配（foreach/find/match）
     */
    private static void streamUsage() {
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        // 遍历输出符合条件的元素
        list.stream().filter(x -> x > 6).forEach(System.out::println);
        // 匹配第一个
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        // 匹配任意（适用于并行流）
        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
        // 是否包含符合特定条件的元素
        boolean anyMatch = list.stream().anyMatch(x -> x < 6);
        System.out.println("匹配第一个值：" + findFirst.get());
        System.out.println("匹配任意一个值：" + findAny.get());
        System.out.println("是否存在大于6的值：" + anyMatch);
    }
    /**
     * 初始化数据
     */
    private static void initData() {
        employeeList.add(new Employee("张三", 48, 3000));
        employeeList.add(new Employee("李四", 18, 5000));
        employeeList.add(new Employee("王五", 28, 7000));
        employeeList.add(new Employee("赵六", 38, 9000));
    }
    /**
     * 筛选员工中未满18周岁的人，并形成新的集合
     */
    private static void filter01() {
        initData();
        List<Employee> collect = employeeList.stream().filter(x -> x.getAge() > 18).collect(Collectors.toList());
        System.out.println(collect);
    }
    /**
     * 自定义条件匹配
     */
    private static void customFilter() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>(8);
        map.put("id", 1);
        map.put("name", "ZhangSan");
        map.put("age", 18);
        list.add(map);

        Map<String, Object> map2 = new HashMap<>(8);
        map2.put("id", 2);
        map2.put("name", "LiSi");
        map2.put("age", 20);
        list.add(map2);

        System.out.println("初始化：" + list);
        java8Stream(list);
        beforeJava8(list);
    }
    /**
     * Java8 Stream方式
     *
     * @param list list
     */
    private static void java8Stream(List<Map<String, Object>> list) {
        List<Map<String, Object>> collect = list.stream().filter(a -> "ZhangSan".equals(a.get("name").toString())).collect(Collectors.toList());
        System.out.println("in Java8 Stream:" + collect);
    }
    /**
     * Java8之前方式
     *
     * @param list list
     */
    private static void beforeJava8(List<Map<String, Object>> list) {
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Object> hashMap = new HashMap<>();
        for (Map<String, Object> map : list) {
            if ("ZhangSan".equals(map.get("name"))) {
                hashMap.putAll(map);
            }
        }
        result.add(hashMap);
        System.out.println("before Java8:" + result);
    }
    /**
     * 获取String集合中最长的元素
     */
    private static void getMaxLengthItem() {
        List<String> list = Arrays.asList("ZhangSan", "LiSi", "WangWu", "ZhaoLiu");
        Comparator<? super String> comparator = Comparator.comparing(String::length);
        Optional<String> max = list.stream().max(comparator);
        System.out.println(max);
    }
    /**
     * 获取Integer集合中的最大值
     */
    private static void getMaxInteger() {
        List<Integer> list = Arrays.asList(1, 17, 27, 7);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        // 自定义排序
        Optional<Integer> max2 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(max2);
    }
    /**
     * 获取员工中年龄最大的人
     */
    private static void getMaxAge() {
        initData();
        Comparator<? super Employee> comparator = Comparator.comparingInt(Employee::getAge);
        Optional<Employee> max = employeeList.stream().max(comparator);
        System.out.println(max);
    }
    /**
     * 计算integer集合中大于10的元素的个数
     */
    private static void getGreaterThan() {
        List<Integer> list = Arrays.asList(1, 27, 27, 7);
        long count = list.stream().filter(x -> x > 10).count();
        System.out.println(count);
    }
    /**
     * 字符串大写
     */
    private static void toUpperCase() {
        List<String> list = Arrays.asList("ZhangSan", "LiSi", "WangWu", "ZhaoLiu");
        list.stream().forEach(t -> t.toUpperCase());
        List<String> collect = list.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
        List<String> collect2 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
    }
    /**
     * 整数数组每个元素+3
     */
    private static void integerItemPlus() {
        List<Integer> list = Arrays.asList(1, 17, 27, 7);
        List<Integer> collect = list.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println(collect);
    }
    /**
     * 公司效益好，每人涨2000
     */
    private static void addSalary() {
        initData();
        List<Employee> collect = employeeList.stream().map(x -> {
            x.setAge(x.getSalary() + 2000);
            return x;
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
    /**
     * 将两个字符数组合并成一个新的字符数组
     */
    private static void mergeStrArr() {
        String[] arr = {"z, h, a, n, g", "s, a, n"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        List<String> collect = list.stream().flatMap(x -> {
            String[] array = x.split(",");
            return Arrays.stream(array);
        }).collect(Collectors.toList());
        System.out.println(collect);
    }
    /**
     * 将两个字符数组合并成一个新的字符数组
     */
    private static void mergeNewArr() {
        String[] arr = {"z, h, a, n, g", "s, a, n"};
        List<String> list = Arrays.asList(arr);
        List<String> collect = list.stream().flatMap(x -> {
            String[] array = x.split(",");
            return Arrays.stream(array);
        }).collect(Collectors.toList());
        System.out.println(collect);
    }
}
