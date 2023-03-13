package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

// FOR TABLE(tb_card, tb_person) IN `mybatis` database
@Data
@ToString
public class IdCard {
    private Integer id;
    private String code;
}
