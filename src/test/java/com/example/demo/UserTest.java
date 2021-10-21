package com.example.demo;


import com.example.demo.domain.Admin;
import com.example.demo.domain.Commodity;
import com.example.demo.domain.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.CommodityService;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private CommodityService commodityService;

    @Test
    public void testQuery() {
        List<User> users =  userService.queryUserList();
        for (User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void findByUsernamePassword() {
        User user=new User();
        user.setUsername("金123");
        user.setPassword("123");
        System.out.println(userService.login(user));
    }

    @Test
    public void findId() {
        User user=new User();
        user.setUsername("张123");
        user.setPassword("123");
        System.out.println(userService.findId(user));
    }

    @Test
    public void getUserById() {
        System.out.println(userService.getUserById(2));
    }

    @Test
    public void testcommodity() {
        List<Commodity> commodityList = commodityService.queryCommodityList();
        for (Commodity commodity:commodityList){
            System.out.println(commodity);
        }
    }

    @Test
    public void testfindById() {
        Commodity commodity = commodityService.findById(2);
        System.out.println(commodity);
    }

    @Test
    public void findById() {
        Admin admin=new Admin();
        admin.setName("金123");
        admin.setPassword("123");
        System.out.println(adminService.login(admin));
    }
}
