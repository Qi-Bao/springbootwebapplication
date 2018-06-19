package com.kageruo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "Holle Kageruo";
    }

    @RequestMapping("/success")
    //通过thymeleaf引擎自动渲染templates/下的对应success.html文件，名称对应。
    public  String success(Map<String,Object> map){
        map.put("hello","您好！");
        return "success";
    }
}
