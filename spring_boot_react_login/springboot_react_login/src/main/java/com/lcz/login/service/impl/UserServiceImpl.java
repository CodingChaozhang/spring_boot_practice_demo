package com.lcz.login.service.impl;

import com.lcz.login.entity.Result;
import com.lcz.login.entity.User;
import com.lcz.login.mapper.UserMapper;
import com.lcz.login.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-16 14:09
 * @Description:
 **/
@Service
public class UserServiceImpl implements UserSerice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByName(String name) {
        User user = userMapper.findUserByName(name);

        return user;
    }
}
