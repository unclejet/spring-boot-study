package com.uj.study.service.dataservice;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import feign.Util;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/18 上午9:38
 * @description：
 */
@Component
public class FeignErrorDecoder implements feign.codec.ErrorDecoder{

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            if (response.status() >= 400 && response.status() <= 499) {
                String error = Util.toString(response.body().asReader());
                return new HystrixBadRequestException(error);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return feign.FeignException.errorStatus(methodKey, response);
    }

}
