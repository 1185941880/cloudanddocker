package com.itmuch.microservice.discovery.eureka.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryEurekaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekaSecurityApplication.class, args);
	}

}
