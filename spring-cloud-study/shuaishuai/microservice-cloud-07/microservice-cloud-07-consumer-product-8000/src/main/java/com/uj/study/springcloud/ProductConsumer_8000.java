package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/21 上午9:53
 * @description：
 */
@EnableEurekaClient //标识 是一个Eureka客户端
@SpringBootApplication
public class ProductConsumer_8000 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_8000.class, args);
    }

}
