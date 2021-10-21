package com.example.demo.mapper;

import com.example.demo.domain.Admin;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

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
