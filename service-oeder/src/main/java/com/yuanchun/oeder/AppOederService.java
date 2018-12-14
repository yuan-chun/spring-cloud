package com.yuanchun.oeder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppOederService {
    public static void main(String[] args) {
        SpringApplication.run(AppOederService.class,args);
    }
}
