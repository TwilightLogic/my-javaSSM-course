package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;

}
