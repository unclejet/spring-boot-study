package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/16 下午4:30
 * @description：
 */
@SpringBootApplication
public class ScGatewayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("host_route", r -> r.host("**.baidu.com:8886")
                        .uri("http://126.com"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ScGatewayApplication.class, args);
    }
}
