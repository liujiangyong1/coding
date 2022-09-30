package com.atguigu.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/19 15:31
 * @Description:
 */
//增强类
@Component
@Aspect
@Order(0)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void pointDemo() {
        System.out.println("这个是相同切入点...");//那么在下面进行调用的饿时候就可以直接调用当前的函数
    }


    //前置通知
//    @Before(value = "execution(* com.atguigu.aopanno.User.add(..))")
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before方法执行......");
    }
}

