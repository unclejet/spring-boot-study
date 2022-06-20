package com.uj.study.boot.services.impl;

import com.google.common.collect.Lists;
import com.uj.study.boot.daos.IFooDao;
import com.uj.study.boot.domain.Foo;
import com.uj.study.boot.services.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:39
 * @description：
 */
@Service
@Transactional
public class FooService extends AbstractService<Foo> implements IFooService {

    @Autowired
    private IFooDao dao;

    public FooService() {
        super();
    }

    // API

    @Override
    protected PagingAndSortingRepository<Foo, Long> getDao() {
        return dao;
    }

    // custom methods

    @Override
    public Foo retrieveByName(final String name) {
        return dao.retrieveByName(name);
    }

    // overridden to be secured

    @Override
    @Transactional(readOnly = true)
    public List<Foo> findAll() {
        return Lists.newArrayList(getDao().findAll());
    }

    @Override
    public Page<Foo> findPaginated(Pageable pageable) {
        return dao.findAll(pageable);
    }

}

