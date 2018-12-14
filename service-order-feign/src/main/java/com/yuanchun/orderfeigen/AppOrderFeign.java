package com.yuanchun.orderfeigen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppOrderFeign {
    public static void main(String[] args) {
        SpringApplication.run(AppOrderFeign.class,args);
    }
}
