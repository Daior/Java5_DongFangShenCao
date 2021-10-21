package com.example.demo.service.impl;


import com.example.demo.domain.Admin;
import com.example.demo.domain.User;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //开启事务
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }

    @Override
    public void changepass(Admin admin) {
        adminMapper.changepass(admin);
    }
}
