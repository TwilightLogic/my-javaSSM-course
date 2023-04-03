package com.itheima;

import lombok.Data;

@Data
public class User2 {
    private int id;
    private String name;
    private String password;

    public User2(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
