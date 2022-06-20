package com.uj.study.boot.daos;

import com.uj.study.boot.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:33
 * @description：
 */
public interface IFooDao extends JpaRepository<Foo, Long> {

    @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
    Foo retrieveByName(@Param("name") String name);
}
