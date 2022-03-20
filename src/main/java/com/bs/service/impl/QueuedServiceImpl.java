package com.bs.service.impl;

import com.bs.dao.CardMapper;
import com.bs.dao.GoodsMapper;
import com.bs.dao.QueuedMapper;
import com.bs.entity.Card;
import com.bs.entity.Goods;
import com.bs.entity.Queued;
import com.bs.service.CardService;
import com.bs.service.GoodsService;
import com.bs.service.QueuedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueuedServiceImpl implements QueuedService {

    @Resource
    private QueuedMapper queuedMapper;
    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private CardMapper cardMapper;

    @Override
    public Integer creatQueued(Queued queued) {
        Integer card_id = queued.getCard_id();
        String username = queued.getUsername();
        if (queuedMapper.selectRepeat(card_id,username) != null){
            return -1;
        }
        Card card = cardMapper.selectByPrimaryKey(card_id);
        queued.setCard_name(card.getTitle());
        Goods goods = goodsMapper.selectToken(username);
        if (goods == null){
            return 0;
        }
        queued.setTicket_id(goods.getId());
        List<Queued> id= queuedMapper.selectById(card_id);
        queued.setNum(id.size()+1);
        return queuedMapper.insertQueued(queued);
    }

    @Override
    public List<Queued> queryAll(String username) {
        return queuedMapper.selectAll(username);
    }

    @Override
    public Integer delQueued(Integer card_id,String username) {
        return queuedMapper.deleteQueued(card_id,username);
    }

    @Override
    public Integer changeNum(Integer card_id) {
        return queuedMapper.updateNum(card_id);
    }

    @Override
    public String queryUsername(Integer card_id) {
        return queuedMapper.selectUsername(card_id);
    }
}
