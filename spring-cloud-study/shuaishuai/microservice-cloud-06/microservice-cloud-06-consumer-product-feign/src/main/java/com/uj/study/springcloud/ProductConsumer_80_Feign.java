package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/16 上午9:17
 * @description：
 */
//会扫描指定包下面使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.uj.study.springcloud.service")
@EnableEurekaClient //标识 是一个Eureka客户端
@SpringBootApplication
public class ProductConsumer_80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
    }
}
