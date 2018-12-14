package com.yuanchun.member.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {

    @RequestMapping("/getMemberService")
    public String getMemberService(){

        return "this is service-member";
    }
}
