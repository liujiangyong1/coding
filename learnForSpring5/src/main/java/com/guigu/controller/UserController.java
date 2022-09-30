package com.guigu.controller;

import com.guigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/16 16:22
 * @Description:
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void printUserService() {
        System.out.println("正在执行controller......");
        System.out.println(userService);
        userService.print();
    }
}
