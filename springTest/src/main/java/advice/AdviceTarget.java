package advice;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/7 17:24
 * @Description:
 */
public class AdviceTarget {


    public String testAdvice(String param1, Integer param2) {
        System.out.println("我是测试类的方法，参数是param1= " + param1 + "; param2= " + param2);
        return "测试类返回";
    }

    public void testException() throws Exception {
        throw new Exception("我是测试故意抛出的异常！");
    }
}
