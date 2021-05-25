package com.uj.study.hystrix.service;

import com.uj.study.provider.model.Animal;

import java.util.concurrent.Future;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/21 上午9:46
 * @description：
 */
public interface ICollapsingService {
    public Future<Animal> collapsing(Integer id);
    public Animal collapsingSyn(Integer id);
    public Future<Animal> collapsingGlobal(Integer id);

}
