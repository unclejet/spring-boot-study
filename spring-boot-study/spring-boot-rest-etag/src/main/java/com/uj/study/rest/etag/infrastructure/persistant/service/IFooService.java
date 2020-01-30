package com.uj.study.rest.etag.infrastructure.persistant.service;

import com.uj.study.rest.etag.infrastructure.persistant.IOperations;
import com.uj.study.rest.etag.infrastructure.persistant.model.Foo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFooService extends IOperations<Foo> {
    Page<Foo> findPaginated(Pageable pageable);
}
