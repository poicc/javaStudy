package com.soft.study.basic.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @description: 直接插入排序
 * @author: crq
 * @create: 2021-10-05 21:18
 **/
@Slf4j
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 3, 0, 1, 9, 5, 2, 8};
        log.info("排序前: {}", Arrays.toString(arr));
        insertSort(arr);
        log.info("排序之后: {}",Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        //已排序数组的下标
        int j;
        //待排序元素
        int t;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //赋值给待排序元素
                t = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > t; j--) {
                    //从后往前遍历 逐个和待排序元素比较 如果已排序元素较大则往后移
                    arr[j + 1] = arr[j];
                }
                //将待排序元素插入到正确的位置
                arr[j + 1] = t;
            }
        }
    }
}
