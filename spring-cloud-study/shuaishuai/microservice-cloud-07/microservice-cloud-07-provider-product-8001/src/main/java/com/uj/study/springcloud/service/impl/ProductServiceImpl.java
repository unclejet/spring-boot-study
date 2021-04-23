package com.uj.study.springcloud.service.impl;

import com.uj.study.springcloud.entities.Product;
import com.uj.study.springcloud.mapper.ProductMapper;
import com.uj.study.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/9 上午11:08
 * @description：
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
