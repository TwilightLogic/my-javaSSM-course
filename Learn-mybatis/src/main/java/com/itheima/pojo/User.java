package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

@Data
public class User {
    private int id;
    private String name;
    private int age;

    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
