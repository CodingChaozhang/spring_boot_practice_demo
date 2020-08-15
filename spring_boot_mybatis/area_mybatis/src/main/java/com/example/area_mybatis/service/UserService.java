package com.example.area_mybatis.service;

import com.example.area_mybatis.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findByName(String name);

    public User findById(Integer id);

    public List<User> ListUser();

    public User insertUser(String name, String number,String password);

    public int delete(Integer id);

    public int Update(Integer id,String number);
}
