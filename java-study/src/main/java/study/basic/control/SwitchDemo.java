package study.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: switch之case穿透
 * @author: crq
 * @create: 2021-10-01 22:56
 **/
@Slf4j
public class SwitchDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = -1;
        //没有break时 会发生case穿透现象 且没有对应case匹配和default 一路执行到了最后一条
        switch (i) {
            case 0:
                j = 1;
            case 1:
                j = 1;
            case 2:
                j = 2;
        }
        log.info("j={}",j);
    }
}
