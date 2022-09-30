package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 17:33
 * @Description:
 */
public class BeforeService implements MethodBeforeAdvice {


    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("---------------前置增强start---------");
        System.out.println(target + "的" + method.getName() + "方法，参数是" + Arrays.toString(args));
        System.out.println("---------------前置增强end---------");
    }

}
