package com.uj.study.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/9 上午11:15
 * @description：
 */
@MapperScan("com.uj.study.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }
}
