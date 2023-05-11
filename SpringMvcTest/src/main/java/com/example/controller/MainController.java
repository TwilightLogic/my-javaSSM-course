package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
// 表示添加一个路径前缀
//@RequestMapping("yyds")
public class MainController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("我是处理controller");
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println("我是home");
        return "home";
    }

    // 自动注入
    //    @RequestMapping(value = "/index")
    //    public ModelAndView index() {
    //        return new ModelAndView("index");
    //    }

    // 学习：重定向
    // 我们访问index，可以看到network的状态为302（即是重定向的意思）
    //    @RequestMapping(value = "/index")
    //    public ModelAndView index() {
    //        return new ModelAndView("redirect:home");
    //    }

    // 学习：请求转发（跟重定向的区别是url不变哦！而且我们向index的请求都转发给了home来处理哦）
    //    @RequestMapping(value = "/index")
    //    public ModelAndView index() {
    //        return new ModelAndView("forward:home");
    //    }

    //    @RequestMapping("/home")
    //    public String home() {
    //        return "home";
    //    }

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
    //    @RequestMapping("/index")
    //    public String index(@RequestParam(value = "username", required = false, defaultValue = "lbwnb") String username) {
    //        System.out.println("收到一个请求参数：" + username);
    //        return "index";
    //    }

    // 我们还可以直接将请求参数传递给一个实体类
    // 记得写setter才行哈
    //    @RequestMapping("/index")
    //    public String index(User user) {
    //        System.out.println("收到一个请求参数：" + user);
    //        return "index";
    //    }

    // 通过使用`@CookieValue`注解，我们也可以快速获取请求携带的Cookie信息：
    //    @RequestMapping(value = "/index")
    //    public ModelAndView index(HttpServletResponse response,
    //                              @CookieValue(value = "test", required = false) String test){
    //        System.out.println("获取到cookie值为："+test);
    //        response.addCookie(new Cookie("test", "lbwnb"));
    //        return new ModelAndView("index");
    //    }

    // 同样的，Session也能使用注解快速获取：
    //    @RequestMapping(value = "/index")
    //    public ModelAndView index(@SessionAttribute(value = "test", required = false) String test,
    //                              HttpSession session){
    //        session.setAttribute("test", "xxxx");
    //        System.out.println(test);
    //        return new ModelAndView("index");
    //    }

}