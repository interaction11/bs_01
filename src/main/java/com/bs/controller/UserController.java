package com.bs.controller;

import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Transactional
@RestController
@RequestMapping("/bs/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login/{type}/{username}/{pwd}")
    public String login(@PathVariable Integer type,@PathVariable String username,@PathVariable String pwd){
        User user = userService.queryByUsername(username);
        if (user == null){
            return "0";
        }else if(user.getPwd().equals(pwd)&&user.getType().equals(type)){
            return username;
        }
        return "-1";
    }

    @PostMapping("/register/{username}/{pwd}")
    public int register(@PathVariable String username,@PathVariable String pwd){
        User user = new User();
        user.setType(0);
        user.setUsername(username);
        user.setPwd(pwd);
        user.setBalance(0);
        return userService.insertOne(user);
    }

    @GetMapping("/balance/{username}")
    public int selectBalance(@PathVariable String username){
        return userService.queryBalance(username);
    }

    @PutMapping("/addBalance/{balance}/{username}")
    public int addBalance(@PathVariable Integer balance,@PathVariable String username){
        return userService.changeBalance(balance,username);
    }
}
