package com.uj.study.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/10/11 上午9:46
 * @description：
 */
@Configuration
@EnableApolloConfig(value = "application", order = 10)
public class AppConfig {
}
