package com.ex.service.impl;

import com.ex.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String show() {
        return "我终于成功了！";
    }
}
