package com.bs.service.impl;

import com.bs.dao.CardMapper;
import com.bs.entity.Card;
import com.bs.service.CardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Resource
    private CardMapper cardMapper;

    @Override
    public List<Card> queryAll() {
        return cardMapper.selectAll();
    }

    @Override
    public Card queryById(Integer id) {
        return cardMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer createOne(Card card) {
        return cardMapper.insertOne(card);
    }

    @Override
    public Integer delById(Integer id) {
        return cardMapper.deleteByPrimaryKey(id);
    }
}
