package com.uj.study.boot.daos;

import com.uj.study.boot.domain.Bar;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:33
 * @description：
 */
public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
