package com.soft.study.basic.sort;

/**
 * @description: 冒泡排序
 * @author: crq
 * @create: 2021-09-24 23:16
 **/
public class BubbleSort {
    /**
     * 冒泡排序1
     *
     * @param a 数组
     * @param n 排序趟数
     */
    public static void bubbleSort1(int[] a, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序2
     *
     * @param a 数组
     * @param n 排序趟数
     */
    public static void bubbleSort2(int[] a, int n) {
        int i, j;
        //发生交换为true 没发生为false
        boolean flag = true;
        while (flag) {
            flag = false;
            for (j = 1; j < n ; j++) {
                if (a[j - 1] > a[j]) {
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                    flag = true;
                }
            }
            n--; //每循环一次就减小一次排序的边界
        }



    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 0, 1, 9, 5, 13, 4, 2, 8, 3, 66, 21};
//        BubbleSort.bubbleSort1(arr, arr.length);
        BubbleSort.bubbleSort2(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}
