package com.itheima.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Book implements Serializable {
    private Integer id;
    private String bookName;
    private double price;
    private String author;
}
