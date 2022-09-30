package com.atguigu.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 10:10
 * @Description:
 */
@Component
@Aspect
@Order(3)
public class PersonProxy {

    @Before(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void before() {
        System.out.println("我也是前置增强......");
    }
}
