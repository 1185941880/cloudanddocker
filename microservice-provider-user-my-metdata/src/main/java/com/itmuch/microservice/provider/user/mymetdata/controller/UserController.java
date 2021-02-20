package com.itmuch.microservice.provider.user.mymetdata.controller;

import com.itmuch.microservice.provider.user.mymetdata.entity.User;
import com.itmuch.microservice.provider.user.mymetdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User userById = userService.getUserById(id);
        return userById;
    }
}
