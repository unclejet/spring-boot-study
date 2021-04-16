package com.uj.study.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/15 上午8:53
 * @description：
 */
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.uj.study.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
