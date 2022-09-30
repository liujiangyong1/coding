package com.atguigu.spring5;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/19 10:47
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了......");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了......");
        return id;
    }
}
