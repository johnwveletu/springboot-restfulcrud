package com.wang.springbootrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        HttpSession session, Map<String,Object> map){
        if("admin".equals(username) && "123456".equals(password)){
            //登录成功将用户名和密码放入session中
            session.setAttribute("username", username);
            session.setAttribute("password",password);
            map.put("msg","登录成功");
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名密码错误");
            return  "index";
        }
    }

}
