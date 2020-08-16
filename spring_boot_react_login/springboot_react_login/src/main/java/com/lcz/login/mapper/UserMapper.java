package com.lcz.login.mapper;

/**
 * @author : codingchao
 * @date : 2020-08-16 14:04
 * @Description:
 **/

import com.lcz.login.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface  UserMapper {
    // 通过账户名来查询密码
    User findUserByName(String username);
}
