package com.example.area_mybatis.mapper;

import com.example.area_mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-15 12:05
 * @Description:
 **/
@Repository
@Mapper
public interface UserMapper {
    // 通过name查询
    List<User> findUserByName(String name);

    // 通过id查询
    User findUserById(Integer id);

    // 列出全部的user信息
    public List<User> ListUser();

    // 插入user信息
    public  int insertUser(User user);

    // 删除user信息
    public int delete(int id);

    // 更新user信息
    public int Update(User user);
}
