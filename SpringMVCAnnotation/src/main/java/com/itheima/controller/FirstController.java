package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String sayHello() {
        System.out.println("访问到FirstController!");
        return "success";
    }

}
