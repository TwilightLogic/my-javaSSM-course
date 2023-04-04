package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void insert() {
        System.out.println("添加用户信息");
    }

    @Override
    public void delete() {
        System.out.println("删除用户信息");
    }

    @Override
    public void update() {
        System.out.println("更新用户信息");
    }

    @Override
    public void select() {
        System.out.println("查询用户信息");
    }
}
