package entity;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 16:52
 * @Description:
 */
public class Cat {
    private String name;
    private int age;

    public void shout(){
        System.out.println("喵喵！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
