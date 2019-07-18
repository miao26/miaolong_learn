package com.miaolong.spcloud.service_feign.controller;

import com.miaolong.spcloud.service_feign.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    IService hiService;
    @RequestMapping(value = "/feignHi", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return hiService.sayHi("feign"+name);
    }
}
