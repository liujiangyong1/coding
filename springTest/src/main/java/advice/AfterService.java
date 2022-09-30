package advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/8 9:34
 * @Description:
 */
public class AfterService implements AfterReturningAdvice, ThrowsAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("---------------后置增强start---------");
        System.out.println(target + "的" + method.getName() + "方法，参数是" + Arrays.toString(args) + "  返回值是： " + returnValue);
        System.out.println("---------------后置增强end---------");
    }


    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------------异常抛出增强start---------");
        System.out.println(target + "的" + method.getName() + "异常信息是：" + e.getMessage());
        System.out.println("---------------异常抛出增强end---------");
    }
}
