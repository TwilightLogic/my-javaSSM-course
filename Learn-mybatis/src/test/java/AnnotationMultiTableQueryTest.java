import com.itheima.mapper.PersonMapper;
import com.itheima.pojo.Person;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AnnotationMultiTableQueryTest {

    @Test
    public void findUserByCardIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

            Person person = personMapper.selectPersonById(2);

            System.out.println(person);
        }
    }
}
