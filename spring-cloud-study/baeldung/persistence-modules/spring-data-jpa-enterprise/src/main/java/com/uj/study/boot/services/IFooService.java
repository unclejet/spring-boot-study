package com.uj.study.boot.services;

import com.uj.study.boot.domain.Foo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:39
 * @description：
 */
public interface IFooService extends IOperations<Foo> {

    Foo retrieveByName(String name);

    Page<Foo> findPaginated(Pageable pageable);

}
