package com.yizheng.microservice.demo.controller;

import com.yizheng.microservice.demo.dao.TbUser;
import com.yizheng.microservice.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yizheng
 * @date 2020/5/21 11:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/userList")
    public List<TbUser> getAllUsers(){
        List<TbUser> list = userService.getAllUsers();
        return list;
    }

    @RequestMapping("delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
