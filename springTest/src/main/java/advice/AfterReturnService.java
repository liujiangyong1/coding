package advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 20:21
 * @Description: 后置增强必须是正常执行完的代码，如果程序执行报错，那么不会进行后置增强
 */
public class AfterReturnService implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("---------------后置增强start---------");
        System.out.println(target + "的" + method.getName() + "方法，参数是" + Arrays.toString(args)+"  返回值是： "+returnValue);
        System.out.println("---------------后置增强end---------");
    }
}
