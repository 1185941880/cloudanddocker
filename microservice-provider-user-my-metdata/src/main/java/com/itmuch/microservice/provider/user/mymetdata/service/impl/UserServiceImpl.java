package com.itmuch.microservice.provider.user.mymetdata.service.impl;

import com.itmuch.microservice.provider.user.mymetdata.entity.User;
import com.itmuch.microservice.provider.user.mymetdata.mapper.UserMapper;
import com.itmuch.microservice.provider.user.mymetdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    public User getUserById(Long id){
        User user = this.userMapper.selectById(id);
        return user;
    }
}
