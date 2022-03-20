package com.bs.entity;

import java.sql.Date;

public class Queued {
    private Integer card_id;
    private String card_name;
    private String username;
    private Integer ticket_id;
    private Date creat_time;
    private Integer Num;

    public Queued() {
    }

    public Queued(Integer card_id, String card_name, String username, Integer ticket_id, Date creat_time,
                  Integer num) {
        this.card_id = card_id;
        this.card_name = card_name;
        this.username = username;
        this.ticket_id = ticket_id;
        this.creat_time = creat_time;
        Num = num;
    }


    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Integer getNum() {
        return Num;
    }

    public void setNum(Integer num) {
        Num = num;
    }

    @Override
    public String toString() {
        return "Queued{" +
                "card_id=" + card_id +
                ", card_name='" + card_name + '\'' +
                ", username='" + username + '\'' +
                ", ticket_id=" + ticket_id +
                ", creat_time=" + creat_time +
                ", Num=" + Num +
                '}';
    }
}
