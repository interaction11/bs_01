package com.bs.service.impl;

import com.bs.dao.UserMapper;
import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer insertOne(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User queryByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public Integer deleteOne(User user) {
        return 0;
    }

    @Override
    public Integer queryBalance(String username) {
        return userMapper.selectBalance(username);
    }

    @Override
    public Integer changeBalance(Integer balance, String username) {
        return userMapper.updateByUsername(balance,username);
    }
}
