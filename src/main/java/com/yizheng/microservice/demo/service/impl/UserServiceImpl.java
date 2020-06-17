package com.yizheng.microservice.demo.service.impl;

import com.yizheng.microservice.demo.dao.TbUser;
import com.yizheng.microservice.demo.mapper.TbUserMapper;
import com.yizheng.microservice.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yizheng
 * @date 2020/5/21 11:32
 */

@Service
public class UserServiceImpl implements UserService {

    private Logger log  = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> getAllUsers() {
        return tbUserMapper.getAllUsers();
    }

    @Override
    public void deleteUser(Integer id) {
        log.debug("删除id",id);

        List<TbUser> allUsers = tbUserMapper.getAllUsers();
    }

    public static void main(String[] args) {
        System.out.println();
        int i;

        List list = new ArrayList();


    }
}
