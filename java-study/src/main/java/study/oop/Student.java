package study.oop;

import lombok.Data;

/**
 * @description: 学生类
 * @author: crq
 * @create: 2021-10-15 21:05
 **/
@Data
public class Student implements Cloneable {
    private Integer id;
    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        //浅拷贝
        return super.clone();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException{
//        //深拷贝
//        Student student = (Student) super.clone();
//        student.address = (Address) this.address.clone();
//        return student;
//    }
}
