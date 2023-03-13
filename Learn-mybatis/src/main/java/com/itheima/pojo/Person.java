package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

// FOR TABLE(tb_card, tb_person) IN `mybatis` database
@Data
@ToString
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private IdCard card;    // 与person关联的证件
}
