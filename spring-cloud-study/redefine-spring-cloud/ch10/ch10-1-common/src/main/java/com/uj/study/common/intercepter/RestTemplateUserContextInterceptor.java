package com.uj.study.common.intercepter;

import com.uj.study.common.context.UserContextHolder;
import com.uj.study.common.user.User;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.Map;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/6 上午9:30
 * @description：
 */
public class RestTemplateUserContextInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        User user = UserContextHolder.currentUser();
        Map<String, String> headers = user.toHttpHeaders();
        for (Map.Entry<String, String> header : headers.entrySet()) {
            request.getHeaders().add(header.getKey(), header.getValue());
        }
        // 调用
        return execution.execute(request, body);
    }
}
