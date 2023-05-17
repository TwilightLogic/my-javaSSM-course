package book.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String  index() {
        return "admin/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
