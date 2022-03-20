package com.bs.dao;

import com.bs.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    Integer insertOrder(Goods goods);
    List<Goods> selectAll(String username);
    Goods selectToken(String username);
    Integer updateToken(Integer id,String username,String ticket_type);
    Integer deleteToken(String username,String ticket_type);
    Integer selectMinId(String username,String ticket_type);
}
