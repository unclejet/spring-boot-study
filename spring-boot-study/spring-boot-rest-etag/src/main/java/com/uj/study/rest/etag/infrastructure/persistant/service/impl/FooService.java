package com.uj.study.rest.etag.infrastructure.persistant.service.impl;

import com.google.common.collect.Lists;
import com.uj.study.rest.etag.infrastructure.persistant.dao.IFooDao;
import com.uj.study.rest.etag.infrastructure.persistant.model.Foo;
import com.uj.study.rest.etag.infrastructure.persistant.service.AbstractService;
import com.uj.study.rest.etag.infrastructure.persistant.service.IFooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public Page<Foo> findPaginated(Pageable pageable) {
        return dao.findAll(pageable);
    }
    
    // overridden to be secured

    @Override
    @Transactional(readOnly = true)
    public List<Foo> findAll() {
        return Lists.newArrayList(getDao().findAll());
    }

}
