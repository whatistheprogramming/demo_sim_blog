package com.yuanshijia.demo_sim_blog.mapper;

import com.yuanshijia.demo_sim_blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    List<User> getAllUser();
}