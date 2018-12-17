package com.yuanchun.orderfeigen.api.service.impl;

import com.yuanchun.orderfeigen.api.service.IConsumeFeignService;
import org.springframework.stereotype.Service;

@Service
public class ConsumeFeignService implements IConsumeFeignService {
    @Override
    public String callMemberService() {
        return "order callservice member error,feign fallbackMethod";
    }
}
