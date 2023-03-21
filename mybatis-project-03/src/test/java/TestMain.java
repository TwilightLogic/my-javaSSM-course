import com.example.entity.Category;
import com.example.entity.Product;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMain {

    @Test
    public void findWhiteProductTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
             List<Category> category = sqlSession.selectList("com.example.mapper.mapper.findProductWithCategory", 2);
             for (Category category1 : category) {
                 System.out.println(category1);
             }
        }
    }
}
