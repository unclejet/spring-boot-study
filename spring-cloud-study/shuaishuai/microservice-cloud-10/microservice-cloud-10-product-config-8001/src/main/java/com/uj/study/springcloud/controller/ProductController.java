package com.uj.study.springcloud.controller;

import com.uj.study.springcloud.entities.Product;
import com.uj.study.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/27 上午9:54
 * @description：
 */
@RefreshScope //刷新配置
@RestController
public class ProductController {

    @Value("${emp.name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return name;
    }

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
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
