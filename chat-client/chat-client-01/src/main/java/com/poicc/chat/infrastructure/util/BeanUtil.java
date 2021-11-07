package com.poicc.chat.infrastructure.util;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean实体类工具
 *
 * @author mqxu
 */
public class BeanUtil {

    private static final Map<String, Object> CACHE_MAP = new ConcurrentHashMap<>();

    public static synchronized void addBean(String name, Object obj) {
        CACHE_MAP.put(name, obj);
    }

    public static <T> T getBean(String name, Class<T> t) {
        return (T) CACHE_MAP.get(name);
    }

}
