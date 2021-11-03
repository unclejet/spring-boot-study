package com.uj.study.interceptor;

import com.uj.study.vo.User;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:24
 * @description：
 */
public class RestTemplateUserContextInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        User user = UserContextHolder.currentUser();
        request.getHeaders().add("x-user-id",user.getUserId());
        request.getHeaders().add("x-user-name",user.getUserName());
        request.getHeaders().add("x-user-serviceName",request.getURI().getHost());
        return execution.execute(request, body);
    }
}
