package com.soft.study.basic.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-10 20:10
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }
    // 默认颜⾊是⽩⾊的
    Color c() default Color.White;
}