package com.wusiq.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping(value = "/")
    public String getHello() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping(value = "/name")
    public String getHello(@RequestParam(name = "userName") String userName) {
        String result = String.format("hello %s", userName);
        System.out.println(result);
        return result;
    }
}
