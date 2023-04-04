import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao = context.getBean(UserDao.class);

        userDao.delete();

        System.out.println();
        userDao.insert();
    }
}
