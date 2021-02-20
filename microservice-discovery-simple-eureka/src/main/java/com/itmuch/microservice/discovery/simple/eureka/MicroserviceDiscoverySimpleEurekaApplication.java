package com.itmuch.microservice.discovery.simple.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoverySimpleEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoverySimpleEurekaApplication.class, args);
	}

}
