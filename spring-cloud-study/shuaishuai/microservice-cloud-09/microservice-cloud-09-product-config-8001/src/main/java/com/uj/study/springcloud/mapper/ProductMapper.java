package com.uj.study.springcloud.mapper;

import com.uj.study.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/26 上午9:23
 * @description：
 */
@Mapper
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
