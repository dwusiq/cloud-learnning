package com.wusiq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServerApplication.class, args);
    }
}
