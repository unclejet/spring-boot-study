package com.uj.study.service.impl;

import com.uj.study.service.IUserService;
import com.uj.study.service.dataservice.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/8 上午9:19
 * @description：
 */
@Component
public class UserService implements IUserService {

    @Autowired
    private DataService dataService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getDefaultUser() {
        return dataService.getDefaultUser();
    }

    @Override
    public String getContextUserId() {
        return dataService.getContextUserId();
    }

    @Override
    public List<String> getProviderData() {
        List<String> result = restTemplate.getForObject("http://sc-data-service/getProviderData", List.class);
        return result;
    }
}
