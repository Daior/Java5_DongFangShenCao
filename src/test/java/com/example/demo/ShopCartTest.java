package com.example.demo;

import com.example.demo.domain.ShopCartDetail;
import com.example.demo.domain.User;
import com.example.demo.service.CommodityService;
import com.example.demo.service.ShopCartDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class ShopCartTest {

    @Autowired
    private ShopCartDetailService shopCartDetailService;

    @Test
    public void save() {
        ShopCartDetail shopCartDetail = new ShopCartDetail();
        shopCartDetail.setUser_id(1);
        shopCartDetail.setCommodity_id(4);
        shopCartDetail.setBuy_number(8);
        shopCartDetailService.save(shopCartDetail);
    }
}
