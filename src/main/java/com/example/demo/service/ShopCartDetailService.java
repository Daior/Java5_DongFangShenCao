package com.example.demo.service;

import com.example.demo.domain.ShopCartDetail;
import com.example.demo.domain.User;

import java.util.List;

public interface ShopCartDetailService {

    /**
     * 添加购物信息到购物车明细
     * @param shopCartDetail
     */
    void save(ShopCartDetail shopCartDetail);


}
