package com.poicc.netty.demo.util;

import com.poicc.netty.demo.domain.FileBurstInstruct;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: CacheUtil
 * @author: crq
 * @create: 2021-11-03 21:44
 **/
public class CacheUtil {
    public static Map<String, FileBurstInstruct> burstDataMap = new ConcurrentHashMap<>();

}