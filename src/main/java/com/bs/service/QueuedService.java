package com.bs.service;

import com.bs.entity.Queued;

import java.util.List;

public interface QueuedService {
    Integer creatQueued(Queued queued);
    List<Queued> queryAll(String username);
    Integer delQueued(Integer card_id,String username);
    Integer changeNum(Integer card_id);
    String queryUsername(Integer card_id);
}
