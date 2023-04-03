package com.itheima;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("singleton")
@Data
public class User {

    @Value("123")
    private int id;

    @Value("Abby")
    private String name;

    private String password;

}
