package com.pkc.mpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pkc
 * @description
 * @date 2020/5/30 10:44
 */
@Controller
//@RequestMapping("/")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "helloworld";
    }
}
