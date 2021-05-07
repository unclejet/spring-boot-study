package com.uj.study.config;

import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import feign.form.spring.SpringFormEncoder;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/7 上午9:22
 * @description：
 */
@Configuration
public class FeignMultipartSupportConfig {

    @Bean
    @Primary
    @Scope("prototype")
    public Encoder multipartFormEncoder() {
        return new SpringFormEncoder();
    }
}
