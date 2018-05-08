package com.yuanshijia.demo_sim_blog.controller;

import com.yuanshijia.demo_sim_blog.entity.User;
import com.yuanshijia.demo_sim_blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUser();

    }
}
