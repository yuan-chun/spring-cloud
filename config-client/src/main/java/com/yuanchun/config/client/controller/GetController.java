package com.yuanchun.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class GetController {

    @Value("${eureka.instance.lease-renewal-interval-in-seconds}")
    private String eilriis;

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String ecsd;

    @RequestMapping("/getFromConfigServer")
    public String getFromConfigServer(){
        return "eureka.instance.lease-renewal-interval-in-seconds = "+eilriis
                +"  eureka.client.serviceUrl.defaultZone"  + ecsd;
    }

}
