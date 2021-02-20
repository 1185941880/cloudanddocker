package com.itmuch.controller;


import com.itmuch.entity.User;
import com.itmuch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("get/{id}")
    public User findUserById(@PathVariable("id") Long id){
        User user = userService.findUserbyId(id);
        return user;

    }
}
