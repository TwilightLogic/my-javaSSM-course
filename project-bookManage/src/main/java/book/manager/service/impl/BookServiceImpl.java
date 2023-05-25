package book.manager.service.impl;

import book.manager.entity.Book;
import book.manager.mapper.BookMapper;
import book.manager.mapper.UserMapper;
import book.manager.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
