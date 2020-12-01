package com.lcz.springboot_thymeleaf_jsp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Thymeleaf_JSP_Controller {
    private static Logger logger = LoggerFactory.getLogger(Thymeleaf_JSP_Controller.class);

    @GetMapping("/show")
    public String show(Model model, HttpServletRequest request, HttpServletResponse response){
        model.addAttribute("name","HTML");
        return "show";
    }

    @GetMapping("/show_jsp")
    public void show_jsp(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        model.addAttribute("name","name");
        request.setAttribute("name","JSP");
        request.getRequestDispatcher("/WEB-INF/show_jsp.jsp").forward(request, response);
//        return "show_jsp";
    }
}
