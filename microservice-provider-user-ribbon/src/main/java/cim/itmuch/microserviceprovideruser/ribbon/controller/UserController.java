package cim.itmuch.microserviceprovideruser.ribbon.controller;

import cim.itmuch.microserviceprovideruser.ribbon.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUser")
    public User getUser(){
        User wwl = new User(1, 2, "wwl");
        return wwl;
    }


}
