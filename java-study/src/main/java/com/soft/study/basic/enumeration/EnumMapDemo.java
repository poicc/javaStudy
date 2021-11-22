package com.soft.study.basic.enumeration;

import java.util.*;

/**
 * @description: 1月到6月学习不同的Java项目
 * @author: crq
 * @create: 2021-11-22 14:33
 **/
public class EnumMapDemo {
    public static void main(String[] args) {
        List<StudyJava> list = new ArrayList<>();
        list.add(new StudyJava("January", ProjectEnum.SSH));
        list.add(new StudyJava("February", ProjectEnum.SSM));
        list.add(new StudyJava("March", ProjectEnum.SSM));
        list.add(new StudyJava("April", ProjectEnum.SPRINGBOOT));
        list.add(new StudyJava("May", ProjectEnum.SPRINGBOOT));
        list.add(new StudyJava("June", ProjectEnum.SPRINGCLOUD));
        //1、使用hashmap
        Map<ProjectEnum, Integer> hashMap = new HashMap<>();
        list.stream().map(StudyJava::getProjectEnum).forEach(project -> {
            hashMap.merge(project, 1, Integer::sum);
        });
        System.out.println(hashMap);

        //2、使用EnumMap
        Map<ProjectEnum, Integer> enumMap = new EnumMap(ProjectEnum.class);
        for (StudyJava studyJava : list) {
            ProjectEnum project = studyJava.getProjectEnum();
            enumMap.merge(project, 1, Integer::sum);
        }
        System.out.println(enumMap);
    }
}

enum ProjectEnum {
    /**
     * 枚举
     */
    SSM,
    SSH,
    SPRINGBOOT,
    SPRINGCLOUD;
}

class StudyJava {
    private String month;
    private ProjectEnum projectEnum;

    public StudyJava(String month, ProjectEnum projectEnum) {
        this.month = month;
        this.projectEnum = projectEnum;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public ProjectEnum getProjectEnum() {
        return projectEnum;
    }

    public void setProjectEnum(ProjectEnum projectEnum) {
        this.projectEnum = projectEnum;
    }
}
