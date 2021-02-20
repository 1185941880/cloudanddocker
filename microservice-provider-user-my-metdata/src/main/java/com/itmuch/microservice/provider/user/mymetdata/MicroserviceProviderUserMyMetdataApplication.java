package com.itmuch.microservice.provider.user.mymetdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.itmuch.microservice.provider.user.mymetdata.mapper")
@SpringBootApplication
public class MicroserviceProviderUserMyMetdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserMyMetdataApplication.class, args);
	}

}
