package com.yizheng.microservice.demo.service;

import com.yizheng.microservice.demo.dao.TbUser;

import java.util.List;

/**
 * @author yizheng
 * @date 2020/5/21 11:30
 */
public interface UserService {

    List<TbUser>  getAllUsers();

    void deleteUser(Integer id);
}
