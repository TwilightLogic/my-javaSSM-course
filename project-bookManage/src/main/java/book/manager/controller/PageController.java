package book.manager.controller;

import book.manager.entity.AuthUser;
import book.manager.mapper.UserMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @Resource
    UserMapper mapper;

    @RequestMapping("/index")
    public String index(HttpSession session, Model model) {
        AuthUser user = (AuthUser) session.getAttribute("user");
        if (user == null) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            user = mapper.getPasswordByUsername(authentication.getName());
            session.setAttribute("user", user);
        }
        model.addAttribute("user", user);
        return "admin/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }
}
