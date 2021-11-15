package study.basic.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 选择排序
 * @author: crq
 * @create: 2021-10-04 23:00
 **/
@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int j : arr) {
            log.info(j + " ");
        }
    }

}
