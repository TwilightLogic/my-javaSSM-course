package com.gk.test;

import com.gk.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void findCustomerByNameTest() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<User> users = sqlSession.selectList("com.gk.mapper"
                + ".CustomerMapper.findCustomerByName", "l");
        for (User user : users) {
            //打印输出结果集
            System.out.println(user);
        }
    }

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
