package study.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @description: 值类型使用示例
 * @author: crq
 * @create: 2021-09-25 22:00
 **/
@Slf4j
public class ValueTypeDemo {
    public static void demo() {
        //浮点型
        float f = 30.4f;
        int x = (int) f;
        log.info("x = {}", x);
        int max = Integer.MAX_VALUE;
        log.info("整型的最大值 = {}", max);
        //字符是使用“‘”括起来的数据
        char ch1 = 'a';
        //通过数字定义字符变量 依照ASCII编码 97为a的ASCII编码
        char ch2 = 97;
        log.info("ch1 = {}", ch1);
        log.info("ch2 = {}", ch2);

        //表示一个“
        char ch3 = '\"';
        log.info("ch3 = {}", ch3);

        //表示一个\
        char ch4 = '\\';
        log.info("ch4 = {}", ch4);


        //修改str的内容 自动拼接
        String str = "super man";
        int y = 30;
        str = str + y;
        log.info("str = {}", str);

    }

    public static void main(String[] args) throws Exception {
        Method method = ValueTypeDemo.class.getMethod("demo");
        method.invoke(null);
    }
}
