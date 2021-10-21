package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User login(User user) {
        return userMapper.findByUsernamePassword(user);
    }

    @Override
    public void register(User user) {
        userMapper.save(user);
    }

    @Override
    public User queryByusername(String username) {
        User user= userMapper.queryByusername(username);
        return user;
    }

    @Override
    public User queryByphonenumber(Integer phonenumber) {
        User user = userMapper.queryByphonenumber(phonenumber);
        return user;
    }

    @Override
    public int findId(User user) {
        User user1 = userMapper.findByUsernamePassword(user);
        return user1.getId();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
