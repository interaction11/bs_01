package com.bs.dao;

import com.bs.entity.Queued;

import java.util.List;

public interface QueuedMapper {
    Integer insertQueued(Queued queued);
    List<Queued> selectAll(String username);
    Integer deleteQueued(Integer card_id,String username);
    Integer updateNum(Integer card_id);
    List<Queued> selectById(Integer card_id);
    Queued selectRepeat(Integer card_id,String username);
    String selectUsername(Integer card_id);

}
