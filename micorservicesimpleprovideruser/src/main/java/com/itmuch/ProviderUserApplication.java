package com.itmuch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itmuch.mapper")
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
