import com.itheima.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean1Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 其实这个section学的是bean的实例化
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");

        System.out.println(bean1);
    }
}
