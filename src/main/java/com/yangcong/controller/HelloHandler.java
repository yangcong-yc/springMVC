package com.yangcong.controller;

import com.yangcong.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName HelloHandler
 * @Description TODO
 * @date 2023/6/5 15:28
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {


    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(Integer id , String name){
        System.err.println("接收到请求参数id="+id+",name="+name);
        //返回逻辑试图
        return "index";
    }

    @RequestMapping("cookie")
    public String getCookie(@CookieValue("JSESSIONID") String serrionId){
        System.err.println(serrionId);
        return "index";
    }

    @PostMapping("add")
    public String addUser(User user){
        System.err.println(user);
        return "index";
    }




}
