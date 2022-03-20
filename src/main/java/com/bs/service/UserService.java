package com.bs.service;

import com.bs.entity.User;

public interface UserService {
    Integer insertOne(User user);
    User queryByUsername(String username);
    Integer deleteOne(User user);
    Integer queryBalance(String username);
    Integer changeBalance(Integer balance,String username);
}
