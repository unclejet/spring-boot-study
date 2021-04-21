package com.uj.study.springcloud.controller;

import com.uj.study.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uj.study.springcloud.service.ProductService;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/9 上午11:13
 * @description：
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method =  RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }
}
