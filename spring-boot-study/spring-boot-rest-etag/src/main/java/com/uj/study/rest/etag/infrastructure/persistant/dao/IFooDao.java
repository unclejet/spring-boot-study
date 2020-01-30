package com.uj.study.rest.etag.infrastructure.persistant.dao;

import com.uj.study.rest.etag.infrastructure.persistant.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFooDao extends JpaRepository<Foo, Long> {
    
}
