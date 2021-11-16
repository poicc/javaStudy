package com.soft.study.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @description: 浮点数舍入练习
 * @author: crq
 * @create: 2021-09-28 00:33
 **/
@Slf4j
public class FloatRounding {
    public static void main(String[] args) {
        log.info("=================== wrong1 ======================");
        wrong1();
        log.info("=================== wrong2 ======================");
        wrong1();
        log.info("=================== right ======================");
        right();
    }

    private static void wrong1() {
        double num1  =3.35;
        float num2 = 3.35f;
        log.info(String.format("%.1f",num1));
        log.info(String.format("%.1f",num2));
    }

    private static void wrong2() {
        double num1  =3.35;
        float num2 = 3.35f;
        //DecimalFormat能够解析和格式化任意语言环境中的数 其舍入模式默认使用 RoundingMode.HALF_EVEN
        // #占位符 比实际数字少的会被自动舍入
        DecimalFormat format = new DecimalFormat("#.##");
        //RoundingMode.DOWN，直接舍去格式化以外的部分
        format.setRoundingMode(RoundingMode.DOWN);
        log.info(String.format(format.format(num1)));
        format.setRoundingMode(RoundingMode.DOWN);
        log.info(String.format(format.format(num2)));
    }

    private static void right() {
        BigDecimal num1 = new BigDecimal("3.35");
        BigDecimal num2 = num1.setScale(1,RoundingMode.DOWN);
        log.info(String.valueOf(num2));
        //向最接近数字方向舍入的舍入模式。如果与两个相邻数字的距离相等，则向上舍入
        BigDecimal num3 = num1.setScale(1,BigDecimal.ROUND_HALF_UP);
        log.info(String.valueOf(num3));
    }
}
