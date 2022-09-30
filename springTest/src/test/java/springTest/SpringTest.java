package springTest;

import entity.Cat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 17:00
 * @Description:
 */
public class SpringTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        Cat cat = (Cat) context.getBean("cat");
        Cat cat = (Cat) context.getBean("cat1");
        System.out.println(cat);
        cat.shout();
    }
}
