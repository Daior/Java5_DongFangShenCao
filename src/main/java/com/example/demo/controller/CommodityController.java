package com.example.demo.controller;

import com.example.demo.domain.Commodity;
import com.example.demo.service.CommodityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    //根据id查询商品信息
    @GetMapping("/findById")
    public Commodity findById(@RequestParam(value = "id",defaultValue = "1") Integer id) {
        Commodity commodity = commodityService.findById(id);
        return commodity;
    }

    //商品信息列表
    @GetMapping("query")
    public List<Commodity> queryCommodityList(){
        return commodityService.queryCommodityList();
    }

    @PostMapping("update")
    public String update(@RequestBody Commodity commodity){
        System.out.println("接收的参数:"+commodity);
        commodityService.update(commodity);
        return "ok";
    }

    @GetMapping("delete")
    public String delete(Integer id){
        commodityService.delete(id);
        return "删除成功";
    }

    @PostMapping("add")
    public String add(@RequestBody Commodity commodity){
        System.out.println("接收的参数:"+commodity);
        commodityService.add(commodity);
        return "ok";
    }


}
