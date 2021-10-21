package com.example.demo.service.impl;


import com.example.demo.domain.Commodity;
import com.example.demo.domain.User;
import com.example.demo.mapper.CommodityMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.CommodityService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //开启事务
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;


    @Override
    public List<Commodity> queryCommodityList() {
        return commodityMapper.queryCommodityList();
    }

    @Override
    public void add(Commodity commodity) {
        commodityMapper.add(commodity);
    }

    @Override
    public void delete(Integer id) {
        commodityMapper.delete(id);
    }

    @Override
    public void update(Commodity commodity) {
        commodityMapper.update(commodity);
    }

    @Override
    public Commodity findById(int id) {
        Commodity commodity = commodityMapper.findById(id);
        return commodity;
    }
}
