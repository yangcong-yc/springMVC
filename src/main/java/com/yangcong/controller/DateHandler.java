package com.yangcong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName DateHandler
 * @Description TODO
 * @date 2023/7/5 16:22
 * @Version 1.0
 */
@RestController
@RequestMapping("/date")
public class DateHandler {



    @GetMapping("getDate")
    @ResponseBody
    public Date getDate(Date date){
        return date;
    }
}
