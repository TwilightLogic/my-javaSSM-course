package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/method")
public class MethodController {

    // -------------- The 1⃣️ way to use RequestMethod --------------
    /*@RequestMapping(method = RequestMethod.GET)
    public void get() {
        System.out.println("RequestMethod.GET");
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete() {
        System.out.println("RequestMethod.DELETE");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void post() {
        System.out.println("RequestMethod.POST");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void put() {
        System.out.println("RequestMethod.PUT");
    }*/

    // -------------- The 2⃣️ way to use RequestMethod --------------
    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("success");
    }

    @GetMapping
    public ModelAndView post() {
        return new ModelAndView("success");
    }

    @GetMapping
    public ModelAndView delete() {
        return new ModelAndView("success");
    }

    @GetMapping
    public ModelAndView put() {
        return new ModelAndView("success");
    }
}
