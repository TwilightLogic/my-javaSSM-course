package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Users {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;

}
