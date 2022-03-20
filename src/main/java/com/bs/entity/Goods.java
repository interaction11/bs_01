package com.bs.entity;

import java.sql.Date;

public class Goods {
    private Integer id;
    private String username;
    private String ticket_type;
    private String ticket_title;
    private Integer ticket_price;
    private Integer is_delete;
    private Date creat_time;

    public Goods() {
    }

    public Goods(Integer id, String username, String ticket_type, String ticket_title, Integer ticket_price,
                 Integer is_delete, Date creat_time) {
        this.id = id;
        this.username = username;
        this.ticket_type = ticket_type;
        this.ticket_title = ticket_title;
        this.ticket_price = ticket_price;
        this.is_delete = is_delete;
        this.creat_time = creat_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public String getTicket_title() {
        return ticket_title;
    }

    public void setTicket_title(String ticket_title) {
        this.ticket_title = ticket_title;
    }

    public Integer getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(Integer ticket_price) {
        this.ticket_price = ticket_price;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", ticket_type='" + ticket_type + '\'' +
                ", ticket_title='" + ticket_title + '\'' +
                ", ticket_price=" + ticket_price +
                ", is_delete=" + is_delete +
                ", creat_time=" + creat_time +
                '}';
    }
}
