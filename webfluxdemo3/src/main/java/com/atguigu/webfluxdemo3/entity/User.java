package com.atguigu.webfluxdemo3.entity;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/9 10:36
 * @Description:
 */
public class User {
    private String name;
    private String gender;
    private Integer age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
