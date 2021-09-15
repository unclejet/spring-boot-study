package com.uj.study.groovy

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.exception.ZuulException

import com.netflix.zuul.context.RequestContext

import javax.servlet.http.HttpServletRequest

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/6/3 上午9:12
 * @description ：
 */
class GroovyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return PRE_TYPE
    }

    @Override
    public int filterOrder() {
        return 10
    }

    @Override
    public boolean shouldFilter() {
        return true
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.currentContext.request as HttpServletRequest
        Iterator headerIt = request.getHeaderNames().iterator()
        while (headerIt.hasNext()) {
            String name = (String) headerIt.next()
            String value = request.getHeader(name)
            println("header: " + name + ":" + value)
        }
        println("This is Groovy Filter!")
        return null
    }
}
