package com.atguigu.spring5.entity;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/20 14:44
 * @Description:
 */
public class Book {
    private String UserId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "UserId='" + UserId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
