package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/6 上午9:06
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch35EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch35EurekaServerApplication.class, args);
    }
}
