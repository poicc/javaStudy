package com.soft.study.basic.reflection;

/**
 * @description: 使用自定义注解的类
 * @author: crq
 * @create: 2021-11-10 00:00
 **/
@TableSu("t_student")
public class Student {
    @FieldSu(columnName = "user_id",type = "int",length = 10)
    private int id;
    @FieldSu(columnName = "user_name",type = "varchar2",length = 10)
    private int name;
    @FieldSu(columnName = "user_age",type = "int",length = 10)
    private int age;

    public Student(int id, int name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                '}';
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(int name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student() {
    }
}
