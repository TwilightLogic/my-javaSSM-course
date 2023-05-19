package book.manager.controller;

import book.manager.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/auth")
public class AuthController {

    @Resource
    AuthService service;

    // 客户端发送HTTP POST请求到/doRegister路径时，register()方法才调用⬇️
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String name,
                           @RequestParam("sex") String sex,
                           @RequestParam("grade") String grade,
                           @RequestParam("password") String password) {
        // ⬆️
        // `@RequestParam`注解用于从请求的参数中获取值，并将其绑定到处理器方法的参数上。
        // 它可以用于处理GET或POST请求中的查询参数或表单字段。

        service.register(name, sex, grade, password);
        return "redirect:/login";
    }

}
