package com.uj.study.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/10 上午9:06
 * @description：
 */
@Configuration //标识配置类
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
