package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserList();

    /**
     * 用过用户名密码查询用户
     */
    User findByUsernamePassword(User user);

    /**
     * 保存用户信息
     * @param user
     */
    void save(User user);

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
     * 通过id查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
