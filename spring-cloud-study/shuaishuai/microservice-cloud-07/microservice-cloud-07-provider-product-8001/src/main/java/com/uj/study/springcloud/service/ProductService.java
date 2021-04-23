package com.uj.study.springcloud.service;

import com.uj.study.springcloud.entities.Product;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/9 上午11:07
 * @description：
 */
public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
