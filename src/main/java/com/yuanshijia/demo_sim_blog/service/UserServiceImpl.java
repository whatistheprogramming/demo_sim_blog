package com.yuanshijia.demo_sim_blog.service;

import com.yuanshijia.demo_sim_blog.entity.User;
import com.yuanshijia.demo_sim_blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;   //报红不影响。。。
    
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
        
    }
}
