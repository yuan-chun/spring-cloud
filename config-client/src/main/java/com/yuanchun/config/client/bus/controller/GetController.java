package com.yuanchun.config.client.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class GetController {

    @Value("${zuul.add-host-header}")
    private String eilriis;

    //http:localhost:8051/getFromConfigServer
    //git 上的配置文件修改时，config-server 可以获得最新的，但是config-client无法更新，因为缓存
    @RequestMapping("/getFromConfigServer")
    public String getFromConfigServer(){
        return "eureka.instance.lease-renewal-interval-in-seconds = "+eilriis;
    }

}
