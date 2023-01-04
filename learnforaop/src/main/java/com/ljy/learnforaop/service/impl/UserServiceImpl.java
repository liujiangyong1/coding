package com.ljy.learnforaop.service.impl;

import com.ljy.learnforaop.service.UserService;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2023/1/4 15:27
 * @Description:
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加了一个用户！");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户！");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户！");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户！");
    }
}
