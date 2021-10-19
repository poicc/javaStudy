package com.soft.study.basic.other;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-19 20:53
 **/
public class URLRegEx {

    private static final String IMG_PATTERN = "<img.*?>";
    private static final String HTTPS_PATTERN = "\"https?(.*?)(\"|>|\\s+)";

    public List<String> selectUrl(String url) {
        List<String> res = new ArrayList<>();
        try {
            URL site = new URL(url);
            //创建url连接
            URLConnection connection = site.openConnection();
            //由 连接的字节输入流 -> 字节字符转换流 -> 扫描流
            Scanner in = new Scanner(new InputStreamReader(connection.getInputStream()));
            //用正则表达式提取<img src="">标签
            Pattern compile = Pattern.compile(IMG_PATTERN);
            //匹配对象
            Matcher imgMatcher, httpsMatcher;
            //定义图片链接
            String imgUrl;
            int count = 0;
            while (in.hasNext()) {
                //按行读取
                String line = in.nextLine();
                //匹配正则 过滤出<img src="****"/>行
                imgMatcher = compile.matcher(line);
                //当前行符合正则匹配
                if (imgMatcher.find()) {
                    //提取出完整的img标签
                    String imgElement = imgMatcher.group();
                    //这个正则用来从完整的img标签中提取到https地址
                    httpsMatcher = Pattern.compile(HTTPS_PATTERN).matcher(imgElement);
                    if (httpsMatcher.find()) {
                        //提取出https 包含双引号
                        imgUrl = httpsMatcher.group();
                        //取子串 去除引号
                        res.add(imgUrl.substring(1, imgUrl.length() - 1));
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
