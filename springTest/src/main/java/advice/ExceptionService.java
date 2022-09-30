package advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 20:33
 * @Description: 异常抛出增强是为了解决后置增强抛出异常不能正常进行的问题
 *                那么异常抛出增强可用于数据库提交过程中的数据回滚，能够保证数据的一致性
 */
public class ExceptionService implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------------异常抛出增强start---------");
        System.out.println(target + "的" + method.getName() + "异常信息是：" + e.getMessage());
        System.out.println("---------------异常抛出增强end---------");
    }
}
