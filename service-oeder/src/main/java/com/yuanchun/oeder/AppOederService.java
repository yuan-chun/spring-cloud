package com.yuanchun.oeder;

import com.yuanchun.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableDiscoveryClient
//切换ribbon负载均衡
@RibbonClient(name = "SERVICE-MEMBER",configuration = MyRule.class)
public class AppOederService {
    public static void main(String[] args) {
        SpringApplication.run(AppOederService.class,args);
    }

    @Bean//ioc注入
    @LoadBalanced//开启ribbon负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
