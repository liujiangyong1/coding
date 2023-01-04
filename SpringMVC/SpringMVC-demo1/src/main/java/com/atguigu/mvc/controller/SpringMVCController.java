package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/13 9:45
 * @Description:
 */
@Controller
public class SpringMVCController {

    @RequestMapping("/")
    public String springMVC(){
        //返回视图名称
        return "index";
    }
}
