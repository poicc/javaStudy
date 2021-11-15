package study.basic.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 使用通配符进行向上转型
 * @author: crq
 * @create: 2021-11-06 00:35
 **/
public class GenericsWildcardDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
//        List<Number> numList = intList; // Error
        List<? extends Integer> intList2 = new ArrayList<>();
        List<? extends Number> numList2 = intList2; // OK
    }
}
