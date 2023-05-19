package book.manager.controller.page;

import book.manager.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/page/user")
public class UserPageController {

    @Resource
    AuthService service;

    @RequestMapping("/index")
    public String index(HttpSession session, Model model) {
        model.addAttribute("user", service.findUser(session));
        return "/user/index";
    }

    @RequestMapping("/book")
    public String book(HttpSession session, Model model) {
        model.addAttribute("user", service.findUser(session));
        return "/user/book";
    }
}
