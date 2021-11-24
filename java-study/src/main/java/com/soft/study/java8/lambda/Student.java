package com.soft.study.java8.lambda;

import java.util.Optional;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-24 19:38
 **/
public class Student {
    private String name = "ZhangSan";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        getStudentName(null);
        getStudentNameByOptional(null);
    }

    public static void getStudentName(School school) {
        Teacher teacher;
        if (school != null) {
            teacher = school.getTeacher();
        } else {
            teacher = new Teacher();
        }
        Student student;
        if (teacher != null) {
            student = teacher.getStudent();
        } else {
            student = new Student();
        }
        String name = "";
        if (student != null) {
            name = student.getName();
        } else {
            name = "ZhangSan";
        }
        System.out.println("JDK8以下:" + name);
    }

    public static void getStudentNameByOptional(School school) {
        Optional<School> optional = Optional.ofNullable(school);
        String name = optional.map(School::getTeacher).map(Teacher::getStudent).map(Student::getName).orElse("ZhangSan");
        System.out.println("JDK8 Optional " + name);
    }
}
