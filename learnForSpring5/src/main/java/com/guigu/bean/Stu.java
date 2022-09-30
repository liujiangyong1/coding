package com.guigu.bean;

import java.util.*;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/14 10:35
 * @Description:
 */
public class Stu {
    private String[] courses;
    private Map<String, String> map;
    private Set<String> set;
    private List<String> list;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", map=" + map +
                ", set=" + set +
                ", list=" + list +
                '}';
    }
}
