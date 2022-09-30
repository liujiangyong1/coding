package com.guigu.bean;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/14 14:58
 * @Description:
 */
public class Orders {
    private String name;

    public Orders() {
        System.out.println("第一步： 创建实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步： 通过set方法注入属性");
    }

    public void initMethod(){
        System.out.println("第三步： 已经开始初始化方法了");
    }


    public void destroyMethod(){
        System.out.println("第五步： 已经开始初始化方法了");
    }
}
