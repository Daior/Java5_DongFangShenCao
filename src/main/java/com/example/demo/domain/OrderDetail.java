package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单详情
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    private Integer id;
    private Integer order_id;
    private Integer commodity_id;
    private Integer user_id;
    private String commodity_name;
    private Integer number;
    private Double price;
    private Double total_price;
}
