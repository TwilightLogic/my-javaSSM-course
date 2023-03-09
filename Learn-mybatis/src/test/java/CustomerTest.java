import com.itheima.pojo.Customer;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTest {

    @Test
    public void findByArrayTest() {

        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {

            // 封装查询id
            Integer[] roleIds = {2, 3};

            // 执行SqlSession的查询方法，返回结果集
            List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findByArray", roleIds);

            // 输出
            for (Customer customer: customers) {
                System.out.println(customer);
            }
        }

    }

    @Test
    public void findByListTest() {

        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {

            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1);
            ids.add(2);

            List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findByList", ids);

            for (Customer customer: customers) {
                System.out.println(customer);
            }

        }
    }

    @Test
    public void findByMap() {

        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {

            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1);
            ids.add(2);
            ids.add(3);
            ids.add(4);

            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("id", ids);
            conditionMap.put("jobs", "worker");

            List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findByMap", conditionMap);

            for (Customer customer: customers) {
                System.out.println(customer);
            }
        }
    }

}
