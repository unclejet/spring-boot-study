package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/16 下午5:22
 * @description：
 */
@SpringBootApplication
public class SpringCloudGatewayApplication {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("remoteaddr_route", r -> r.remoteAddr("127.0.0.1")
//                        .uri("http://baidu.com"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }
}
