package com.uj.study.service.impl;

import com.uj.study.service.IHelloService;
import com.uj.study.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/17 上午9:11
 * @description：
 */
@Component
public class HelloService implements IHelloService {

    @Autowired
    private ProviderService dataService;

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }

}
