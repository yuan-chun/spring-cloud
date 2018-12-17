package com.yuanchun.config.server.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer

public class AppConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class, args);
    }


}
