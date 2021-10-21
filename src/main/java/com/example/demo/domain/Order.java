package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 订单
 */
@Data //注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer user_id;
    private Integer order_number;
    private Double total_price;
}
