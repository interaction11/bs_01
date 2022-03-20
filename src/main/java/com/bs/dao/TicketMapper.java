package com.bs.dao;

import com.bs.entity.Ticket;

import java.util.List;

public interface TicketMapper {
    Integer deleteByPrimaryKey(String type);

    Integer insert(Ticket record);

    Integer insertSelective(Ticket record);

    Ticket selectByPrimaryKey(String type);

    List<Ticket> selectByTime(Integer time);

    Integer updateByPrimaryKeySelective(Ticket record);

    Integer updateByPrimaryKey(Ticket record);

    Integer selectPrice(String type);

    String selectTitle(String type);


}