package book.manager.service.impl;

import book.manager.entity.Book;
import book.manager.mapper.BookMapper;
import book.manager.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public List<Book> getAllBook() {
        return mapper.allBook();
    }
}
