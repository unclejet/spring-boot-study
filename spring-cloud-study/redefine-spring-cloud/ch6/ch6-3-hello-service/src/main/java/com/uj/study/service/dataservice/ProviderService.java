package com.uj.study.service.dataservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/17 上午9:12
 * @description：
 */
@FeignClient(name = "sc-provider-service")
public interface ProviderService {

    @RequestMapping(value = "/getDashboard", method = RequestMethod.GET)
    public List<String> getProviderData();
}
