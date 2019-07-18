package com.miaolong.test.dubbotest.service;

import com.miaolong.test.dubbotest.api.IUser;

public class UserImpl implements IUser {
    @Override
    public String getName(String name) {
        return name+"dubbo";
    }
}
