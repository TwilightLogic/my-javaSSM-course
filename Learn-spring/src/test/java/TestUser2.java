import com.itheima.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser2 {

    @Test
    public void testUser2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User2 user2 = applicationContext.getBean("user2", User2.class);

        System.out.println(user2);
    }
}
