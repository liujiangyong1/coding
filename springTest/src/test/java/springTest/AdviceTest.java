package springTest;

import advice.AdviceTarget;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 18:11
 * @Description:
 */
public class AdviceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        AdviceTarget target = context.getBean(AdviceTarget.class);
        target.testAdvice("p1", 123);
//        try {
//            target.testException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
