package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/16 下午4:10
 * @description：
 */
@SpringBootApplication
public class SpringCloudGatewayApplication {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("header_route", r -> r.header("X-Request-Id", "xujin")
//                        .uri("http://localhost:8071/test/head"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }
}
