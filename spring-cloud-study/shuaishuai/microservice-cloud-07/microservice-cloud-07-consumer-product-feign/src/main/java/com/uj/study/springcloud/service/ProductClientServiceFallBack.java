package com.uj.study.springcloud.service;

import com.uj.study.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/22 上午8:56
 * @description：
 */
//Caused by: java.lang.IllegalStateException: No fallback instance of type class com.mengxuegu.springcloud.service.ProductClientServiceFallBack found for feign client microservice-product
@Component //一定要加上它,将它纳入到容器中
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--@feignclient&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
