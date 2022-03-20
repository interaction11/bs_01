package com.bs.dao;

import com.bs.entity.Card;

import java.util.List;

public interface CardMapper {
    Integer deleteByPrimaryKey(Integer id);

    Integer insertOne(Card record);

    Integer insertSelective(Card record);

    Card selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(Card record);

    Integer updateByPrimaryKey(Card record);

    List<Card> selectAll();
}