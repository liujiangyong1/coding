package test;

import com.guigu.bean.Dep;
import com.guigu.bean.Emp;
import com.guigu.bean.Orders;
import com.guigu.bean.Stu;
import com.guigu.config.SpringConfig;
import com.guigu.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/13 17:37
 * @Description:
 */
public class TestSpring5 {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("emp5", Emp.class);
        System.out.println(emp);
    }


    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu1", Stu.class);
        System.out.println(stu);
    }


    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Dep dep1 = context.getBean("dep1", Dep.class);
        Dep dep11 = context.getBean("dep1", Dep.class);
        System.out.println(dep1);
        System.out.println(dep11);
        System.out.println(dep1 == dep11);
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Orders order1 = context.getBean("order1", Orders.class);
        System.out.println("第四步： 获取创建bean实例对象");
        System.out.println(order1);
        //这儿要手动销毁对象实例
        ((ClassPathXmlApplicationContext) context).close();

    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.printUserService();
    }

    @Test
    public void test7() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.printUserService();


    }
}
