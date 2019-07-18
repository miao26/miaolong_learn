package com.miaolong.test.dubbotest.service.controller;

import com.miaolong.test.dubbotest.api.IUser;
import com.miaolong.test.dubbotest.service.UserImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        IUser user = new UserImpl();
        return user.getName("testtest");
    }
}
