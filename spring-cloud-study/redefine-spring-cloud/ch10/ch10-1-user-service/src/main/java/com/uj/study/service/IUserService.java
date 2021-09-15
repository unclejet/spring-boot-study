package com.uj.study.service;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/8 上午9:18
 * @description：
 */
public interface IUserService {
    public String getDefaultUser();
    public String getContextUserId();
    public List<String> getProviderData();
}

