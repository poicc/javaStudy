package study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 位操作符
 * @author: crq
 * @create: 2021-09-28 23:28
 **/
@Slf4j
public class BitsOperatorDemo {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        log.info("a & b" + c);

        c = a | b;
        log.info("a & b" + c);

        c = a ^ b;
        log.info("a ^ b" + c);

        //对位取反
        c = ~a;
        log.info("~a" + c);

        c = a << 2;
        log.info("a << 2" + c);

        c = a >> 2;
        log.info("a >> 2" + c);

        c = a >>> 2;
        log.info("a >>> 2" + c);

    }
}
