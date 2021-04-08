package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/6 上午9:14
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
public class Ch35EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch35EurekaClientApplication.class, args);
    }
}
