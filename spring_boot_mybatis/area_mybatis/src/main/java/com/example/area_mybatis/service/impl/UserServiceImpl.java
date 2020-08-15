package com.example.area_mybatis.service.impl;

import com.example.area_mybatis.entity.User;
import com.example.area_mybatis.mapper.UserMapper;
import com.example.area_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-15 12:05
 * @Description:
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String name){
        return userMapper.findUserByName(name);
    }

    public User findById(Integer id){
        return userMapper.findUserById(id);
    }

    public List<User> ListUser(){
        return userMapper.ListUser();
    }

    public User insertUser(String name, String number,String password){
        User user = new User(name,number,password);
        userMapper.insertUser(user);
        return user;
    }

    public int delete(Integer id){
        return userMapper.delete(id);
    }


    public int Update(Integer id,String number){
        User user = userMapper.findUserById(id);
        user.setNumber(number);
        return userMapper.Update(user);
    }
}
