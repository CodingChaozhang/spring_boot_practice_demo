package com.example.area_mybatis.controller;

import com.example.area_mybatis.entity.User;
import com.example.area_mybatis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : codingchao
 * @date : 2020-08-15 12:05
 * @Description:
 **/
@RestController
@RequestMapping(value="/crud",method = {RequestMethod.GET,RequestMethod.POST})
public class CRUD {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/listUser")
    public List<User> ListUser(){
        return userService.ListUser();
    }

    @PostMapping(value="listUserByName")
    public List<User> ListUserByNAME(@RequestParam("name") String name){
        return userService.findByName(name);
    }

    @PostMapping(value="delete")
    public String delete(@RequestParam("id") Integer id){
        int result = userService.delete(id);
        if (result >= 1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @PostMapping(value = "insert")
    public User insert(@RequestParam("name")String name,
                       @RequestParam("number")String number,
                       @RequestParam("password")String password){
        return userService.insertUser(name,number,password);
    }

    @PostMapping(value = "update")
    public String update(@RequestParam("id") Integer id,
                       @RequestParam("number")String number){
        int result = userService.Update(id,number);
        if (result >= 1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
}

