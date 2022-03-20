package com.bs.service;

import com.bs.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryAll(String username);
    Integer addOne(Goods goods);
    Goods queryOne(String username);
    Integer changeToken(String username,String ticket_type);
    Integer delToken(String username,String ticket_type);
}
