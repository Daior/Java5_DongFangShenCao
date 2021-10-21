package com.example.demo.service.impl;

import com.example.demo.domain.ShopCartDetail;
import com.example.demo.domain.User;
import com.example.demo.mapper.ShopCartDetailMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.ShopCartDetailService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShopCartDetailImpl implements ShopCartDetailService {

    @Autowired
    private ShopCartDetailMapper shopCartDetailMapper;

    @Override
    public void save(ShopCartDetail shopCartDetail) {
        shopCartDetailMapper.save(shopCartDetail);
    }
}
