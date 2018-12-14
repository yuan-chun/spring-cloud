package com.yuanchun.member.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @Value("${server.port}")
    private String port ;

    @RequestMapping("/getMemberService")
    public String getMemberService(){

        return "this is service-member and port = " + port;
    }
}
