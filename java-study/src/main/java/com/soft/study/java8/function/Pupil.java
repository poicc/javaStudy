package com.soft.study.java8.function;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 14:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pupil {
    private Integer id;
    private String name;
    private Integer age;
    private Integer teacherId;
    private String teacherName;
}
