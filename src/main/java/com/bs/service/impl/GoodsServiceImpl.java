package com.bs.service.impl;

import com.bs.dao.GoodsMapper;
import com.bs.dao.TicketMapper;
import com.bs.dao.UserMapper;
import com.bs.entity.Goods;
import com.bs.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private TicketMapper ticketMapper;

    @Override
    public List<Goods> queryAll(String username) {
        return goodsMapper.selectAll(username);
    }

    @Override
    public Integer addOne(Goods goods) {
        String username = goods.getUsername();
        String type = goods.getTicket_type();
        String title = ticketMapper.selectTitle(type);
        int balance = userMapper.selectBalance(username);
        int price = ticketMapper.selectPrice(type);
        goods.setTicket_price(price);
        goods.setTicket_title(title);
        int count = balance-price;
        if (count < 0){
            return 0;
        }
        int x = userMapper.updateByUsername(count,username);
        if (x != 1){
            return 0;
        }
        return goodsMapper.insertOrder(goods);
    }

    @Override
    public Goods queryOne(String username) {
        return null;
    }

    @Override
    public Integer changeToken(String username,String ticket_type) {
        if (goodsMapper.selectToken(username) != null){
            return 0;
        }
        Integer id = goodsMapper.selectMinId(username,ticket_type);
        if(id == null){
            return -1;
        }
        return goodsMapper.updateToken(id,username,ticket_type);
    }

    @Override
    public Integer delToken(String username,String ticket_type) {
        return goodsMapper.deleteToken(username,ticket_type);
    }
}
