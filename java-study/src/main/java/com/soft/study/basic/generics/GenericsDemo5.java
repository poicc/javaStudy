package com.soft.study.basic.generics;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @description: 泛型方法:方法前面的<T>才证明该方法是泛型方法，重要！！！
 * @author: crq
 * @create: 2021-11-21 16:54
 **/
public class GenericsDemo5 {
    public static void main(String[] args) {

        Object obj = null;
        try {
            obj = genericMethod(Class.forName("com.soft.study.basic.generics.City"));
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(obj);
        City city = (City) obj;
        Objects.requireNonNull(city).setName("南京");
        System.out.println(city);
    }


    private static <T> T genericMethod(Class<T> clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return clazz.getDeclaredConstructor().newInstance();
    }
}
