package org.example.entity;

import lombok.ToString;

import java.util.List;

@ToString
public class StudentList {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
}
