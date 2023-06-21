import com.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class TestMain {
    @Test
    public void userFindByIdTest() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new
                SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlMapper.openSession();
        User user = session.selectOne("findById", 1);
        System.out.println(user.getUname());

        session.close();
    }
}
