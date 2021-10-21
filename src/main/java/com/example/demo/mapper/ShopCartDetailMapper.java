package com.example.demo.mapper;

import com.example.demo.domain.ShopCartDetail;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopCartDetailMapper {


    /**
     * 添加购物信息到购物车明细
     * @param shopCartDetail
     */
    void save(ShopCartDetail shopCartDetail);


}
