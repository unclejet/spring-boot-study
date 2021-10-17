package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: UncleJet
 * @date: Created in 2021/10/16 10:55
 * @description:
 */
@PropertySource("classpath:introduction-application.properties")
public class IntroductionGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionGatewayApplication.class, args);
    }

}
