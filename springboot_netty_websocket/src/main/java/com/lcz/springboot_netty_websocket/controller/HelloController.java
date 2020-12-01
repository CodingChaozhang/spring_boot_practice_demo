package com.lcz.springboot_netty_websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @GetMapping(value = "/index")
    public String hello(Model model, HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
