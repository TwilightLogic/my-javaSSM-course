import com.itheima.pojo.Person;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonTest {

    @Test
    public void findPersonByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {

            // 查询id为1的学生
            Person person = sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById", 1);

            System.out.println(person);
        }

    }

    @Test
    public void findPersonByTest2() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            Person person = sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById2", 1);

            System.out.println(person);
        }
    }
}
