package com.guigu.service.Impl;

import com.guigu.dao.UserDao;
import com.guigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/16 16:23
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void print() {
        System.out.println("正在执行Service......");
        System.out.println(userDao);
    }
}
