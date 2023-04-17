package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    // http://localhost:8080/mvc/test
    @RequestMapping("/test")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
