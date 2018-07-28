package com.wang.springbootrestfulcrud.controller;

import com.wang.springbootrestfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String hello(Map<String, Object> map){
        map.put("hello", "<h1>你好</h1>");
        map.put("list",Arrays.asList("wang","zhang","li"));
        return "success";
    }

    @RequestMapping("/hello")
    public String testMyException(@RequestParam("user") String user){
        if(!"111".equals(user)){
            throw new UserNotExistException();
        }
        return "success";
    }

}
