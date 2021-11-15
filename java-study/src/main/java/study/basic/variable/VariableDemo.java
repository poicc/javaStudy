package study.basic.variable;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 变量
 * @author: crq
 * @create: 2021-09-25 22:15
 **/
@Slf4j
public class VariableDemo {
    /**
     * 类变量(静态变量)
     */
    private static int staticVar = 1024;
    /**
     * 实例变量
     */
    private String instanceVar = "hello";

    /**
     * 实例方法
     */
    public void method() {
        log.info("我被调用了");
    }

    /**
     * 静态方法
     *
     * @param args args
     */
    public static void main(String[] args) {
        //可以静态变量无需实例化本对象
        staticVar = 2048;
        //创建实例对象才能访问实例变量
        VariableDemo vd = new VariableDemo();
        vd.instanceVar = "hello world";
        log.info("instanceVar after:{}",vd.instanceVar);
        //调用实例方法
        vd.method();
    }
}
