package com.poicc.basedao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @description: 实体类DO
 * @author: crq
 * @create: 2021-11-15 08:02
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String name;
    private Double price;
    private LocalDate published;
}
