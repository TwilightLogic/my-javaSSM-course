package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    // http://localhost:8080/mvc/index
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.getModel().put("name", "Damn");
        return modelAndView;
    }

    // 我们也可以这样创建 ⬇️ 会自动返回一个ModelAndView类型的对象
    //    @RequestMapping("/index")
    //    public String index2() {
    //        return "index";
    //    }

}
