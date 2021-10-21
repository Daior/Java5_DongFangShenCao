package com.example.demo.controller;

import com.example.demo.domain.Admin;
import com.example.demo.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Api("管理员信息")
@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //用户登录
    @PostMapping("/login")
    public Integer login(@RequestBody Admin admin) {
        int info;
        if (adminService.login(admin)==null){
            info = 0;
        }else {
            info = 1;
        }
        return info;
    }

    @PostMapping("/changepassword")
    public String changepass(@RequestBody Admin admin){
        adminService.changepass(admin);
        return "ok";
    }

}
