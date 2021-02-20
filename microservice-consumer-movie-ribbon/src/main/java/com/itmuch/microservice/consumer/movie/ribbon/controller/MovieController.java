package com.itmuch.microservice.consumer.movie.ribbon.controller;

import com.itmuch.microservice.consumer.movie.ribbon.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class MovieController {
   // private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;



    @GetMapping("movie/getUser")
    public User getUser(){
        return restTemplate.getForObject("http://provider-user/getUser",User.class);
    }

    @GetMapping("log-user-instance")
    public void getUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("provider-user");
        System.out.println(serviceInstance.getServiceId());
        System.out.println(serviceInstance.getHost());
        System.out.println(serviceInstance.getPort());
    }
}
