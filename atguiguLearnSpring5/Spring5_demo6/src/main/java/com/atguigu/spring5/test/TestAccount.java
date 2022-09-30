package com.atguigu.spring5.test;

import com.atguigu.spring5.config.TestConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/23 9:29
 * @Description:
 */
public class TestAccount {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}
