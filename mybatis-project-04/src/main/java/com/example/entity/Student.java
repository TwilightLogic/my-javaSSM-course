package com.example.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer cid;
}
