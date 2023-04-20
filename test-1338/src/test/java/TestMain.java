import com.example.entry.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

public class TestMain {

    @Test
    public void findByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {

        }
    }
}
