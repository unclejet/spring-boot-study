package com.uj.study.config;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/20 上午10:13
 * @description：
 */
public class CacheContextInterceptor implements HandlerInterceptor {

    private HystrixRequestContext context;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2) throws Exception {
        context = HystrixRequestContext.initializeContext();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2, ModelAndView arg3)
            throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object arg2, Exception arg3)
            throws Exception {
        context.shutdown();
    }

}
