package com.miaolong.spcloud.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface IService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
