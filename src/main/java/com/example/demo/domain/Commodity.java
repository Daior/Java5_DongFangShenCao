package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {

    private Integer id;
    private String name;
    private String specifications;
    private Double price;
    private Integer stock;
    private String imgurl;
    private String introduce;
    private String memo;

}
