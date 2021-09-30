package com.poicc.java.jfx.ctrl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @description: 单词方法
 * @author: crq
 * @create: 2021-10-01 00:15
 **/
public class Word {
    public List<String> words = new ArrayList<>();

    /**
     * 单词文件读取方法
     */
    public Word() {
        String file = "src/main/java/com/poicc/java/jfx/text/word.text";
        //用BufferedReader类来读取word文件
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                if (!temp.equals("")) {
                    words.add(temp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通用的查找函数 通过BiFunction的apply过滤关键词
     *
     * @param keyword
     * @param collection
     * @param matcher
     * @return
     */
    public static List<String> search(String keyword, Collection<String> collection, BiFunction<String, String, Boolean> matcher) {
        return (collection == null || matcher == null) ?
                Collections.emptyList() :
                collection.stream()
                        .filter(t -> matcher.apply(t,keyword))
                        .collect(Collectors.toList());
    }
}
