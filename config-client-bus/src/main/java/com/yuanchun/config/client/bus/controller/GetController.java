package com.yuanchun.config.client.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class GetController {

    @Value("${neo.hello}")
    private String eilriis;


    //http:localhost:8050/getFromConfigServer
    //cmd 执行刷新客户端 curl -X POST http://localhost:8050/refresh
    @RequestMapping("/getFromConfigServer")
    public String getFromConfigServer(){
        return "eureka.instance.lease-renewal-interval-in-seconds = "+eilriis;
    }

}
