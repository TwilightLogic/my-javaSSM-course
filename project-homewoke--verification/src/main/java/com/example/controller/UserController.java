package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/main")
    public String toMainPage() {
        return "main";
    }

    @RequestMapping("/tologin")
    public String toLoginPage() {
        return "login";
    }

    @RequestMapping("/orderinfo")
    public String orderinfo() {
        return "orderinfo";
    }

    // 用户登录
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();

        if (username != null && username.equals("logic")
                && password != null && password.equals("123456")) {
            session.setAttribute("USER_SESSION", user);
            return "main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录!");
        return "login";
    }

    // 用户退出
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:tologin";
    }
}
