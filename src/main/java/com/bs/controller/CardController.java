package com.bs.controller;

import com.bs.entity.Card;
import com.bs.service.CardService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/bs/card")
public class CardController {

    @Resource
    private CardService cardService;

    @GetMapping("/All")
    public List<Card> query01(){
        //List<Card> list = cardService.queryAll();
        return cardService.queryAll();
    }

    @GetMapping("/{id}")
    public String query02(@PathVariable Integer id){
        Card card = cardService.queryById(id);
        return card.toString();
    }

    @PostMapping("/new/{title}/{text}/{url}/{tag}")
    public int insert(@PathVariable String title,@PathVariable String text,@PathVariable String url,
                      @PathVariable String tag){
        Card card = new Card();
        card.setTitle(title);
        card.setText(text);
        card.setUrl("img/card/"+url+".png");
        card.setTag(tag);
        return cardService.createOne(card);
    }

}
