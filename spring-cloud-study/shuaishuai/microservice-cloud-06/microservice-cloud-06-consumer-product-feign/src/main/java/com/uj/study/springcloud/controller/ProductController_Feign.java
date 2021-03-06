package com.uj.study.springcloud.controller;

import com.uj.study.springcloud.entities.Product;
import com.uj.study.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/20 上午8:47
 * @description：
 */
@RestController
public class ProductController_Feign {
    @Autowired
    ProductClientService service;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }

}
