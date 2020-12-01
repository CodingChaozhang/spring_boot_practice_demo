package com.lcz.springboot_sse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class hellocontroller {
    private static Logger logger = LoggerFactory.getLogger(hellocontroller.class);

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @GetMapping(value = "/index")
    public String hello(Model model, HttpServletRequest request, HttpServletResponse response){
        return "SSE";
    }
}
