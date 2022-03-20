package com.bs.controller;

import com.bs.entity.Queued;
import com.bs.service.QueuedService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/bs/queued")
public class QueuedController {

    @Resource
    private QueuedService queuedService;


    @GetMapping("/All/{username}")
    public List<Queued> All(@PathVariable String username){
        return queuedService.queryAll(username);
    }

    @PostMapping("/getNum/{card_id}/{username}")
    public int getNum(@PathVariable Integer card_id,@PathVariable String username){
        Queued queued = new Queued();
        queued.setCard_id(card_id);
        queued.setUsername(username);
        return queuedService.creatQueued(queued);
    }


    @PutMapping("/changeNum/{card_id}")
    public int changeNum(@PathVariable Integer card_id){
        String username = queuedService.queryUsername(card_id);
        if(username == null){
            return -1;
        }
        int i = queuedService.delQueued(card_id,username);
        if (i != 1){
            return 0;
        }
        queuedService.changeNum(card_id);
        return i;
    }
}
