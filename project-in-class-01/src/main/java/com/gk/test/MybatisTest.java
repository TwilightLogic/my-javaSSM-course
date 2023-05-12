package com.gk.test;

import com.gk.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory sqlSessionFactory =
                        new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.gk.mapper." +
                "CustomerMapper.findCustomerById", 1);
        System.out.println(user.toString());

        sqlSession.close();
    }
}
