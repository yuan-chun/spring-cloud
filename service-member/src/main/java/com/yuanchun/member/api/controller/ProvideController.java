package com.yuanchun.member.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//此项目忽略了service层
public class ProvideController {
    @Value("${server.port}")
    private String port ;

    /**
     * 服务提供者，提供给 order 调用
     * 通过 RestTemplate ribbon 实现调用其他服务中心负载均衡接口
     * 客户端 -> 服务中心-> 其他服务中心(轮询)（当前）
     * @return
     */
    @RequestMapping("/getMemberService")
    public String getMemberService(){
        //省略向 service 的调用，直接返回。
        try {//超时
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is service-member and port = " + port;
    }

}
