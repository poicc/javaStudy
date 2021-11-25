package com.soft.study.java8.function;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 15:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PupilTeacher {
    private Integer teacherId;
    private String teacherName;
}
