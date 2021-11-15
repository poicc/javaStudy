package study.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 颜色枚举 枚举种的属性使用doc注释
 * @author: crq
 * @create: 2021-09-29 21:57
 **/
@Slf4j
public class ColorTest {
    public static void main(String[] args) {
        Color color = Color.RED;
        log.info(String.valueOf(color));
        Color[] arr = Color.values();
        for(Color c: arr) {
            log.info("枚举的索引{},枚举的值{}",c.ordinal(),c);
        }
    }
}

enum Color {
    /**
     * 红色
     */
    RED,
    /**
     * 黄色
     */
    YELLOW,
    /**
     * 绿色
     */
    GREEN
}
