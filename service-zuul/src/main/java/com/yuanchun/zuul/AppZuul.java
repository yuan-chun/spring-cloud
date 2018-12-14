package com.yuanchun.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 实现外部访问统一入口的基础
 * 过滤器功能则负责对请求的处理过程进行干预，是实现请求校验，服务聚合等功能的基础
 */
@EnableZuulProxy//开启网关
@SpringCloudApplication
public class AppZuul {

    public static void main(String[] args) {
        SpringApplication.run(AppZuul.class,args);
    }

}
