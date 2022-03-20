package com.bs.controller;

import com.bs.entity.Ticket;
import com.bs.service.TicketService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/bs/ticket")
public class TicketController {

    @Resource
    private TicketService ticketservice;

    @GetMapping("/time/{time}")
    public List<Ticket> query01(@PathVariable Integer time){
        List<Ticket> list = ticketservice.queryByTime(time);
        return list;
    }

    @PutMapping("/changeData/{type}/{title}/{price}/{time}")
    public int changeData(@PathVariable String type,@PathVariable String title,
                                   @PathVariable Integer price,
                                   @PathVariable Integer time){
        Ticket ticket = new Ticket();
        ticket.setType(type);
        ticket.setTitle(title);
        ticket.setPrice(price);
        ticket.setTime(time);
        return ticketservice.changeTicket(ticket);
    }
}
