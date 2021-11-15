package com.poicc.basedao.context;

/**
 * @description: 使用ThreadLocal封装传递全局存储数据
 * @author: crq
 * @create: 2021-11-15 08:38
 **/
public class DataContext implements AutoCloseable {
    public static final ThreadLocal<Object> CTX = new ThreadLocal<>();

    public static Object getData() {
        return CTX.get();
    }

    public static void setData(Object data) {
        CTX.set(data);
    }

    @Override
    public void close() {

    }
}
