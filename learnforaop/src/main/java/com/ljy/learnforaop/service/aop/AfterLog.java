package com.ljy.learnforaop.service.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2023/1/4 15:33
 * @Description:
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了:" + method.getName() + "返回结果为：" + returnValue);
    }
}
