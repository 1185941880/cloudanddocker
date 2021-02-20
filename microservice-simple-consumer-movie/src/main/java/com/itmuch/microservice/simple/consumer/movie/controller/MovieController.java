package com.itmuch.microservice.simple.consumer.movie.controller;

import com.itmuch.microservice.simple.consumer.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public User findUserById(@PathVariable("id") Long id){
        return this.restTemplate.getForObject("http://localhost:8080/get/"+id,User.class);
    }
}
