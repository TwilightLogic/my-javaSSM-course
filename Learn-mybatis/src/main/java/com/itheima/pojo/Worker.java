package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Worker {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Integer worker_id;
}
