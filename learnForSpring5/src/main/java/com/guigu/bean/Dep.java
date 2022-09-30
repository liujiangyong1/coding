package com.guigu.bean;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/13 17:32
 * @Description:
 */
public class Dep {
    private String name;

    @Override
    public String toString() {
        return "Dep{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
