package com.qingguatang.java5minute.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWord {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){

        String message = "hello,word";
        return message;
    }
}
