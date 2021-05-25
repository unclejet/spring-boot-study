package com.uj.study.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/20 上午10:15
 * @description：
 */
public interface IHelloService {
    public String hello(Integer id);
    public String getUserToCommandKey(@CacheKey Integer id);
    public String updateUser(@CacheKey Integer id);
}

