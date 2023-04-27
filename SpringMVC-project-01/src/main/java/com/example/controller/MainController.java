package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping(value = "/index")
    public String  index(Model model) {
        String name = "罗子彬";
        Integer numberStudent = 2020131338;

        model.addAttribute("name", name);
        model.addAttribute("numberStudent", numberStudent);

        return "home";
    }

}