package com.uj.study.service.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/18 上午9:32
 * @description：
 */
public class PSFallbackBadRequestExpcetion extends HystrixCommand<String> {
//    private static Logger log = (Logger) LoggerFactory.getLogger(PSFallbackBadRequestExpcetion.class);

    public PSFallbackBadRequestExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBRE"));
    }

    @Override
    protected String run() throws Exception {
        throw new HystrixBadRequestException("HystrixBadRequestException error");
    }

    @Override
    protected String getFallback() {
        System.out.println(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method:  ";
    }


}

