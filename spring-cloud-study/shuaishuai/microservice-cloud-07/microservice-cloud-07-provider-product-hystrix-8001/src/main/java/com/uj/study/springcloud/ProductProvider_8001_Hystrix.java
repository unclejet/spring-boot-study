package com.uj.study.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/21 上午9:40
 * @description：
 */
@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.uj.study.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }
}
