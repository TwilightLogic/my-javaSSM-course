package com.example.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Product {
    private Integer id;
    private String goodsName;
    private double price;
    private Integer typeId;
}
