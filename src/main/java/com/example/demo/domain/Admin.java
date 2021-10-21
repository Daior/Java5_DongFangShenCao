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
public class Admin {
    private Integer id;
    private String name;
    private String password;
    private Boolean limits;
    private String memo;
}
