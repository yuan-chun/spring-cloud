package com.yuanchun.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppMemberService {
    public static void main(String[] args) {
        SpringApplication.run(AppMemberService.class, args);
    }
}
