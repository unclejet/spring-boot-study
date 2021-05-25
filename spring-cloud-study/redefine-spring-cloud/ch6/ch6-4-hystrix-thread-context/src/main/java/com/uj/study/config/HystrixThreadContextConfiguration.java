package com.uj.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/24 上午9:47
 * @description：
 */
@Configuration
public class HystrixThreadContextConfiguration {
    @Bean
    public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy() {
        return new SpringCloudHystrixConcurrencyStrategy();
    }
}
