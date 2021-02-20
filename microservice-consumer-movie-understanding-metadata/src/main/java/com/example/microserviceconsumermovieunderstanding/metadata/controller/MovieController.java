package com.example.microserviceconsumermovieunderstanding.metadata.controller;

import com.example.microserviceconsumermovieunderstanding.metadata.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/movie/get/{id}")
    public User getUserById(@PathVariable("id") Long id){
       return restTemplate.getForObject("http://localhost:8080/get/"+id,User.class);
    }

    @GetMapping("user-instance")
    public List<ServiceInstance> showInfo(){
        return this.discoveryClient.getInstances("microservice-user-metdata");
    }

}
