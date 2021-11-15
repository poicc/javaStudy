package study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 逻辑操作符
 * @author: crq
 * @create: 2021-09-28 23:22
 **/
@Slf4j
public class LogicalOperatorDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        log.info("a && b = " + (a && b));
        log.info("a || b = " + (a || b));
        log.info("!(a && b) = " + !(a && b));

    }
}
