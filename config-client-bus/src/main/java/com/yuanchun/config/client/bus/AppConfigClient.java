package com.yuanchun.config.client.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//单节点模式注释此注解，否则找不到server
@EnableEurekaClient
public class AppConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class, args);
    }

}
