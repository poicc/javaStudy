package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Student {
    private int sno;
    private String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;

    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Student student = (Student) object;
        return sno == student.sno;
    }


    //public boolean equals(Object object) {
    //    // 先判断是不是自己，提高运行效率
    //    if (this == object) {
    //        return true;
    //    }
    //    // 再判断是不是Student，提高代码的健壮性
    //    if (object instanceof Student) {
    //        // 向下转型，父类无法调用子类的成员和方法
    //        Student student = (Student) object;
    //        // 最后判断类的所有属性是否相等，其中String类型可以用相应的equals（）来判断
    //        if (this.getName().equals(student.getName())) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }
    //    return false;
    //}

}






