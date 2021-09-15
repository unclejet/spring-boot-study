package com.uj.study.service.fallback;

import com.uj.study.service.dataservice.DataService;
import org.springframework.stereotype.Component;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/8 上午9:20
 * @description：
 */
@Component
public class UserClientFallback implements DataService {

    @Override
    public String getDefaultUser() {
        return new String("get getDefaultUser failed");
    }
    @Override
    public String getContextUserId() {
        return new String("get getContextUserId failed");
    }

}
