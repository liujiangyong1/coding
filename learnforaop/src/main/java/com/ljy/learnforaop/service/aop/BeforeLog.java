package com.ljy.learnforaop.service.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2023/1/4 15:29
 * @Description:
 */
public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "被执行了！");
    }
}
