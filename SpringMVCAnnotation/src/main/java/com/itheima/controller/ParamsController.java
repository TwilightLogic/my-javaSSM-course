package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParamsController {
    // If the requested parameter is equal to
    // value defined by the params property (id=1),
    // the mapped method executes normally.
    @RequestMapping(value = "/params", params = "id=1")
    public void findById(String id) {
        System.out.println("id = " + id);
    }
}
