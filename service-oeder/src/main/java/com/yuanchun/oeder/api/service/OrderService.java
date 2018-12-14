package com.yuanchun.oeder.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {

    @RequestMapping("/getOrderService")
    public String getOrderService(){

        return "this is service-order";
    }
}
