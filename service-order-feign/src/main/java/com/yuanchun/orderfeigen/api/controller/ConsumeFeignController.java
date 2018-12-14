package com.yuanchun.orderfeigen.api.controller;

import com.yuanchun.orderfeigen.api.service.IConsumeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeFeignController {
    @Autowired
    private IConsumeFeignService memberFeignService;

    @RequestMapping("/callMemberService")
    public String callMemberService(){
        return memberFeignService.callMemberService();
    }
}
