package com.soft.study.basic.method;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-14 18:29
 **/
@AllArgsConstructor
@NoArgsConstructor
public class ReturnObject {
    private Integer max;
    private Integer min;
    private Integer sum;

    @Override
    public String toString() {
        return "ReturnObject{" +
                "max=" + max +
                ", min=" + min +
                ", sum=" + sum +
                '}';
    }
}
