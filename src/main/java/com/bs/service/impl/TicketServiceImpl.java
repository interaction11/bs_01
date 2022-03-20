package com.bs.service.impl;

import com.bs.dao.TicketMapper;
import com.bs.entity.Ticket;
import com.bs.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Resource
    private TicketMapper ticketMapper;

    @Override
    public List<Ticket> queryAll() {
        return null;
    }

    @Override
    public List<Ticket> queryByTime(Integer time) {
        return ticketMapper.selectByTime(time);
    }

    @Override
    public Ticket queryByType(String Type) {
        return null;
    }

    @Override
    public Integer insertOne(Ticket card) {
        return 0;
    }

    @Override
    public Integer delByType(String Type) {
        return 0;
    }

    @Override
    public Integer queryPrice(String type) {
        return ticketMapper.selectPrice(type);
    }

    @Override
    public Integer changeTicket(Ticket ticket) {
        return ticketMapper.updateByPrimaryKey(ticket);
    }
}
