package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/method")
public class MethodController {
    @RequestMapping(method = RequestMethod.GET)
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
    }
}
