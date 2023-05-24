package book.manager.mapper;

import book.manager.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> allBook();

    @Delete("delete from book where bid = #{bid}")
    void deleteBook(int bid);

    @Insert("insert into book(title, `desc`, price) values(#{title}, #{desc}, #{price})")
    void addBook(@Param("title") String title,
                 @Param("desc") String desc,
                 @Param("price") Double price);
}
