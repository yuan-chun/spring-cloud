package com.yuanchun.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//配置中心使用eureka注册到注册中心后，配置文件会从远程读取
public class AppConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class, args);
    }

}
