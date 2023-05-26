package book.manager.controller.page;

import book.manager.service.AuthService;
import book.manager.service.BookService;
import book.manager.service.StatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/*
AdminPageController:
        作用：用于处理页面请求，通常用于渲染视图并返回HTML页面。
        请求路径：基于/page/admin。
        使用的注解：@Controller、@RequestMapping、@Resource。
        主要方法：
        index()：处理请求路径为/index的页面请求，将用户信息添加到模型中，并返回/admin/index页面。
        book()：处理请求路径为/book的页面请求，将用户信息和书籍列表添加到模型中，并返回/admin/book页面。
*/

@Controller
@RequestMapping("/page/admin")
public class AdminPageController {

    @Resource
    AuthService authService;
    @Resource
    BookService bookService;
    @Resource
    StatService statService;

    @RequestMapping("/index")
    public String index(HttpSession session, Model model) {
        model.addAttribute("user", authService.findUser(session));
        model.addAttribute("borrowList", bookService.getBorrowDetailsList());
        model.addAttribute("stat", statService.getGlobalStat());
        return "/admin/index";
    }

    @RequestMapping("/book")
    public String book(HttpSession session, Model model) {
        model.addAttribute("user", authService.findUser(session));
        model.addAttribute("bookList", bookService.getAllBook());
        return "/admin/book";
    }

    @RequestMapping("/add-book")
    public String addBook(HttpSession session, Model model) {
        model.addAttribute("user", authService.findUser(session));
        return "/admin/add-book";
    }
}
