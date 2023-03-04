import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class UserTest {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    // 学习resultMap
    @Before
    public void init() throws IOException {
        // 定义读取文件名
        String resources = "mybatis-config.xml";
        Reader reader = null;
        reader = Resources.getResourceAsReader(resources);
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        sqlSession = sqlMapper.openSession();
    }


    @Test
    public void findAllUserTest() {
        // SqlSession执行映射文件种定义的SQL，并返回映射结果
        // Idk
    }
}
