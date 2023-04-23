package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
// 表示添加一个路径前缀
//@RequestMapping("yyds")
public class MainController {
    // 我们可以使用`params`属性来指定请求必须携带哪些请求参数
    // 人话："要携带哪些参数才能访问我们的网页呢？"
    // 就这样写就好了："http://localhost:8080/mvc/yyds/index?username=xxxx"
    // 就这样写就好了："http://localhost:8080/mvc/yyds/index?username=xxxx&password=123456"

    // 如果我们不希望有人携带`username`这个参数进入我们的网页，我们可以 ⬇️
    // 如果我们不希望`username`为`xxx`的人进入我们的网页，我们可以 下
    //    @RequestMapping(value = "/index", params = "username!=xxx")
    //    public ModelAndView index(){
    //        return new ModelAndView("index");
    //    }

    // 也可以直接写成 @PostMapping("/index") @GetMapping("/index")
    // 如果我们只希望通过GET, POST请求去访问这个路径，怎么写呢？（默认是GET请求）
    //    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    //    public ModelAndView index() {
    //        ModelAndView modelAndView = new ModelAndView("index");
    //        modelAndView.getModel().put("name", "Damn");
    //        return modelAndView;
    //    }

    // http://localhost:8080/mvc/yyds/index
    //    @RequestMapping("/index")
    //    public ModelAndView index() {
    //        ModelAndView modelAndView = new ModelAndView("index");
    //        modelAndView.getModel().put("name", "Damn");
    //        return modelAndView;
    //    }

    // 我们也可以这样创建 ⬇️ 会自动返回一个ModelAndView类型的对象
    //    @RequestMapping("/index")
    //    public String index2() {
    //        return "index";
    //    }
    // 注解获取请求相关参数
    // `required=false`表示这个param参数不是一定要写的，不写的话也能访问的
    @RequestMapping("/index")
    public String index(@RequestParam(value = "username", required = false) String username) {
        System.out.println("收到一个请求参数：" + username);
        return "index";
    }
}
