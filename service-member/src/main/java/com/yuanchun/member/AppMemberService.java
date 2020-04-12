package com.yuanchun.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//hystris 既可以放在提供端，也可以放在消费端
public class AppMemberService {
    public static void main(String[] args) {
        SpringApplication.run(AppMemberService.class, args);
    }
}
