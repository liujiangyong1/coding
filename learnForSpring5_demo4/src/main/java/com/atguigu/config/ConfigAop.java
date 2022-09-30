package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 10:44
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//这个注解默认情况下是false
public class ConfigAop {
    static{
        System.out.println("wozhixingle......");
    }
}
