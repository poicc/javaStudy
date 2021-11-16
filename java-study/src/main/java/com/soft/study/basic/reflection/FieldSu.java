package com.soft.study.basic.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 属性注解
 * @author: crq
 * @create: 2021-11-09 23:59
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldSu {
    String columnName();
    String type();
    int length();
}
