package com.soft.study.java8.predicate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-25 14:33
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String bookName;
    private Integer bookPrice;
}
