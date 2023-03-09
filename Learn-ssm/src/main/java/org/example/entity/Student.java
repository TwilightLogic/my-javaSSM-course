package org.example.entity;

import lombok.ToString;

import java.util.List;

@ToString
public class Student {
    // 如果要用bean给List的每个entry一个value，要怎么做捏
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    //    String name;
//    Teacher teacher;
//
//    // 如果是有参构造，我们的bean就用不了了，我们可以用`constructor-org`
//    public Student(String name, Teacher teacher) {
//        System.out.println("1");
//        this.name = name;
//        this.teacher = teacher;
//    }
//
//    public Student(Teacher teacher) {
//        System.out.println("2");
//        this.teacher = teacher;
//    }

    /*

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    */
}
