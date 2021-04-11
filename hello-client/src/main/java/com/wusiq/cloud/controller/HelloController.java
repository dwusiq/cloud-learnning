package com.wusiq.cloud.controller;

import com.wusiq.cloud.manager.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping(value = "/")
    public String getHello() {
        String restResponse = helloFeignClient.getHello();
        System.out.println("restResponse:" + restResponse);
        return restResponse;
    }

    @GetMapping(value = "/name")
    public String getHello(@RequestParam(name = "userName") String userName) {
        String restResponse = helloFeignClient.getHello(userName);
        System.out.println("restResponse:" + restResponse);
        return restResponse;
    }
}
