package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/12 下午3:56
 * @description：
 */
@SpringBootApplication
public class SCGatewayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //生成比当前时间早一个小时的UTC时间
        ZonedDateTime minusTime = LocalDateTime.now().plusHours(1).atZone(ZoneId.systemDefault());
        System.out.println("jet111");
        System.out.println(minusTime);
        return builder.routes()
                .route("after_route", r -> r.after(minusTime)
                        .uri("http://126.com"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApplication.class, args);
    }
}
