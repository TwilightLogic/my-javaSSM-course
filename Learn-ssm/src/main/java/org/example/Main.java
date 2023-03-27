package org.example;

import lombok.ToString;
import org.example.entity.Student;
import org.example.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 应用程序上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // 我们就不需要手动实例化对象了，因为我们可以丢给IoC容器来帮我们自动实例化
        Student bean = context.getBean(Student.class);

        Service service = context.getBean(Service.class);

        System.out.println(service);
    }
}
