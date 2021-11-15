package study.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 关系操作符
 * @author: crq
 * @create: 2021-09-28 23:24
 **/
@Slf4j
public class RelationOperatorDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        log.info("x == y =" + (x == y));
        log.info("x != y =" + (x != y));
        log.info("x > y =" + (x > y));
        log.info("x < y =" + (x < y));
        log.info("x >= y =" + (x >= y));
        log.info("x <= y =" + (x <= y));

    }
}
