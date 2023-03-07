package org.example.entity;

import lombok.ToString;

@ToString
public class Student {
    String name;
    Teacher teacher;

    // 如果是有参构造，我们的bean就用不了了，我们可以用`constructor-org`
    public Student(String name, Teacher teacher) {
        System.out.println("1");
        this.name = name;
        this.teacher = teacher;
    }

    public Student(Teacher teacher) {
        System.out.println("2");
        this.teacher = teacher;
    }

    /*

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    */
}
