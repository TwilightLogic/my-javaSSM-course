import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        boolean flag = userService.login("Logic", "123456");
        if (flag) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
    }
}
