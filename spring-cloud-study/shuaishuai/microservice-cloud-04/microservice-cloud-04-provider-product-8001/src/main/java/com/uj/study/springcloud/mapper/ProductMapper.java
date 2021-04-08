package com.uj.study.springcloud.mapper;


import com.uj.study.springcloud.entities.Product;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/9 上午11:02
 * @description：
 */
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
