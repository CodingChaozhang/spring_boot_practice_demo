package com.lcz.login.controller;

import com.lcz.login.entity.Result;
import com.lcz.login.entity.User;
import com.lcz.login.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-16 14:10
 * @Description:
 **/
@RestController
@RequestMapping(value="/crud",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/listUserByName")
    public Result<User> findUserByName(@RequestParam("username")String username,
                                     @RequestParam("password")String password){
        User user = userService.findUserByName(username);
        Result result = new Result();
        if (user.getPassword().equals(password)){
            result.setCode(0);
            result.setMsg("成功");
            result.setData(user);
        }else{
            result.setCode(-1);
            result.setMsg("失败");
            result.setData("");
        }
        return result;
    }
}


