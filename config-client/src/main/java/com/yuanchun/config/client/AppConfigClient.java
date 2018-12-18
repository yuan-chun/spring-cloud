package com.yuanchun.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//因此读取configService会端口冲突
public class AppConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class, args);
    }

}
