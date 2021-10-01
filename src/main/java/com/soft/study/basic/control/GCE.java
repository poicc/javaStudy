package com.soft.study.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 最大公约数GCD（greatest common divisor）
 * 欧几里德算法 又称辗转相除法
 * @author: crq
 * @create: 2021-10-01 22:32
 **/
@Slf4j
public class GCE {
    public static void main(String[] args) {
        int resultByLoop = getGCDByLoop(12,36);
        log.info("12和36的最大公约数是:{}",resultByLoop);
        int resultByRecursion = getGCDByRecursion(35,21);
        log.info("35和21的最大公约数是:{}",resultByRecursion);
    }
    /**
     * 使用循坏实现
     *
     * @param a 参数a
     * @param b 参数b
     * @return a和b的最大公约数
     */
    public static int getGCDByLoop(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        //辗转相除法
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * 使用递归实现
     * @param a 参数a
     * @param b 参数b
     * @return a和b的最大公约数
     */
    public static int getGCDByRecursion(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : getGCDByRecursion(b, a % b);
    }
}
