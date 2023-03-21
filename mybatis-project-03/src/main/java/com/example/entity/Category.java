package com.example.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Category {
    private Integer id;
    private String typename;
    private List<Product> productList;
}
