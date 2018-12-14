package com.yuanchun.oeder.api.controller;

import com.yuanchun.oeder.api.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping("/callMemberService")
    public String callMemberService(){
        return memberService.callMemberService();
    }
}
