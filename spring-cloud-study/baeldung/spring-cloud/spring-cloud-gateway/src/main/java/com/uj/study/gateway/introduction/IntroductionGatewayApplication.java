package com.uj.study.gateway.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/10/11 下午4:07
 * @description：
 */
@SpringBootApplication
@PropertySource("classpath:introduction-application.properties")
public class IntroductionGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionGatewayApplication.class, args);
    }

}
