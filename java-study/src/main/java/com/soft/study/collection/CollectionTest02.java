package com.soft.study.collection;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 22:57
 **/
public class CollectionTest02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(new Teacher("张三",30));
        teacherList.add(new Teacher("李四",32));
        List<Manager> managerList = new ArrayList<Manager>();
        managerList.add(new Manager("王五",25));
        managerList.add(new Manager("赵六",23));
        getElement(teacherList);
        getElement(managerList);
    }
    //定义方法，参数为List集合，泛型被限定为Employee，可以接收的泛型为Employee或者子类
    public static void getElement(List<? extends  Employee> list) {
        Iterator<? extends Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee employee = it.next();
            System.out.println(employee.getName()+"::"+employee.getAge());
            employee.work();
        }
    }
}
