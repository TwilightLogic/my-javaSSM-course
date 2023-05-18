package book.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    // 客户端发送HTTP POST请求到/doRegister路径时，register()方法才调用⬇️
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username,
                           @RequestParam("sex") String sex,
                           @RequestParam("grade") String grade,
                           @RequestParam("password") String password) {
        // ⬆️
        // `@RequestParam`注解用于从请求的参数中获取值，并将其绑定到处理器方法的参数上。
        // 它可以用于处理GET或POST请求中的查询参数或表单字段。
        return null;
    }

}
