package com.itheima.demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    public void before(JoinPoint joinPoint) {
        System.out.print("这是前置通知！");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println("，被织入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint joinPoint) {
        System.out.print("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知之前的部分！");
        Object object = point.proceed();
        System.out.println("这是环绕通知后的部分！");

        return object;
    }

    public void afterException() {
        System.out.println("异常通知！");
    }

    public void after() {
        System.out.println("这是后置通知！");
    }
}
