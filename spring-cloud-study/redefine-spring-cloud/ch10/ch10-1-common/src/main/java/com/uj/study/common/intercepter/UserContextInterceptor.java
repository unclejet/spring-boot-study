package com.uj.study.common.intercepter;

import com.uj.study.common.context.UserContextHolder;
import com.uj.study.common.user.User;
import com.uj.study.common.util.HttpConvertUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/6 上午9:19
 * @description：
 */
public class UserContextInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(UserContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2) throws Exception {
        User user = new User(HttpConvertUtil.httpRequestToMap(request));
        if(StringUtils.isEmpty(user.getUserId()) && StringUtils.isEmpty(user.getUserName())) {
            log.error("the user is null, please access from gateway or check user info");
            return false;
        }
        UserContextHolder.set(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2, ModelAndView arg3)
            throws Exception {
        // DOING NOTHING
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object arg2, Exception arg3)
            throws Exception {
        UserContextHolder.shutdown();
    }



}
