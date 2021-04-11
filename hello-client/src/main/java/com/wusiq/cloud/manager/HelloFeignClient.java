package com.wusiq.cloud.manager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "hello-server")
public interface HelloFeignClient {
    @GetMapping(value = "/hello/")
    String getHello();

    @GetMapping(value = "/hello/name")
    String getHello(@RequestParam(name = "userName") String userName);
}
