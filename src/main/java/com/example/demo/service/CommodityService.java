package com.example.demo.service;


import com.example.demo.domain.Commodity;
import com.example.demo.domain.User;

import java.util.List;

public interface CommodityService {

    /**
     * 查询所有商品
     * @return
     */
    List<Commodity> queryCommodityList();

    /**
     * 增加商品
     * @param commodity
     */
    void add(Commodity commodity);

    /**
     * 删除商品
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改商品信息
     * @param commodity
     */
    void update(Commodity commodity);

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    Commodity findById(int id);
}
