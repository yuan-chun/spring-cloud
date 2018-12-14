package com.yuanchun.oeder.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderService {

    @Value("${server.port}")
    private String port ;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrderService")
    public String getOrderService(){
        System.out.println("this is service-order and port = " + port);
        String result = restTemplate.getForObject("http://service-member/getMemberService",String.class);
        return "callservice result = " + result;
    }
}
