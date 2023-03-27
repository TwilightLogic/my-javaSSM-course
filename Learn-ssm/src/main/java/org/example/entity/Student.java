package org.example.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

public class Student {
    String name;
    Teacher teacher;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //    // 如果要用bean给List的每个entry一个value，要怎么做捏
//    private List<String> list;
//
//    public void setList(List<String> list) {
//        this.list = list;
//
}
