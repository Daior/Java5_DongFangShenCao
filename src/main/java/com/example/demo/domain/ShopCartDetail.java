package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购物车详情
 */
@Data //注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor
@NoArgsConstructor
public class ShopCartDetail {
    private Integer id;
    private Integer user_id;
    private Integer commodity_id;
    private Integer buy_number;
}
