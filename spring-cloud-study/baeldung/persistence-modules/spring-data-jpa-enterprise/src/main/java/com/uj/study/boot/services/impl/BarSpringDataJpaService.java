package com.uj.study.boot.services.impl;

import com.uj.study.boot.daos.IBarCrudRepository;
import com.uj.study.boot.domain.Bar;
import com.uj.study.boot.services.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:43
 * @description：
 */
public class BarSpringDataJpaService extends AbstractSpringDataJpaService<Bar> implements IBarService {

    @Autowired
    private IBarCrudRepository dao;

    public BarSpringDataJpaService() {
        super();
    }

    @Override
    protected CrudRepository<Bar, Serializable> getDao() {
        return dao;
    }

    @Override
    public Page<Bar> findPaginated(int page, int size) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
