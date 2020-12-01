package com.lcz.springboot_sse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
@RequestMapping("/sse")
public class SSEController {
    /**
     * 网上的方法 但存在一个问题 运行在tomcat中，tomcat会帮助直接给关掉，而sse有自动重连，所以每次都会重新发起请求。
     * @return
     */
    @GetMapping(value = "get",produces = "text/event-stream;charset=UTF-8")
    public String getData(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:行情:" + Math.random()+"\n\n";
    }

    @GetMapping(value = "get_true")
    public void getData_True(HttpServletResponse response){
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("utf-8");

        try{
            PrintWriter pw = response.getWriter();
            while (true){
                if (pw.checkError()){
                    System.out.println("客户端断开连接");
                    break;
                }
                Thread.sleep(1000);
                pw.write("data:行情:" + Math.random()+"\n\n");
                pw.flush();
            }
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
