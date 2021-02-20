package com.itmuch.service.impl;

import com.itmuch.entity.User;
import com.itmuch.mapper.UserMapper;
import com.itmuch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserbyId(Long id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
