package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //用户登录
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.login(user);
    }

    //用户注册
    @PostMapping("register")
    public String register(@RequestBody User user) {
        String info;
        if (userService.queryByusername(user.getUsername())!=null){
            info="注册失败，用户名已存在请重新输入用户名";
        }else if (userService.queryByphonenumber(user.getPhonenumber())!=null){
            info="注册失败，该号码已经被注册请重新输入手机号";
        }else {
            System.out.println("接受的user：" + user);
            info="注册成功";
            user.setIsvalid(true);
            userService.register(user);
        }
        return info;
    }

    //根据用户名密码查找id
    @PostMapping("findId")
    public int findId(@RequestBody User user) {
        int id = userService.findId(user);
        return id;
    }

    //根据id查询用户信息
    @GetMapping("getUserById")
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }
}
