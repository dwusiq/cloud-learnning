package com.wusiq.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 路由配置
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // 可以有多个route
                .route("route_hello_client",
                        p -> p.path("/api/hello/**")//转发以/api/hello开头的请求
                                .filters(f -> f.stripPrefix(1)) //截取掉路径中第一个字符串
                                //请求转发到hello-client服务，
                                // 第一种：ws(websocket)方式: uri: ws://localhost:9000;
                                // 第二种：http方式: uri: http://localhost:8130/
                                // 第三种：lb(注册中心中服务名字)方式: uri: lb://brilliance-consumer
                                .uri("lb://hello-client"))
                .build();
    }
}
