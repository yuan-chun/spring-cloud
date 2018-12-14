package com.yuanchun.member.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String port ;

    @RequestMapping("/getMemberService")
    public String getMemberService(){
        //省略向 service 的调用，直接返回。
        return "this is service-member and port = " + port;
    }
}
