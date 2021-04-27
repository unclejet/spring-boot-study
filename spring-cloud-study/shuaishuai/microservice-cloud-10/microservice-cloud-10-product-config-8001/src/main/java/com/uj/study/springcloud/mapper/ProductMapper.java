package com.uj.study.springcloud.mapper;

import com.uj.study.springcloud.entities.Product;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/27 上午9:52
 * @description：
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
