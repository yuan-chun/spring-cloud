package com.yuanchun.oeder.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {
    @Value("${server.port}")
    private String port ;
    /**
     * 通过 zuul 实现路由转发调用负载均衡
     * 客户端 -> zuul(转发，轮询) -> 服务中心（当前）
     * @return
     */
    @RequestMapping("/callOrderService")
    public String callOrderService(){
        return "callservice by zuul this is order service port is " + port;
    }
}
