import com.itheima.pojo.Book;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class log4jTest {

    @Test
    public void findBookByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            // 1
            Book book1 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
            System.out.println(book1.toString());

            // 2
            Book book2 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
            System.out.println(book2.toString());

        }
    }

    @Test
    public void updateBookTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            Book book1 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 2);
            System.out.println(book1);

            Book book2 = new Book();
            book2.setId(3);
            book2.setBookName("PHP");
            book2.setPrice(99);
            sqlSession.update("com.itheima.mapper.BookMapper.updateBook", book2);

            System.out.println(book2);
        }

    }
}
