package com.yuanchun.oeder.api.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yuanchun.oeder.api.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
//测试使用省去 controller 正常应该是 controller 调用此 memberService
public class MemberService implements IMemberService {

    @Value("${server.port}")
    private String port ;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "orderError")
    public String callMemberService(){
        return restTemplate.getForObject("http://service-member/getMemberService",String.class);
    }

    public String orderError() {
        return "order callservice member error,ribbon fallbackMethod";
    }


}
