package com.atguigu.mvc.controller;

import com.atguigu.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/13 14:42
 * @Description:
 */
@Controller
public class SpringMVCController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/testParamsAndHeaders", method = RequestMethod.GET
            , params = {"username", "!password"})
    public String testParamsAndHeaders() {
        return "hello";
    }

//    @RequestMapping(value = "/ljy", method = RequestMethod.GET)
//    public String ljy(String username, String password, String email) {
//        System.out.println(username+" "+password+" "+email);
//        return "ljy";
//    }

    @RequestMapping(value = "/ljy1", method = RequestMethod.GET)
    public String ljy(User user) {
        System.out.println(user.toString());
        return "ljy";
    }

    //用于测试转发的功能，地址栏没有变化
    @RequestMapping("/testForward")
    public String testForward() {
        return "forward:/hello";
    }

    //用于测试重定向，重定向的地址栏会有变化，是两次请求
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        return "redirect:/hello";
    }
}
