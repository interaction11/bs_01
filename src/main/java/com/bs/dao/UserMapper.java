package com.bs.dao;

import com.bs.entity.User;

public interface UserMapper {
    Integer insertUser(User user);
    User selectByUsername(String username);
    Integer deleteByUsername(String username);
    Integer updateByUsername(Integer balance,String username);
    Integer selectBalance(String username);
}
