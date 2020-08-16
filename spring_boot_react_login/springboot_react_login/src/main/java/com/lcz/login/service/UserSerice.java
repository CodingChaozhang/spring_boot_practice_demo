package com.lcz.login.service;

import com.lcz.login.entity.User;
import com.lcz.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-16 14:07
 * @Description:
 **/
public interface UserSerice {
    public User findUserByName(String name);
}
