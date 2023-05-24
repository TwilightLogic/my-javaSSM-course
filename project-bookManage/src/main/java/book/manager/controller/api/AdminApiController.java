package book.manager.controller.api;

import book.manager.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/*
AdminApiController:
        作用：处理API请求，通常用于提供数据接口或与前端进行异步通信。
        请求路径：基于/api/admin。
        使用的注解：@Controller、@RequestMapping、@Resource。
        主要方法：
        deleteBook()：处理GET请求，根据请求参数删除书籍，并重定向到/page/admin/index页面。
*/

@Controller
@RequestMapping("/api/admin")
public class AdminApiController {

    @Resource
    BookService bookService;

    @RequestMapping(value = "del-book", method = RequestMethod.GET)
    public String deleteBook(@RequestParam("id") int id) {
        return "redirect:/page/admin/index";
    }
}
