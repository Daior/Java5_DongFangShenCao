package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购物车
 */
@Data //注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor
@NoArgsConstructor
public class ShopCart {
    private Integer user_id;
    private Integer total;
    private Double total_price;
    private String memo;
}
