package com.soft.study.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 00:47
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private String name;
    private Integer age;
    private Integer salary;

    static List<Employee> employeeList = new ArrayList<>();
    private static void initData() {
        employeeList.add(new Employee("张三", 48, 3000));
        employeeList.add(new Employee("李四", 18, 5000));
        employeeList.add(new Employee("王五", 28, 7000));
        employeeList.add(new Employee("赵六", 38, 9000));
    }
}
