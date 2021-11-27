package com.soft.study.collection;

import java.util.HashSet;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-26 16:54
 **/
public class StudentTest {
    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(new Student("rose", 18));
//        list.add(new Student("jack", 16));
//        list.add(new Student("abc", 20));
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//以学生的年龄升序
//            }
//        });
//        for (Student student : list) {
//            System.out.println(student);
//        }
        //创建集合对象   该集合中存储 Student类型对象
        HashSet<Student> stuSet = new HashSet<Student>();
        //存储
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        for (Student stu2 : stuSet) {
            System.out.println(stu2);
        }
    }

}

