package com.example.demo.service;


import com.example.demo.domain.Admin;

public interface AdminService {

    /**
     * 管理员登录
     * @param admin
     * @return
     */
    Admin login(Admin admin);

    /**
     * 修改密码
     * @param admin
     */
    void changepass(Admin admin);
}
