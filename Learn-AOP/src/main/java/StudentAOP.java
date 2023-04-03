// 要切入的方法
// 我们希望在study方法之后切入执行这个afterStudy方法
public class StudentAOP {
    public void afterStudy() {
        System.out.println("我是后置方法！");
    }
}
