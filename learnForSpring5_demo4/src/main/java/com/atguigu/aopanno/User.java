package com.atguigu.aopanno;

import org.springframework.stereotype.Component;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/19 15:30
 * @Description:
 */
//被增强类
@Component
public class User {
    public void add() {
        System.out.println("add方法执行......");
    }
}
