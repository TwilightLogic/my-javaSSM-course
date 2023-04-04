import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 要切入的方法
// 我们希望在study方法之后切入执行这个afterStudy方法
public class StudentAOP {

    // 后置方法
    public void afterStudy(JoinPoint joinPoint) {
        System.out.println("我是后置方法！" + joinPoint.getArgs()[0]);
    }

    // 环绕方法
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("方法开始之前");
        String arg = point.getArgs()[0] + "伞兵一号";
        Object object = point.proceed(new Object[] {arg});
        System.out.println("方法执行完成，结果为：" + object);

        return  object;
    }
}
