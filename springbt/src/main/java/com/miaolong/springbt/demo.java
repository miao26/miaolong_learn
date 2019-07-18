package com.miaolong.springbt;

import com.alibaba.dubbo.config.annotation.Reference;
import com.miaolong.test.dubbotest.api.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
   // @Autowired
    @Reference
    public IUser userService;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(@RequestParam("say") String str){
        return userService.getName(str);
    }
}
