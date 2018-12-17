package com.yuanchun.orderfeigen.api.service;

import com.yuanchun.orderfeigen.api.service.impl.ConsumeFeignService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="service-member",fallback= ConsumeFeignService.class )//制定服务名来绑定服务
public interface IConsumeFeignService {

    @RequestMapping("/getMemberService")//调用远程服务中的具体方法，接口名提供本项目服务 controller 调用
    public String callMemberService();

}
