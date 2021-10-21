package com.example.demo.controller;

import com.example.demo.domain.Commodity;
import com.example.demo.domain.ShopCartDetail;
import com.example.demo.service.CommodityService;
import com.example.demo.service.ShopCartDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shopcartdetail")
public class ShopCartDetailController {

    @Autowired
    private ShopCartDetailService shopCartDetailService;

    //添加商品到购物车详情
    @PostMapping("save")
    public String save(@RequestBody ShopCartDetail shopCartDetail) {
        shopCartDetailService.save(shopCartDetail);
        return "添加成功";
    }

}
