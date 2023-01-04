package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/23 21:32
 * @Description:
 */

@Controller
public class JSPController {

    //测试jsp页面
    @RequestMapping("/")
    public String testJsp(){
        return "index";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/testredirect")
    public String testredirect(){
        return "redirect:/success";
    }

    @RequestMapping("/testforward")
    public String testforward(){
        return "forward:/success";
    }

}
