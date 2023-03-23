import com.itheima.mapper.PersonMapper;
import com.itheima.mapper.UsersMapper;
import com.itheima.pojo.Person;
import com.itheima.pojo.Users;
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

    @Test
    public void selectUserByIdTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);

            Users users = usersMapper.selectUserById(1);

            System.out.println(users);
        }
    }
}
