package com.bs.service;

import com.bs.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> queryAll();
    List<Ticket> queryByTime(Integer time);
    Ticket queryByType(String Type);
    Integer insertOne(Ticket card);
    Integer delByType(String Type);
    Integer queryPrice(String type);
    Integer changeTicket(Ticket ticket);
}
