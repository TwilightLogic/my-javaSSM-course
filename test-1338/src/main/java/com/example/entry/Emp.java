package com.example.entry;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Emp {
    Integer empno;
    String ename;
    String job;
    Integer mgr;
    String hiredate;
    Double sal;
    Integer comm;
    Integer deptno;
}
