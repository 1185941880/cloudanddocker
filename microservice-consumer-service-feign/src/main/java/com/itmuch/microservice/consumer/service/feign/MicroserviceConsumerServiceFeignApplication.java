package com.itmuch.microservice.consumer.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceConsumerServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerServiceFeignApplication.class, args);
	}

}
