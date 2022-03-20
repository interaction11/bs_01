package com.bs.controller;


import com.bs.entity.Goods;
import com.bs.service.GoodsService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/bs/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/All/{username}")
    public List<Goods> selectGoods(@PathVariable String username){
        return goodsService.queryAll(username);
    }


    @PostMapping("/add/{username}/{order_type}")
    public int addOne(@PathVariable String username,@PathVariable String order_type){
        Goods goods = new Goods();
        goods.setUsername(username);
        goods.setTicket_type(order_type);
        return goodsService.addOne(goods);
    }

    @Transactional
    @PutMapping("/getToken/{username}/{ticket_type}")
    public int getToken(@PathVariable String username,@PathVariable String ticket_type){
        return goodsService.changeToken(username,ticket_type);
    }

    @DeleteMapping ("/delToken/{username}/{ticket_type}")
    public int delToken(@PathVariable String username,@PathVariable String ticket_type){
        return goodsService.delToken(username,ticket_type);
    }
}
