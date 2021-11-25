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
    private String gender;
    private String address;

    static List<Employee> employeeList = new ArrayList<>();

}
