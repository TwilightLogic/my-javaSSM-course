package com.example.entry;

import lombok.Data;

import java.util.List;

@Data
public class Dept {
    Integer deptno;
    String dname;
    String loc;
    List<Emp> empList;
}
