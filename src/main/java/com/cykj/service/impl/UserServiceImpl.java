package com.cykj.service.impl;

import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer queryID() {
        return userMapper.queryID();
    }

}
