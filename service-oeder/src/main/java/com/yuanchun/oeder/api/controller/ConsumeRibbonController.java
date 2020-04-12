package com.yuanchun.oeder.api.controller;

import com.yuanchun.oeder.api.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeRibbonController {

    @Autowired
    private IMemberService memberService;

    /**
     * 服务消费者
     * 通过 RestTemplate ribbon 实现调用其他服务中心负载均衡接口
     * 客户端 -> 服务中心（当前）-> 其他服务中心(轮询)
     * @return
     */
    //http://localhost:8201/callMemberService
    @RequestMapping("/callMemberService")
    public String callMemberService(){
        return memberService.callMemberService();
    }


}
