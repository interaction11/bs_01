package com.bs.service;

import com.bs.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> queryAll();
    Card queryById(Integer id);
    Integer createOne(Card card);
    Integer delById(Integer id);
}
