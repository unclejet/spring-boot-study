package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:53
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static  void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public ServerCodecConfigurer serverCodecConfigurer() {
        return ServerCodecConfigurer.create();
    }



}

