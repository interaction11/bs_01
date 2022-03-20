package com.bs.entity;

import java.util.Date;

public class Ticket {
    private String type;

    private String title;

    private Integer price;

    private Integer time;

    private Date creatTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", time=" + time +
                ", creatTime=" + creatTime +
                '}';
    }
}