import com.itheima.pojo.Customer;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CustomerTest {

    @Test
    public void findCustomerByNameAndJobsTest() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            Customer bean = context.getBean(Customer.class);

            // 感觉可以学习下用list来输出结果 ⬇️
            // 查询
            List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameAndJobs", bean);
            // 输出
            for (Customer customer: customers) {
                System.out.println(customer);
            }
        }
    }
}
