import com.itheima.pojo.Users;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UsersTest {

    @Test
    public void findUserTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            // 查询id为1的用户信息
            Users users = sqlSession.selectOne("com.itheima.mapper.UsersMapper.findUserWithOrders", 1);

            System.out.println(users);
        }
    }
}
