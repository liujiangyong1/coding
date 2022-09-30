package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/8 9:21
 * @Description:
 */
public class AroundService implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("--------环绕增强Start----------");
        Object target = invocation.getThis();    //目标方法所在的类
        Method method = invocation.getMethod();   //被调用的目标方法
        Object[] args = invocation.getArguments();  //调用目标方法时的参数
        System.out.println(target + " 的 " + method.getName() + " 方法。参数是： " + Arrays.toString(args));
        try {
            Object returnVal = invocation.proceed();   //执行目标方法
            System.out.println("--------环绕增强End----------");
            return returnVal;
        } catch (Exception e) {
            System.out.println("--------环绕增强捕获异常----------");
            throw e;
        }
    }
}
