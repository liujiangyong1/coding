package com.guigu.bean;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/13 17:34
 * @Description:
 */
public class Emp {
    private String name;
    private String gender;
    private Dep dep;

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

    public Dep getDep() {
        return dep;
    }

    public void setDep(Dep dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dep=" + dep +
                '}';
    }
}
