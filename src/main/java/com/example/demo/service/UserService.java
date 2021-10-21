package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserList();

    /**
     * 登录判断用户名密码是否正确
     */
    User login(User user);

    /**
     * 注册
     * @param user
     */
    void register(User user);

    /**
     * 通过用户名查询用户
     * @param username
     */
    User queryByusername(String username);

    /**
     * 通过电话查询用户
     * @param phonenumber
     */
    User queryByphonenumber(Integer phonenumber);

    /**
     * 通过用户名密码获取id
     */
    int findId(User user);

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
