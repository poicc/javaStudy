package com.soft.study.basic.other;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: URL和正则表达式提取站点图片
 * @author: crq
 * @create: 2021-10-19 19:28
 **/
@Slf4j
public class URLRegExSample {
    private static final String SITE_URL = "https://poicc.github.io";

    public static void main(String[] args) {
        URLRegEx urlRegEx = new URLRegEx();
        log.info(urlRegEx.selectUrl(SITE_URL).toString());
    }
}
