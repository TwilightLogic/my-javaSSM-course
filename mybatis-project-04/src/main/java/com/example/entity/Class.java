package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Class {
    private Integer id;
    private String classname;

    public List<Student> studentList;
}
