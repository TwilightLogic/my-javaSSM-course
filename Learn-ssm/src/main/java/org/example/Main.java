package org.example;

import org.example.entity.StudentList;
import org.example.entity.StudentMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 应用程序上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("application-studentList.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("application-studentMap.xml");

        // 我们就不需要手动实例化对象了，因为我们可以丢给IoC容器来帮我们自动实例化
        StudentList studentList = context.getBean(StudentList.class);

        System.out.println(studentList);

        StudentMap studentMap = context1.getBean(StudentMap.class);

        System.out.println(studentMap);
    }
}
