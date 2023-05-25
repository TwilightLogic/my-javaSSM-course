package book.manager.service.impl;

import book.manager.entity.Book;
import book.manager.entity.Borrow;
import book.manager.mapper.BookMapper;
import book.manager.mapper.UserMapper;
import book.manager.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Resource
    UserMapper userMapper;

    @Override
    public List<Book> getAllBook() {
        return bookMapper.allBook();
    }

    @Override
    public List<Book> getAllBookWithoutBorrow() {
        List<Book> books = bookMapper.allBook();
        // 调用 bookMapper 的 borrowList() 方法获取借阅列表，并将其转换为一个包含借阅图书ID的整数列表
        List<Integer> borrows = bookMapper.borrowList()
                .stream()
                .map(Borrow::getBid)
                .collect(Collectors.toList());
        // 通过过滤操作，筛选出在借阅列表中的书籍，并将结果收集到一个新的列表中
        return books
                .stream()
                .filter(book -> !borrows.contains(book.getBid()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteBook(int bid) {
        bookMapper.deleteBook(bid);
    }

    @Override
    public void addBook(String title, String desc, Double price) {
        bookMapper.addBook(title, desc, price);
    }

    @Override
    public void borrowBook(int bid, int id) {
        Integer sid = userMapper.getSidByUserId(id);
        if (sid == null) return;
        bookMapper.addBorrow(bid, sid);
    }
}
