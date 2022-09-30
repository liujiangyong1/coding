package com.atguigu.test;

import com.atguigu.aopanno.User;
import com.atguigu.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/19 16:03
 * @Description:
 */
public class AopTest {

    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);

        user.add();
    }

}
